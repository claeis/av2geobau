package ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen;
public class Gebaeudeeingang_AttributeProvisorisch{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Gebaeudeeingang_AttributeProvisorisch(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Gebaeudeeingang_AttributeProvisorisch value) {
     return value.value;
  }
  static public Gebaeudeeingang_AttributeProvisorisch parseXmlCode(String value) {
     return (Gebaeudeeingang_AttributeProvisorisch)valuev.get(value);
  }
  static public Gebaeudeeingang_AttributeProvisorisch ja=new Gebaeudeeingang_AttributeProvisorisch("ja");
  public final static String tag_ja="ja";
  static public Gebaeudeeingang_AttributeProvisorisch nein=new Gebaeudeeingang_AttributeProvisorisch("nein");
  public final static String tag_nein="nein";
}
