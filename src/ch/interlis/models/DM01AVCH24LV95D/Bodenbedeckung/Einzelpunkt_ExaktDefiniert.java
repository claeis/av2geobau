package ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung;
public class Einzelpunkt_ExaktDefiniert{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Einzelpunkt_ExaktDefiniert(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Einzelpunkt_ExaktDefiniert value) {
     return value.value;
  }
  static public Einzelpunkt_ExaktDefiniert parseXmlCode(String value) {
     return (Einzelpunkt_ExaktDefiniert)valuev.get(value);
  }
  static public Einzelpunkt_ExaktDefiniert Ja=new Einzelpunkt_ExaktDefiniert("Ja");
  public final static String tag_Ja="Ja";
  static public Einzelpunkt_ExaktDefiniert Nein=new Einzelpunkt_ExaktDefiniert("Nein");
  public final static String tag_Nein="Nein";
}
