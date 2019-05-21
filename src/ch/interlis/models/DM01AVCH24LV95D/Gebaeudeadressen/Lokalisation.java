package ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen;
public class Lokalisation extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Gebaeudeadressen.Lokalisation";
  public Lokalisation(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Nummerierungsprinzip="Nummerierungsprinzip";
  public Lokalisation_Nummerierungsprinzip getNummerierungsprinzip() {
    String value=getattrvalue("Nummerierungsprinzip");
    return Lokalisation_Nummerierungsprinzip.parseXmlCode(value);
  }
  public void setNummerierungsprinzip(Lokalisation_Nummerierungsprinzip value) {
    setattrvalue("Nummerierungsprinzip", Lokalisation_Nummerierungsprinzip.toXmlCode(value));
  }
  public final static String tag_LokalisationNummer="LokalisationNummer";
  public String getLokalisationNummer() {
    String value=getattrvalue("LokalisationNummer");
    return value;
  }
  public void setLokalisationNummer(String value) {
    setattrvalue("LokalisationNummer", value);
  }
  public final static String tag_AttributeProvisorisch="AttributeProvisorisch";
  public Lokalisation_AttributeProvisorisch getAttributeProvisorisch() {
    String value=getattrvalue("AttributeProvisorisch");
    return Lokalisation_AttributeProvisorisch.parseXmlCode(value);
  }
  public void setAttributeProvisorisch(Lokalisation_AttributeProvisorisch value) {
    setattrvalue("AttributeProvisorisch", Lokalisation_AttributeProvisorisch.toXmlCode(value));
  }
  public final static String tag_IstOffizielleBezeichnung="IstOffizielleBezeichnung";
  public Lokalisation_IstOffizielleBezeichnung getIstOffizielleBezeichnung() {
    String value=getattrvalue("IstOffizielleBezeichnung");
    return Lokalisation_IstOffizielleBezeichnung.parseXmlCode(value);
  }
  public void setIstOffizielleBezeichnung(Lokalisation_IstOffizielleBezeichnung value) {
    setattrvalue("IstOffizielleBezeichnung", Lokalisation_IstOffizielleBezeichnung.toXmlCode(value));
  }
  public final static String tag_Status="Status";
  public ch.interlis.models.DM01AVCH24LV95D.Status_GA getStatus() {
    String value=getattrvalue("Status");
    return ch.interlis.models.DM01AVCH24LV95D.Status_GA.parseXmlCode(value);
  }
  public void setStatus(ch.interlis.models.DM01AVCH24LV95D.Status_GA value) {
    setattrvalue("Status", ch.interlis.models.DM01AVCH24LV95D.Status_GA.toXmlCode(value));
  }
  public final static String tag_InAenderung="InAenderung";
  public Lokalisation_InAenderung getInAenderung() {
    String value=getattrvalue("InAenderung");
    return Lokalisation_InAenderung.parseXmlCode(value);
  }
  public void setInAenderung(Lokalisation_InAenderung value) {
    setattrvalue("InAenderung", Lokalisation_InAenderung.toXmlCode(value));
  }
  public final static String tag_Art="Art";
  public Lokalisation_Art getArt() {
    String value=getattrvalue("Art");
    return Lokalisation_Art.parseXmlCode(value);
  }
  public void setArt(Lokalisation_Art value) {
    setattrvalue("Art", Lokalisation_Art.toXmlCode(value));
  }
  public final static String tag_Entstehung="Entstehung";
  public String getEntstehung() {
    ch.interlis.iom.IomObject value=getattrobj("Entstehung",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setEntstehung(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Entstehung","REF");
    structvalue.setobjectrefoid(oid);
  }
}
