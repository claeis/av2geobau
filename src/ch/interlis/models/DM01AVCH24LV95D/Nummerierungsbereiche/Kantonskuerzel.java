package ch.interlis.models.DM01AVCH24LV95D.Nummerierungsbereiche;
public class Kantonskuerzel{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Kantonskuerzel(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Kantonskuerzel value) {
     return value.value;
  }
  static public Kantonskuerzel parseXmlCode(String value) {
     return (Kantonskuerzel)valuev.get(value);
  }
  static public Kantonskuerzel ZH=new Kantonskuerzel("ZH");
  public final static String tag_ZH="ZH";
  static public Kantonskuerzel BE=new Kantonskuerzel("BE");
  public final static String tag_BE="BE";
  static public Kantonskuerzel LU=new Kantonskuerzel("LU");
  public final static String tag_LU="LU";
  static public Kantonskuerzel UR=new Kantonskuerzel("UR");
  public final static String tag_UR="UR";
  static public Kantonskuerzel SZ=new Kantonskuerzel("SZ");
  public final static String tag_SZ="SZ";
  static public Kantonskuerzel OW=new Kantonskuerzel("OW");
  public final static String tag_OW="OW";
  static public Kantonskuerzel NW=new Kantonskuerzel("NW");
  public final static String tag_NW="NW";
  static public Kantonskuerzel GL=new Kantonskuerzel("GL");
  public final static String tag_GL="GL";
  static public Kantonskuerzel ZG=new Kantonskuerzel("ZG");
  public final static String tag_ZG="ZG";
  static public Kantonskuerzel FR=new Kantonskuerzel("FR");
  public final static String tag_FR="FR";
  static public Kantonskuerzel SO=new Kantonskuerzel("SO");
  public final static String tag_SO="SO";
  static public Kantonskuerzel BS=new Kantonskuerzel("BS");
  public final static String tag_BS="BS";
  static public Kantonskuerzel BL=new Kantonskuerzel("BL");
  public final static String tag_BL="BL";
  static public Kantonskuerzel SH=new Kantonskuerzel("SH");
  public final static String tag_SH="SH";
  static public Kantonskuerzel AR=new Kantonskuerzel("AR");
  public final static String tag_AR="AR";
  static public Kantonskuerzel AI=new Kantonskuerzel("AI");
  public final static String tag_AI="AI";
  static public Kantonskuerzel SG=new Kantonskuerzel("SG");
  public final static String tag_SG="SG";
  static public Kantonskuerzel GR=new Kantonskuerzel("GR");
  public final static String tag_GR="GR";
  static public Kantonskuerzel AG=new Kantonskuerzel("AG");
  public final static String tag_AG="AG";
  static public Kantonskuerzel TG=new Kantonskuerzel("TG");
  public final static String tag_TG="TG";
  static public Kantonskuerzel TI=new Kantonskuerzel("TI");
  public final static String tag_TI="TI";
  static public Kantonskuerzel VD=new Kantonskuerzel("VD");
  public final static String tag_VD="VD";
  static public Kantonskuerzel VS=new Kantonskuerzel("VS");
  public final static String tag_VS="VS";
  static public Kantonskuerzel NE=new Kantonskuerzel("NE");
  public final static String tag_NE="NE";
  static public Kantonskuerzel GE=new Kantonskuerzel("GE");
  public final static String tag_GE="GE";
  static public Kantonskuerzel JU=new Kantonskuerzel("JU");
  public final static String tag_JU="JU";
  static public Kantonskuerzel FL=new Kantonskuerzel("FL");
  public final static String tag_FL="FL";
  static public Kantonskuerzel CH=new Kantonskuerzel("CH");
  public final static String tag_CH="CH";
}
