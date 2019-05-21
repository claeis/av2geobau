package ch.interlis.models.DM01AVCH24LV95D.Gemeindegrenzen;
public class Hoheitsgrenzpunkt_ExaktDefiniert{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Hoheitsgrenzpunkt_ExaktDefiniert(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Hoheitsgrenzpunkt_ExaktDefiniert value) {
     return value.value;
  }
  static public Hoheitsgrenzpunkt_ExaktDefiniert parseXmlCode(String value) {
     return (Hoheitsgrenzpunkt_ExaktDefiniert)valuev.get(value);
  }
  static public Hoheitsgrenzpunkt_ExaktDefiniert Ja=new Hoheitsgrenzpunkt_ExaktDefiniert("Ja");
  public final static String tag_Ja="Ja";
  static public Hoheitsgrenzpunkt_ExaktDefiniert Nein=new Hoheitsgrenzpunkt_ExaktDefiniert("Nein");
  public final static String tag_Nein="Nein";
}
