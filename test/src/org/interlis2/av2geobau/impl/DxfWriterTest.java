package org.interlis2.av2geobau.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import ch.interlis.iom.IomObject;
import ch.interlis.iom_j.Iom_jObject;
import ch.interlis.models.DM01AVCH24LV95D.Kantonsgrenzen.Kantonsgrenzabschnitt;

public class DxfWriterTest {
    @Test
    public void text() throws Exception
    {
        String nummer="10887750";
        String layer="01119";
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_TEXT,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT, nummer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT_SIZE,"1.35");
        IomObject geom=new Iom_jObject("COORD",null);
        geom.setattrvalue("C1", "2633963.872");
        geom.setattrvalue("C2", "1247365.164");
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_ORI, "10.0");
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_HALI, "1");
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_VALI, "1");
        String dxf=DxfWriter.feature2Dxf(dxfObj);
        assertEquals("  0\r\n" + 
                "TEXT\r\n" + 
                "  1\r\n" + 
                "10887750\r\n" + 
                " 40\r\n" + 
                "1.350000\r\n" + 
                "  8\r\n" + 
                "01119\r\n" + 
                " 10\r\n" + 
                "2633963.872\r\n" + 
                " 20\r\n" + 
                "1247365.164\r\n" + 
                " 30\r\n" + 
                "0.000\r\n" + 
                " 50\r\n" + 
                "10.000000\r\n" + 
                " 72\r\n" + 
                "     1\r\n" + 
                " 73\r\n" + 
                "1\r\n" + 
                " 11\r\n" + 
                "2633963.872\r\n" + 
                " 21\r\n" + 
                "1247365.164\r\n" + 
                " 31\r\n" + 
                "     0\r\n" + 
                "",dxf);
    }
    @Test
    public void blockInsert() throws Exception
    {
        String block="LFP1";
        String layer="01111";
        IomObject geom=new Iom_jObject("COORD",null);
        geom.setattrvalue("C1", "2633963.872");
        geom.setattrvalue("C2", "1247365.164");
        //geom.setattrvalue("C3", "");
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_BLOCKINSERT,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_BLOCK, block);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        String dxf=DxfWriter.feature2Dxf(dxfObj);
        assertEquals("  0\r\n" + 
                "INSERT\r\n" + 
                "  2\r\n" + 
                "LFP1\r\n" + 
                "  8\r\n" + 
                "01111\r\n" + 
                " 10\r\n" + 
                "2633963.872\r\n" + 
                " 20\r\n" + 
                "1247365.164\r\n" + 
                " 30\r\n" + 
                "0.000\r\n" + 
                " 50\r\n" + 
                "0.0\r\n" + 
                " 41\r\n" + 
                "0.5\r\n" + 
                " 42\r\n" + 
                "0.5\r\n" + 
                " 43\r\n" + 
                "0.5\r\n" + 
                "",dxf);
    }
    @Test
    public void blockInsert_withZ() throws Exception
    {
        String block="LFP1";
        String layer="01111";
        IomObject geom=new Iom_jObject("COORD",null);
        geom.setattrvalue("C1", "2633963.872");
        geom.setattrvalue("C2", "1247365.164");
        geom.setattrvalue("C3", "500.0");
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_BLOCKINSERT,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_BLOCK, block);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        String dxf=DxfWriter.feature2Dxf(dxfObj);
        assertEquals("  0\r\n" + 
                "INSERT\r\n" + 
                "  2\r\n" + 
                "LFP1\r\n" + 
                "  8\r\n" + 
                "01111\r\n" + 
                " 10\r\n" + 
                "2633963.872\r\n" + 
                " 20\r\n" + 
                "1247365.164\r\n" + 
                " 30\r\n" + 
                "500.000\r\n" + 
                " 50\r\n" + 
                "0.0\r\n" + 
                " 41\r\n" + 
                "0.5\r\n" + 
                " 42\r\n" + 
                "0.5\r\n" + 
                " 43\r\n" + 
                "0.5\r\n" + 
                "",dxf);
    }
    @Test
    public void polyline() throws Exception
    {
        String layer="01831";
        IomObject p1=new Iom_jObject("COORD",null);
        p1.setattrvalue("C1", "2633963.872");
        p1.setattrvalue("C2", "1247365.164");
        IomObject p2=new Iom_jObject("COORD",null);
        p2.setattrvalue("C1", "2633964.000");
        p2.setattrvalue("C2", "1247366.000");
        IomObject geom=new Iom_jObject("POLYLINE",null);
        IomObject segments=geom.addattrobj("sequence", "SEGMENTS");
        segments.addattrobj("segment", p1);
        segments.addattrobj("segment", p2);
        
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_2D_POLYLINE,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        String dxf=DxfWriter.feature2Dxf(dxfObj);
        assertEquals("  0\r\n" + 
                "POLYLINE\r\n" + 
                "  8\r\n" + 
                "01831\r\n" + 
                " 66\r\n" + 
                "     1\r\n" + 
                " 10\r\n" + 
                "0.0\r\n" + 
                " 20\r\n" + 
                "0.0\r\n" + 
                " 30\r\n" + 
                "0.0\r\n" + 
                " 70\r\n" + 
                "     0\r\n" + 
                "  0\r\n" + 
                "VERTEX\r\n" + 
                "  8\r\n" + 
                "01831\r\n" + 
                " 10\r\n" + 
                "2633963.872\r\n" + 
                " 20\r\n" + 
                "1247365.164\r\n" + 
                " 30\r\n" + 
                "0.000\r\n" + 
                " 70\r\n" + 
                "     1\r\n" + 
                "  0\r\n" + 
                "VERTEX\r\n" + 
                "  8\r\n" + 
                "01831\r\n" + 
                " 10\r\n" + 
                "2633964.000\r\n" + 
                " 20\r\n" + 
                "1247366.000\r\n" + 
                " 30\r\n" + 
                "0.000\r\n" + 
                " 70\r\n" + 
                "     1\r\n" + 
                "  0\r\n" + 
                "SEQEND\r\n" + 
                "",dxf);
    }
    @Test
    public void polygon() throws Exception
    {
        String layer="01831";
        IomObject p1=new Iom_jObject("COORD",null);
        p1.setattrvalue("C1", "2633963.000");
        p1.setattrvalue("C2", "1247365.000");
        IomObject p2=new Iom_jObject("COORD",null);
        p2.setattrvalue("C1", "2633963.000");
        p2.setattrvalue("C2", "1247366.000");
        IomObject p3=new Iom_jObject("COORD",null);
        p3.setattrvalue("C1", "2633964.000");
        p3.setattrvalue("C2", "1247366.000");
        IomObject p4=new Iom_jObject("COORD",null);
        p4.setattrvalue("C1", "2633964.000");
        p4.setattrvalue("C2", "1247365.000");
        IomObject p5=new Iom_jObject("COORD",null);
        p5.setattrvalue("C1", "2633963.000");
        p5.setattrvalue("C2", "1247365.000");
        
        
        IomObject geom=new Iom_jObject("MULTISURFACE",null);
        IomObject surfaceValue = geom.addattrobj("surface", "SURFACE");
        IomObject outerBoundary = surfaceValue.addattrobj("boundary", "BOUNDARY");
        // polyline
        IomObject polylineValue = outerBoundary.addattrobj("polyline", "POLYLINE");
        IomObject segments=polylineValue.addattrobj("sequence", "SEGMENTS");
        segments.addattrobj("segment", p1);
        segments.addattrobj("segment", p2);
        segments.addattrobj("segment", p3);
        segments.addattrobj("segment", p4);
        segments.addattrobj("segment", p5);
        
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_2D_POLYGON,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        String dxf=DxfWriter.feature2Dxf(dxfObj);
        assertEquals("  0\r\n" + 
                "POLYLINE\r\n" + 
                "  8\r\n" + 
                "01831\r\n" + 
                " 66\r\n" + 
                "     1\r\n" + 
                " 10\r\n" + 
                "0.0\r\n" + 
                " 20\r\n" + 
                "0.0\r\n" + 
                " 30\r\n" + 
                "0.0\r\n" + 
                " 70\r\n" + 
                "     1\r\n" + 
                "  0\r\n" + 
                "VERTEX\r\n" + 
                "  8\r\n" + 
                "01831\r\n" + 
                " 10\r\n" + 
                "2633963.000\r\n" + 
                " 20\r\n" + 
                "1247365.000\r\n" + 
                " 30\r\n" + 
                "0.000\r\n" + 
                " 70\r\n" + 
                "     1\r\n" + 
                "  0\r\n" + 
                "VERTEX\r\n" + 
                "  8\r\n" + 
                "01831\r\n" + 
                " 10\r\n" + 
                "2633963.000\r\n" + 
                " 20\r\n" + 
                "1247366.000\r\n" + 
                " 30\r\n" + 
                "0.000\r\n" + 
                " 70\r\n" + 
                "     1\r\n" + 
                "  0\r\n" + 
                "VERTEX\r\n" + 
                "  8\r\n" + 
                "01831\r\n" + 
                " 10\r\n" + 
                "2633964.000\r\n" + 
                " 20\r\n" + 
                "1247366.000\r\n" + 
                " 30\r\n" + 
                "0.000\r\n" + 
                " 70\r\n" + 
                "     1\r\n" + 
                "  0\r\n" + 
                "VERTEX\r\n" + 
                "  8\r\n" + 
                "01831\r\n" + 
                " 10\r\n" + 
                "2633964.000\r\n" + 
                " 20\r\n" + 
                "1247365.000\r\n" + 
                " 30\r\n" + 
                "0.000\r\n" + 
                " 70\r\n" + 
                "     1\r\n" + 
                "  0\r\n" + 
                "VERTEX\r\n" + 
                "  8\r\n" + 
                "01831\r\n" + 
                " 10\r\n" + 
                "2633963.000\r\n" + 
                " 20\r\n" + 
                "1247365.000\r\n" + 
                " 30\r\n" + 
                "0.000\r\n" + 
                " 70\r\n" + 
                "     1\r\n" + 
                "  0\r\n" + 
                "SEQEND\r\n" + 
                "",dxf);
    }
}
