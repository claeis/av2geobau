package ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen;
public class Lokalisation_IstOffizielleBezeichnung{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Lokalisation_IstOffizielleBezeichnung(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Lokalisation_IstOffizielleBezeichnung value) {
     return value.value;
  }
  static public Lokalisation_IstOffizielleBezeichnung parseXmlCode(String value) {
     return (Lokalisation_IstOffizielleBezeichnung)valuev.get(value);
  }
  static public Lokalisation_IstOffizielleBezeichnung ja=new Lokalisation_IstOffizielleBezeichnung("ja");
  public final static String tag_ja="ja";
  static public Lokalisation_IstOffizielleBezeichnung nein=new Lokalisation_IstOffizielleBezeichnung("nein");
  public final static String tag_nein="nein";
}
