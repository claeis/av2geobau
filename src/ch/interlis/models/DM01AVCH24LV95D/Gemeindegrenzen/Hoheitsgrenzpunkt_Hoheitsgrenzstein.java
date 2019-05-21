package ch.interlis.models.DM01AVCH24LV95D.Gemeindegrenzen;
public class Hoheitsgrenzpunkt_Hoheitsgrenzstein{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Hoheitsgrenzpunkt_Hoheitsgrenzstein(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Hoheitsgrenzpunkt_Hoheitsgrenzstein value) {
     return value.value;
  }
  static public Hoheitsgrenzpunkt_Hoheitsgrenzstein parseXmlCode(String value) {
     return (Hoheitsgrenzpunkt_Hoheitsgrenzstein)valuev.get(value);
  }
  static public Hoheitsgrenzpunkt_Hoheitsgrenzstein ja=new Hoheitsgrenzpunkt_Hoheitsgrenzstein("ja");
  public final static String tag_ja="ja";
  static public Hoheitsgrenzpunkt_Hoheitsgrenzstein nein=new Hoheitsgrenzpunkt_Hoheitsgrenzstein("nein");
  public final static String tag_nein="nein";
}
