package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class Grenzpunkt_HoheitsgrenzsteinAlt{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Grenzpunkt_HoheitsgrenzsteinAlt(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Grenzpunkt_HoheitsgrenzsteinAlt value) {
     return value.value;
  }
  static public Grenzpunkt_HoheitsgrenzsteinAlt parseXmlCode(String value) {
     return (Grenzpunkt_HoheitsgrenzsteinAlt)valuev.get(value);
  }
  static public Grenzpunkt_HoheitsgrenzsteinAlt ja=new Grenzpunkt_HoheitsgrenzsteinAlt("ja");
  public final static String tag_ja="ja";
  static public Grenzpunkt_HoheitsgrenzsteinAlt nein=new Grenzpunkt_HoheitsgrenzsteinAlt("nein");
  public final static String tag_nein="nein";
}
