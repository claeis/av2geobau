package ch.interlis.models.DM01AVCH24LV95D.PLZOrtschaft;
public class PLZ6_InAenderung{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private PLZ6_InAenderung(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(PLZ6_InAenderung value) {
     return value.value;
  }
  static public PLZ6_InAenderung parseXmlCode(String value) {
     return (PLZ6_InAenderung)valuev.get(value);
  }
  static public PLZ6_InAenderung ja=new PLZ6_InAenderung("ja");
  public final static String tag_ja="ja";
  static public PLZ6_InAenderung nein=new PLZ6_InAenderung("nein");
  public final static String tag_nein="nein";
}
