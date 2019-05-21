package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class Grenzpunkt_ExaktDefiniert{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Grenzpunkt_ExaktDefiniert(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Grenzpunkt_ExaktDefiniert value) {
     return value.value;
  }
  static public Grenzpunkt_ExaktDefiniert parseXmlCode(String value) {
     return (Grenzpunkt_ExaktDefiniert)valuev.get(value);
  }
  static public Grenzpunkt_ExaktDefiniert Ja=new Grenzpunkt_ExaktDefiniert("Ja");
  public final static String tag_Ja="Ja";
  static public Grenzpunkt_ExaktDefiniert Nein=new Grenzpunkt_ExaktDefiniert("Nein");
  public final static String tag_Nein="Nein";
}
