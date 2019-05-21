package ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen;
public class Lokalisation_AttributeProvisorisch{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Lokalisation_AttributeProvisorisch(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Lokalisation_AttributeProvisorisch value) {
     return value.value;
  }
  static public Lokalisation_AttributeProvisorisch parseXmlCode(String value) {
     return (Lokalisation_AttributeProvisorisch)valuev.get(value);
  }
  static public Lokalisation_AttributeProvisorisch ja=new Lokalisation_AttributeProvisorisch("ja");
  public final static String tag_ja="ja";
  static public Lokalisation_AttributeProvisorisch nein=new Lokalisation_AttributeProvisorisch("nein");
  public final static String tag_nein="nein";
}
