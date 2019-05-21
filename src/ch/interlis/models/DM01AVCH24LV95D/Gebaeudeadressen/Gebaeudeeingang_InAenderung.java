package ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen;
public class Gebaeudeeingang_InAenderung{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Gebaeudeeingang_InAenderung(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Gebaeudeeingang_InAenderung value) {
     return value.value;
  }
  static public Gebaeudeeingang_InAenderung parseXmlCode(String value) {
     return (Gebaeudeeingang_InAenderung)valuev.get(value);
  }
  static public Gebaeudeeingang_InAenderung ja=new Gebaeudeeingang_InAenderung("ja");
  public final static String tag_ja="ja";
  static public Gebaeudeeingang_InAenderung nein=new Gebaeudeeingang_InAenderung("nein");
  public final static String tag_nein="nein";
}
