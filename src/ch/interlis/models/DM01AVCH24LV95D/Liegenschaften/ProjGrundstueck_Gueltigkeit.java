package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class ProjGrundstueck_Gueltigkeit{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private ProjGrundstueck_Gueltigkeit(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(ProjGrundstueck_Gueltigkeit value) {
     return value.value;
  }
  static public ProjGrundstueck_Gueltigkeit parseXmlCode(String value) {
     return (ProjGrundstueck_Gueltigkeit)valuev.get(value);
  }
  static public ProjGrundstueck_Gueltigkeit rechtskraeftig=new ProjGrundstueck_Gueltigkeit("rechtskraeftig");
  public final static String tag_rechtskraeftig="rechtskraeftig";
  static public ProjGrundstueck_Gueltigkeit streitig=new ProjGrundstueck_Gueltigkeit("streitig");
  public final static String tag_streitig="streitig";
}
