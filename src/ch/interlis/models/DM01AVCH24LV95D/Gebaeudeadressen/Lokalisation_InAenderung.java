package ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen;
public class Lokalisation_InAenderung{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Lokalisation_InAenderung(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Lokalisation_InAenderung value) {
     return value.value;
  }
  static public Lokalisation_InAenderung parseXmlCode(String value) {
     return (Lokalisation_InAenderung)valuev.get(value);
  }
  static public Lokalisation_InAenderung ja=new Lokalisation_InAenderung("ja");
  public final static String tag_ja="ja";
  static public Lokalisation_InAenderung nein=new Lokalisation_InAenderung("nein");
  public final static String tag_nein="nein";
}
