package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class Grundstueck_Gueltigkeit{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Grundstueck_Gueltigkeit(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Grundstueck_Gueltigkeit value) {
     return value.value;
  }
  static public Grundstueck_Gueltigkeit parseXmlCode(String value) {
     return (Grundstueck_Gueltigkeit)valuev.get(value);
  }
  static public Grundstueck_Gueltigkeit rechtskraeftig=new Grundstueck_Gueltigkeit("rechtskraeftig");
  public final static String tag_rechtskraeftig="rechtskraeftig";
  static public Grundstueck_Gueltigkeit streitig=new Grundstueck_Gueltigkeit("streitig");
  public final static String tag_streitig="streitig";
}
