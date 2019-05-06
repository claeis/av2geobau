package org.interlis2.av2geobau;

import java.io.File;
import ch.ehi.basics.logging.EhiLogger;
import ch.ehi.basics.settings.Settings;

/** Main program and commandline interface of av2geobau.
 */
public class Main {
	
	/** name of application as shown to user.
	 */
	public static final String APP_NAME="av2geobau";
	/** name of jar file.
	 */
	public static final String APP_JAR="av2geobau.jar";
	/** version of application.
	 */
	private static String version=null;
	
	/** main program entry.
	 * @param args command line arguments.
	 */
	static public void main(String args[]){
		Settings settings=new Settings();
		settings.setValue(Av2geobau.SETTING_ILIDIRS, Av2geobau.SETTING_DEFAULT_ILIDIRS);
		String appHome=getAppHome();
		// arguments on export
		String[] xtfFile=null;
		String httpProxyHost = null;
		String httpProxyPort = null;
		int argi=0;
		boolean doGui=false;
		for(;argi<args.length;argi++){
			String arg=args[argi];
			if(arg.equals("--trace")){
				EhiLogger.getInstance().setTraceFilter(false);
			}else if(arg.equals("--modeldir")){
				argi++;
				settings.setValue(Av2geobau.SETTING_ILIDIRS, args[argi]);
			}else if(arg.equals("--config")) {
			    argi++;
			    settings.setValue(Av2geobau.SETTING_CONFIGFILE, args[argi]);
			}else if(arg.equals("--log")) {
			    argi++;
			    settings.setValue(Av2geobau.SETTING_LOGFILE, args[argi]);
			}else if(arg.equals("--proxy")) {
				    argi++;
				    settings.setValue(ch.interlis.ili2c.gui.UserSettings.HTTP_PROXY_HOST, args[argi]);
			}else if(arg.equals("--proxyPort")) {
				    argi++;
				    settings.setValue(ch.interlis.ili2c.gui.UserSettings.HTTP_PROXY_PORT, args[argi]);
			}else if(arg.equals("--version")){
				printVersion();
				return;
			}else if(arg.equals("--help")){
					printVersion ();
					System.err.println();
					printDescription ();
					System.err.println();
					printUsage ();
					System.err.println();
					System.err.println("OPTIONS");
					System.err.println();
					//System.err.println("--gui                 start GUI.");
				    System.err.println("--config file         config file to control mapping.");
				    System.err.println("--log file            text file, that receives validation results.");
					System.err.println("--modeldir "+Av2geobau.SETTING_DEFAULT_ILIDIRS+" list of directories/repositories with ili-files.");
				    System.err.println("--proxy host          proxy server to access model repositories.");
				    System.err.println("--proxyPort port      proxy port to access model repositories.");
					System.err.println("--trace               enable trace messages.");
					System.err.println("--help                Display this help text.");
					System.err.println("--version             Display the version of "+APP_NAME+".");
					System.err.println();
					return;
				
			}else if(arg.startsWith("-")){
				EhiLogger.logAdaption(arg+": unknown option; ignored");
			}else{
				break;
			}
		}
		int dataFileCount=args.length-argi;
		if(dataFileCount!=2) {
	        if (dataFileCount == 0) {
	            EhiLogger.logError(APP_NAME+": wrong number of arguments");
	            System.exit(2);                     
	        }
		}
        File itfFile = new File(args[argi++]);
        File dxfFile = new File(args[argi++]);
        
        boolean ok = Av2geobau.convert(itfFile,dxfFile,settings);
        System.exit(ok ? 0 : 1);
	}
	/** Name of file with program settings. Only used by GUI, not used by commandline version.
	 */
	private final static String SETTINGS_FILE = System.getProperty("user.home") + "/.av2geobau";
	/** Reads program settings.
	 * @param settings Program configuration as read from file.
	 */
	public static void readSettings(Settings settings)
	{
		java.io.File file=new java.io.File(SETTINGS_FILE);
		try{
			if(file.exists()){
				settings.load(file);
			}
		}catch(java.io.IOException ex){
			EhiLogger.logError("failed to load settings from file "+SETTINGS_FILE,ex);
		}
	}
	/** Writes program settings.
	 * @param settings Program configuration to write.
	 */
	public static void writeSettings(Settings settings)
	{
		java.io.File file=new java.io.File(SETTINGS_FILE);
		try{
			settings.store(file,APP_NAME+" settings");
		}catch(java.io.IOException ex){
			EhiLogger.logError("failed to settings settings to file "+SETTINGS_FILE,ex);
		}
	}
	
	/** Prints program version.
	 */
	protected static void printVersion ()
	{
	  System.err.println(APP_NAME+", Version "+getVersion());
	  System.err.println("  Developed by Eisenhut Informatik AG, CH-3400 Burgdorf");
	}

	/** Prints program description.
	 */
	protected static void printDescription ()
	{
	  System.err.println("DESCRIPTION");
	  System.err.println("  Converts an ITF/DM01 file to a DXF/geobau.");
	}

	/** Prints program usage.
	 */
	protected static void printUsage()
	{
	  System.err.println ("USAGE");
	  System.err.println("  java -jar "+APP_JAR+" [Options] in.itf");
	}
	/** Gets version of program.
	 * @return version e.g. "1.0.0"
	 */
	public static String getVersion() {
		  if(version==null){
		java.util.ResourceBundle resVersion = java.util.ResourceBundle.getBundle(ch.ehi.basics.i18n.ResourceBundle.class2qpackageName(Main.class)+".Version");
			StringBuffer ret=new StringBuffer(20);
		ret.append(resVersion.getString("version"));
			ret.append('-');
		ret.append(resVersion.getString("versionCommit"));
			version=ret.toString();
		  }
		  return version;
	}
	
	/** Gets main folder of program.
	 * 
	 * @return folder Main folder of program.
	 */
	static public String getAppHome()
	{
	  String[] classpaths = System.getProperty("java.class.path").split(System.getProperty("path.separator"));
	  for(String classpath:classpaths) {
		  if(classpath.toLowerCase().endsWith(".jar")) {
			  File file = new File(classpath);
			  String jarName=file.getName();
			  if(jarName.toLowerCase().startsWith(APP_NAME)) {
				  file=new File(file.getAbsolutePath());
				  if(file.exists()) {
					  return file.getParent();
				  }
			  }
		  }
	  }
	  return null;
	}
	
}
