package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class Grundstueck_Vollstaendigkeit{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Grundstueck_Vollstaendigkeit(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Grundstueck_Vollstaendigkeit value) {
     return value.value;
  }
  static public Grundstueck_Vollstaendigkeit parseXmlCode(String value) {
     return (Grundstueck_Vollstaendigkeit)valuev.get(value);
  }
  static public Grundstueck_Vollstaendigkeit Vollstaendig=new Grundstueck_Vollstaendigkeit("Vollstaendig");
  public final static String tag_Vollstaendig="Vollstaendig";
  static public Grundstueck_Vollstaendigkeit unvollstaendig=new Grundstueck_Vollstaendigkeit("unvollstaendig");
  public final static String tag_unvollstaendig="unvollstaendig";
}
