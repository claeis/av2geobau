package ch.interlis.models.DM01AVCH24LV95D.PLZOrtschaft;
public class Ortschaft_InAenderung{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Ortschaft_InAenderung(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Ortschaft_InAenderung value) {
     return value.value;
  }
  static public Ortschaft_InAenderung parseXmlCode(String value) {
     return (Ortschaft_InAenderung)valuev.get(value);
  }
  static public Ortschaft_InAenderung ja=new Ortschaft_InAenderung("ja");
  public final static String tag_ja="ja";
  static public Ortschaft_InAenderung nein=new Ortschaft_InAenderung("nein");
  public final static String tag_nein="nein";
}
