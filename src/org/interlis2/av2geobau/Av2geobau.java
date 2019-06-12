package org.interlis2.av2geobau;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;

import org.interlis2.av2geobau.impl.DxfWriter;
import org.interlis2.av2geobau.impl.DxfUtil;
import org.interlis2.av2geobau.impl.Mapper;

import ch.ehi.basics.logging.AbstractStdListener;
import ch.ehi.basics.logging.EhiLogger;
import ch.ehi.basics.logging.StdListener;
import ch.ehi.basics.settings.Settings;
import ch.interlis.ili2c.Ili2cException;
import ch.interlis.ili2c.Ili2cFailure;
import ch.interlis.ili2c.gui.UserSettings;
import ch.interlis.ili2c.metamodel.TransferDescription;
import ch.interlis.iom.IomObject;
import ch.interlis.iom_j.itf.ItfReader2;
import ch.interlis.iox.EndTransferEvent;
import ch.interlis.iox.IoxEvent;
import ch.interlis.iox.IoxException;
import ch.interlis.iox.ObjectEvent;
import ch.interlis.iox_j.logging.FileLogger;
import ch.interlis.iox_j.logging.StdLogger;
import ch.interlis.iox_j.statistics.IoxStatistics;
import ch.interlis.iox_j.validator.ValidationConfig;


public class Av2geobau {
	
	public static boolean convert(
			File itfFile,
			File dxfFile,
			Settings settings
		) {
		return new Av2geobau().doConversion(itfFile,dxfFile,settings);
	}
	/** main workhorse function.
	 */
	public boolean doConversion(
            File itfFile,
            File dxfFile,
            Settings settings
		) {
		if(itfFile==null){
			EhiLogger.logError("no ITF file given");
			return false;
		}
        if(dxfFile==null){
            EhiLogger.logError("no DXF file given");
            return false;
        }
		if(settings==null){
			settings=new Settings();
		}
	    String logFilename=settings.getValue(Av2geobau.SETTING_LOGFILE);
		FileLogger logfile=null;
		AbstractStdListener logStderr=null;
		boolean ret=false;
		try{
			// setup logging of conversion results
			if(logFilename!=null){
				logfile=new FileLogger(new java.io.File(logFilename));
				EhiLogger.getInstance().addListener(logfile);
			}
            logStderr=new StdLogger(logFilename);
            EhiLogger.getInstance().addListener(logStderr);
            EhiLogger.getInstance().removeListener(StdListener.getInstance());
		    String configFilename=settings.getValue(Av2geobau.SETTING_CONFIGFILE);
		    String appHome=settings.getValue(Av2geobau.SETTING_APPHOME);
		    		    
		    // give user important info (such as input files or program version)
			EhiLogger.logState(Main.APP_NAME+"-"+Main.getVersion());
			EhiLogger.logState("ili2c-"+ch.interlis.ili2c.Ili2c.getVersion());
			EhiLogger.logState("iox-ili-"+ch.interlis.iox_j.IoxUtility.getVersion());
			EhiLogger.logState("maxMemory "+java.lang.Runtime.getRuntime().maxMemory()/1024L+" KB");
			EhiLogger.logState("itfFile <"+itfFile.getPath()+">");
            EhiLogger.logState("dxfFile <"+dxfFile.getPath()+">");
			if(configFilename!=null){
				EhiLogger.logState("configFile <"+configFilename+">");
			}
		
			TransferDescription td=null;
			
			// read ili models
			td=compileIli("DM01AVCH24LV95D", null,itfFile.getAbsoluteFile().getParentFile().getAbsolutePath(),appHome, settings);
			if(td==null){
				return false;
			}
			
			// process data files
			EhiLogger.logState("convert data...");
			IoxStatistics statistics=null;
			try{
				// setup log output
				

	            
 				statistics=new IoxStatistics(td,settings);
                // setup data reader (ITF or XTF)
                ItfReader2 ioxReader=new ItfReader2(itfFile,true);
                ioxReader.setModel(td);
                statistics.setFilename(itfFile.getPath());
                java.io.Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dxfFile), "ISO-8859-1")); 
                Mapper itf2dxf=new Mapper();
                
                try{
                    writeBlocks(fw);
                    fw.write(DxfUtil.toString(0, "SECTION"));
                    fw.write(DxfUtil.toString(2, "ENTITIES"));
                    IoxEvent event=null;
                    do{
                        event=ioxReader.read();
                        statistics.add(event);
                        itf2dxf.addInput(event);
                        if(event instanceof ObjectEvent) {
                            IomObject iomObjDxf=itf2dxf.getMappedObject();
                            while(iomObjDxf!=null) {
                                String dxfFragment=DxfWriter.feature2Dxf(iomObjDxf);
                                fw.write(dxfFragment);
                                iomObjDxf=itf2dxf.getMappedObject();
                            }
                        }
                    }while(!(event instanceof EndTransferEvent));
                    IomObject iomObjDxf=itf2dxf.getMappedObject();
                    while(iomObjDxf!=null) {
                        String dxfFragment=DxfWriter.feature2Dxf(iomObjDxf);
                        fw.write(dxfFragment);
                        iomObjDxf=itf2dxf.getMappedObject();
                    }
                    fw.write(DxfUtil.toString(0, "ENDSEC"));
                    fw.write(DxfUtil.toString(0, "EOF"));
                }finally{
                    if(ioxReader!=null){
                        try {
                            ioxReader.close();
                        } catch (IoxException e) {
                            EhiLogger.logError(e);
                        }
                        ioxReader=null;
                    }
                    if(itf2dxf!=null){
                        itf2dxf.close();
                        itf2dxf=null;
                    }
                    if(fw!=null) {
                        fw.close();
                        fw=null;
                    }
                }
				statistics.write2logger();
				// check for errors
				if(logStderr.hasSeenErrors()){
					EhiLogger.logState("...conversion failed");
				}else{
					EhiLogger.logState("...conversion done");
					ret=true;
				}
			}catch(Throwable ex){
				if(statistics!=null) {
					statistics.write2logger();
				}
				EhiLogger.logError(ex);
				EhiLogger.logState("...conversion failed");
			}
		}finally{
			if(logfile!=null){
				logfile.close();
				EhiLogger.getInstance().removeListener(logfile);
				logfile=null;
			}
			if(logStderr!=null){
				EhiLogger.getInstance().addListener(StdListener.getInstance());
				EhiLogger.getInstance().removeListener(logStderr);
				logStderr=null;
			}
		}
		return ret;
	}

    private void writeBlocks(java.io.Writer fw) throws IOException {
        // BLOCK (Symbole)             
        fw.write(DxfUtil.toString(0, "SECTION"));
        fw.write(DxfUtil.toString(2, "BLOCKS"));
        
        // GP Bolzen                
        fw.write(DxfUtil.toString(0, "BLOCK"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(70, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(2, "GPBOL"));
        fw.write(DxfUtil.toString(0, "CIRCLE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(40, "0.5"));
        fw.write(DxfUtil.toString(0, "ENDBLK"));
        fw.write(DxfUtil.toString(8, "0")); 
        
        // GP Rohr                
        fw.write(DxfUtil.toString(0, "BLOCK"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(70, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(2, "GPROH"));
        fw.write(DxfUtil.toString(0, "CIRCLE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(40, "0.5"));
        fw.write(DxfUtil.toString(0, "ENDBLK"));
        fw.write(DxfUtil.toString(8, "0"));   

        // GP Pfahl                
        fw.write(DxfUtil.toString(0, "BLOCK"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(70, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(2, "GPPFA"));
        fw.write(DxfUtil.toString(0, "CIRCLE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(40, "0.5"));
        fw.write(DxfUtil.toString(0, "ENDBLK"));
        fw.write(DxfUtil.toString(8, "0"));     
        
        // GP unversichert
        fw.write(DxfUtil.toString(0, "BLOCK"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(70, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(2, "GPUV"));
        fw.write(DxfUtil.toString(0, "CIRCLE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(40, "0.1"));
        fw.write(DxfUtil.toString(0, "ENDBLK"));
        fw.write(DxfUtil.toString(8, "0"));

        // GP Markstein
        fw.write(DxfUtil.toString(0, "BLOCK"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(70, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(2, "GPSTE"));
        fw.write(DxfUtil.toString(0, "CIRCLE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(40, "0.7"));
        fw.write(DxfUtil.toString(0, "ENDBLK"));
        fw.write(DxfUtil.toString(8, "0"));   
        
        // GP Kunststoff
        fw.write(DxfUtil.toString(0, "BLOCK"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(70, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(2, "GPKST"));
        fw.write(DxfUtil.toString(0, "CIRCLE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(40, "0.7"));
        fw.write(DxfUtil.toString(0, "ENDBLK"));
        fw.write(DxfUtil.toString(8, "0"));   

        // GP Kreuz
        fw.write(DxfUtil.toString(0, "BLOCK"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(70, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(2, "GPKRZ"));
        fw.write(DxfUtil.toString(0, "CIRCLE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(40, "0.5"));
        fw.write(DxfUtil.toString(0, "LINE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "-0.849"));
        fw.write(DxfUtil.toString(20, "-0.849"));
        fw.write(DxfUtil.toString(30, "0.000"));
        fw.write(DxfUtil.toString(11, "-0.283"));
        fw.write(DxfUtil.toString(21, "-0.283"));
        fw.write(DxfUtil.toString(31, "0.000"));
        fw.write(DxfUtil.toString(0, "LINE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "-0.284"));
        fw.write(DxfUtil.toString(20, "0.284"));
        fw.write(DxfUtil.toString(30, "0.000"));
        fw.write(DxfUtil.toString(11, "-0.849"));
        fw.write(DxfUtil.toString(21, "0.849"));
        fw.write(DxfUtil.toString(31, "0.000"));
        fw.write(DxfUtil.toString(0, "LINE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.283"));
        fw.write(DxfUtil.toString(20, "0.283"));
        fw.write(DxfUtil.toString(30, "0.000"));
        fw.write(DxfUtil.toString(11, "0.849"));
        fw.write(DxfUtil.toString(21, "0.849"));
        fw.write(DxfUtil.toString(31, "0.000"));
        fw.write(DxfUtil.toString(0, "LINE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.849"));
        fw.write(DxfUtil.toString(20, "-0.849"));
        fw.write(DxfUtil.toString(30, "0.000"));
        fw.write(DxfUtil.toString(11, "0.283"));
        fw.write(DxfUtil.toString(21, "-0.283"));
        fw.write(DxfUtil.toString(31, "0.000"));
        fw.write(DxfUtil.toString(0, "ENDBLK"));
        fw.write(DxfUtil.toString(8, "0"));   
        
        // HGP
        fw.write(DxfUtil.toString(0, "BLOCK"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(70, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(2, "HGP"));
        fw.write(DxfUtil.toString(0, "CIRCLE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(40, "1.5"));
        fw.write(DxfUtil.toString(0, "ENDBLK"));
        fw.write(DxfUtil.toString(8, "0"));   

        
        // LFP1 
        fw.write(DxfUtil.toString(0, "BLOCK"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(70, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(2, "LFP1"));
        fw.write(DxfUtil.toString(0, "CIRCLE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(40, "0.8"));
        fw.write(DxfUtil.toString(0, "CIRCLE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(40, "1.3"));
        fw.write(DxfUtil.toString(0, "ENDBLK")); 
        fw.write(DxfUtil.toString(8, "0"));    
        
        // LFP2 
        fw.write(DxfUtil.toString(0, "BLOCK"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(70, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(2, "LFP2"));
        fw.write(DxfUtil.toString(0, "CIRCLE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(40, "0.8"));
        fw.write(DxfUtil.toString(0, "CIRCLE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(40, "1.3"));
        fw.write(DxfUtil.toString(0, "ENDBLK")); 
        fw.write(DxfUtil.toString(8, "0"));  

        // HFP1
        fw.write(DxfUtil.toString(0, "BLOCK"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(70, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(2, "HFP1"));
        fw.write(DxfUtil.toString(0, "CIRCLE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(40, "1.0"));
        fw.write(DxfUtil.toString(0, "ENDBLK")); 
        fw.write(DxfUtil.toString(8, "0")); 
        
        // HFP2
        fw.write(DxfUtil.toString(0, "BLOCK"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(70, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(2, "HFP2"));
        fw.write(DxfUtil.toString(0, "CIRCLE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(40, "1.0"));
        fw.write(DxfUtil.toString(0, "ENDBLK")); 
        fw.write(DxfUtil.toString(8, "0")); 
        
        // HFP3
        fw.write(DxfUtil.toString(0, "BLOCK"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(70, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(2, "HFP3"));
        fw.write(DxfUtil.toString(0, "CIRCLE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(40, "1.0"));
        fw.write(DxfUtil.toString(0, "ENDBLK")); 
        fw.write(DxfUtil.toString(8, "0")); 
        
        // LFP3 Stein
        fw.write(DxfUtil.toString(0, "BLOCK"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(70, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(2, "LFP3ST"));
        fw.write(DxfUtil.toString(0, "CIRCLE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(40, "0.8"));
        fw.write(DxfUtil.toString(0, "CIRCLE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(40, "1.3"));
        fw.write(DxfUtil.toString(0, "ENDBLK")); 
        fw.write(DxfUtil.toString(8, "0")); 
        
        // LFP3 Bolzen
        fw.write(DxfUtil.toString(0, "BLOCK"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(70, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(2, "LFP3BO"));
        fw.write(DxfUtil.toString(0, "CIRCLE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(40, "1.0"));
        fw.write(DxfUtil.toString(0, "ENDBLK")); 
        fw.write(DxfUtil.toString(8, "0")); 
        
        // LFP3 uv
        fw.write(DxfUtil.toString(0, "BLOCK"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(70, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(2, "LFP3UV"));
        fw.write(DxfUtil.toString(0, "CIRCLE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(40, "0.3"));
        fw.write(DxfUtil.toString(0, "ENDBLK")); 
        fw.write(DxfUtil.toString(8, "0")); 
        
        // LFP3 Kreuz
        fw.write(DxfUtil.toString(0, "BLOCK"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(70, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(2, "LFP3KR"));
        fw.write(DxfUtil.toString(0, "CIRCLE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(40, "0.4"));
        fw.write(DxfUtil.toString(0, "LINE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "-0.849"));
        fw.write(DxfUtil.toString(20, "-0.849"));
        fw.write(DxfUtil.toString(30, "0.000"));
        fw.write(DxfUtil.toString(11, "-0.283"));
        fw.write(DxfUtil.toString(21, "-0.283"));
        fw.write(DxfUtil.toString(31, "0.000"));
        fw.write(DxfUtil.toString(0, "LINE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "-0.284"));
        fw.write(DxfUtil.toString(20, "0.284"));
        fw.write(DxfUtil.toString(30, "0.000"));
        fw.write(DxfUtil.toString(11, "-0.849"));
        fw.write(DxfUtil.toString(21, "0.849"));
        fw.write(DxfUtil.toString(31, "0.000"));
        fw.write(DxfUtil.toString(0, "LINE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.283"));
        fw.write(DxfUtil.toString(20, "0.283"));
        fw.write(DxfUtil.toString(30, "0.000"));
        fw.write(DxfUtil.toString(11, "0.849"));
        fw.write(DxfUtil.toString(21, "0.849"));
        fw.write(DxfUtil.toString(31, "0.000"));
        fw.write(DxfUtil.toString(0, "LINE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.849"));
        fw.write(DxfUtil.toString(20, "-0.849"));
        fw.write(DxfUtil.toString(30, "0.000"));
        fw.write(DxfUtil.toString(11, "0.283"));
        fw.write(DxfUtil.toString(21, "-0.283"));
        fw.write(DxfUtil.toString(31, "0.000"));
        fw.write(DxfUtil.toString(0, "CIRCLE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(40, "1.200667"));
        fw.write(DxfUtil.toString(0, "ENDBLK"));
        fw.write(DxfUtil.toString(8, "0")); 
        
        // EO Punkte
        fw.write(DxfUtil.toString(0, "BLOCK"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(70, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(2, "EOPNT"));
        fw.write(DxfUtil.toString(0, "CIRCLE"));
        fw.write(DxfUtil.toString(8, "0"));
        fw.write(DxfUtil.toString(10, "0.0"));
        fw.write(DxfUtil.toString(20, "0.0"));
        fw.write(DxfUtil.toString(30, "0.0"));
        fw.write(DxfUtil.toString(40, "0.4"));
        fw.write(DxfUtil.toString(0, "ENDBLK")); 
        fw.write(DxfUtil.toString(8, "0")); 

        fw.write(DxfUtil.toString(0, "ENDSEC"));
    }
    /** Compiles the required Interlis models.
	 * @param aclass Interlis qualified class name of a required class.
	 * @param ilifile Interlis model file to read. null if not known.
	 * @param itfDir Folder with Interlis model files or null.
	 * @param appHome Folder of program. Function will check in ilimodels sub-folder for Interlis models.
	 * @param settings Configuration of program.
	 * @return root object of java representation of Interlis model.
	 * @see #SETTING_ILIDIRS
	 */
	public static TransferDescription compileIli(String modelName,File ilifile,String itfDir,String appHome,Settings settings) {
		ArrayList modeldirv=new ArrayList();
		String ilidirs=settings.getValue(Av2geobau.SETTING_ILIDIRS);
		if(ilidirs==null){
			ilidirs=Av2geobau.SETTING_DEFAULT_ILIDIRS;
		}
	
		EhiLogger.logState("ilidirs <"+ilidirs+">");
		String modeldirs[]=ilidirs.split(";");
		HashSet ilifiledirs=new HashSet();
		for(int modeli=0;modeli<modeldirs.length;modeli++){
			String m=modeldirs[modeli];
			if(m.contains(Av2geobau.ITF_DIR)){
				m=m.replace(ITF_DIR, itfDir);
				if(m!=null && m.length()>0){
					if(!modeldirv.contains(m)){
						modeldirv.add(m);				
					}
				}
			}else if(m.contains(Av2geobau.JAR_DIR)){
				if(appHome!=null){
					m=m.replace(JAR_DIR,appHome);
					modeldirv.add(m);				
				}else {
					// ignore it
				}
			}else{
				if(m!=null && m.length()>0){
					modeldirv.add(m);				
				}
			}
		}		
		
		ch.interlis.ili2c.Main.setHttpProxySystemProperties(settings);
		TransferDescription td=null;
		ch.interlis.ili2c.config.Configuration ili2cConfig=null;
		if(ilifile!=null){
			//ili2cConfig=new ch.interlis.ili2c.config.Configuration();
			//ili2cConfig.addFileEntry(new ch.interlis.ili2c.config.FileEntry(ilifile.getPath(),ch.interlis.ili2c.config.FileEntryKind.ILIMODELFILE));				
	        // get/create repository manager
	        ch.interlis.ilirepository.IliManager repositoryManager = (ch.interlis.ilirepository.IliManager) settings
	                .getTransientObject(UserSettings.CUSTOM_ILI_MANAGER);
	        if(repositoryManager==null) {
	            repositoryManager=new ch.interlis.ilirepository.IliManager();
	            settings.setTransientObject(UserSettings.CUSTOM_ILI_MANAGER,repositoryManager);
	        }
			try {
				//ili2cConfig=ch.interlis.ili2c.ModelScan.getConfig(modeldirv, modelv);
				repositoryManager.setRepositories((String[])modeldirv.toArray(new String[]{}));
				ArrayList<String> ilifiles=new ArrayList<String>();
				ilifiles.add(ilifile.getPath());
				ili2cConfig=repositoryManager.getConfigWithFiles(ilifiles);
				ili2cConfig.setGenerateWarnings(false);
			} catch (Ili2cException ex) {
				EhiLogger.logError(ex);
				return null;
			}
		}else{
			ArrayList<String> modelv=new ArrayList<String>();
			if(modelName!=null){
				modelv.add(modelName);
			}
			try {
				//ili2cConfig=ch.interlis.ili2c.ModelScan.getConfig(modeldirv, modelv);
				ch.interlis.ilirepository.IliManager modelManager=new ch.interlis.ilirepository.IliManager();
				modelManager.setRepositories((String[])modeldirv.toArray(new String[]{}));
				ili2cConfig=modelManager.getConfig(modelv, 0.0);
				ili2cConfig.setGenerateWarnings(false);
			} catch (Ili2cException ex) {
				EhiLogger.logError(ex);
				return null;
			}
			
		}
		
	
		try {
			ch.interlis.ili2c.Ili2c.logIliFiles(ili2cConfig);
			td=ch.interlis.ili2c.Ili2c.runCompiler(ili2cConfig);
		} catch (Ili2cFailure ex) {
			EhiLogger.logError(ex);
			return null;
		}
		return td;
	}


	/** Default path with folders of Interlis model files.
	 * @see #SETTING_ILIDIRS
	 */
	public static final String SETTING_DEFAULT_ILIDIRS = Av2geobau.ITF_DIR+";http://models.interlis.ch/;"+Av2geobau.JAR_DIR+"/ilimodels";
	/** Path with folders of Interlis model files. Multiple entries are separated by semicolon (';'). 
	 * Might contain "http:" URLs which should contain model repositories. 
	 * Might include placeholders ITF_DIR or JAR_DIR. 
	 * @see #ITF_DIR
	 * @see #JAR_DIR
	 */
	public static final String SETTING_ILIDIRS="org.interlis2.av2geobau.ilidirs";
	/** the main folder of program.
	 */
	public static final String SETTING_APPHOME="org.interlis2.av2geobau.appHome";
	/** Name of the config file, that controls the conversion.
	 */
	public static final String SETTING_CONFIGFILE = "org.interlis2.av2geobau.configfile";
	/** Name of the log file that receives the conversion results.
	 */
	public static final String SETTING_LOGFILE = "org.interlis2.av2geobau.log";
	/** Placeholder, that will be replaced by the folder of the current to be converted transfer file. 
	 * @see #SETTING_ILIDIRS
	 */
	public static final String ITF_DIR="%ITF_DIR";
	/** Placeholder, that will be replaced by the folder of the av2geobau program. 
	 * @see #SETTING_ILIDIRS
	 */
	public static final String JAR_DIR="%JAR_DIR";
}
