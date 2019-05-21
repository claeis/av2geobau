package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class ProjGrundstueck_Vollstaendigkeit{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private ProjGrundstueck_Vollstaendigkeit(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(ProjGrundstueck_Vollstaendigkeit value) {
     return value.value;
  }
  static public ProjGrundstueck_Vollstaendigkeit parseXmlCode(String value) {
     return (ProjGrundstueck_Vollstaendigkeit)valuev.get(value);
  }
  static public ProjGrundstueck_Vollstaendigkeit Vollstaendig=new ProjGrundstueck_Vollstaendigkeit("Vollstaendig");
  public final static String tag_Vollstaendig="Vollstaendig";
  static public ProjGrundstueck_Vollstaendigkeit unvollstaendig=new ProjGrundstueck_Vollstaendigkeit("unvollstaendig");
  public final static String tag_unvollstaendig="unvollstaendig";
}
