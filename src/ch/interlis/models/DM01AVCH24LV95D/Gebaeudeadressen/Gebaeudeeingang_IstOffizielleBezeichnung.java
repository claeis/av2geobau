package ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen;
public class Gebaeudeeingang_IstOffizielleBezeichnung{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Gebaeudeeingang_IstOffizielleBezeichnung(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Gebaeudeeingang_IstOffizielleBezeichnung value) {
     return value.value;
  }
  static public Gebaeudeeingang_IstOffizielleBezeichnung parseXmlCode(String value) {
     return (Gebaeudeeingang_IstOffizielleBezeichnung)valuev.get(value);
  }
  static public Gebaeudeeingang_IstOffizielleBezeichnung ja=new Gebaeudeeingang_IstOffizielleBezeichnung("ja");
  public final static String tag_ja="ja";
  static public Gebaeudeeingang_IstOffizielleBezeichnung nein=new Gebaeudeeingang_IstOffizielleBezeichnung("nein");
  public final static String tag_nein="nein";
}
