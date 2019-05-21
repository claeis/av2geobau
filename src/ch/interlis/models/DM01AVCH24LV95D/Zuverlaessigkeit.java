package ch.interlis.models.DM01AVCH24LV95D;
public class Zuverlaessigkeit{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Zuverlaessigkeit(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Zuverlaessigkeit value) {
     return value.value;
  }
  static public Zuverlaessigkeit parseXmlCode(String value) {
     return (Zuverlaessigkeit)valuev.get(value);
  }
  static public Zuverlaessigkeit ja=new Zuverlaessigkeit("ja");
  public final static String tag_ja="ja";
  static public Zuverlaessigkeit nein=new Zuverlaessigkeit("nein");
  public final static String tag_nein="nein";
}
