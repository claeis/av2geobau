package ch.interlis.models.DM01AVCH24LV95D.TSEinteilung;
public class Toleranzstufe_Art{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Toleranzstufe_Art(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Toleranzstufe_Art value) {
     return value.value;
  }
  static public Toleranzstufe_Art parseXmlCode(String value) {
     return (Toleranzstufe_Art)valuev.get(value);
  }
  static public Toleranzstufe_Art TS1=new Toleranzstufe_Art("TS1");
  public final static String tag_TS1="TS1";
  static public Toleranzstufe_Art TS2=new Toleranzstufe_Art("TS2");
  public final static String tag_TS2="TS2";
  static public Toleranzstufe_Art TS3=new Toleranzstufe_Art("TS3");
  public final static String tag_TS3="TS3";
  static public Toleranzstufe_Art TS4=new Toleranzstufe_Art("TS4");
  public final static String tag_TS4="TS4";
  static public Toleranzstufe_Art TS5=new Toleranzstufe_Art("TS5");
  public final static String tag_TS5="TS5";
}
