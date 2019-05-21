package ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen;
public class Gebaeudeeingang extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Gebaeudeadressen.Gebaeudeeingang";
  public Gebaeudeeingang(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
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
  public Gebaeudeeingang_InAenderung getInAenderung() {
    String value=getattrvalue("InAenderung");
    return Gebaeudeeingang_InAenderung.parseXmlCode(value);
  }
  public void setInAenderung(Gebaeudeeingang_InAenderung value) {
    setattrvalue("InAenderung", Gebaeudeeingang_InAenderung.toXmlCode(value));
  }
  public final static String tag_AttributeProvisorisch="AttributeProvisorisch";
  public Gebaeudeeingang_AttributeProvisorisch getAttributeProvisorisch() {
    String value=getattrvalue("AttributeProvisorisch");
    return Gebaeudeeingang_AttributeProvisorisch.parseXmlCode(value);
  }
  public void setAttributeProvisorisch(Gebaeudeeingang_AttributeProvisorisch value) {
    setattrvalue("AttributeProvisorisch", Gebaeudeeingang_AttributeProvisorisch.toXmlCode(value));
  }
  public final static String tag_IstOffizielleBezeichnung="IstOffizielleBezeichnung";
  public Gebaeudeeingang_IstOffizielleBezeichnung getIstOffizielleBezeichnung() {
    String value=getattrvalue("IstOffizielleBezeichnung");
    return Gebaeudeeingang_IstOffizielleBezeichnung.parseXmlCode(value);
  }
  public void setIstOffizielleBezeichnung(Gebaeudeeingang_IstOffizielleBezeichnung value) {
    setattrvalue("IstOffizielleBezeichnung", Gebaeudeeingang_IstOffizielleBezeichnung.toXmlCode(value));
  }
  public final static String tag_Lage="Lage";
  public String getLage() {
    String value=getattrvalue("Lage");
    return value;
  }
  public void setLage(String value) {
    setattrvalue("Lage", value);
  }
  public final static String tag_HoehenLage="HoehenLage";
  public int getHoehenLage() {
    String value=getattrvalue("HoehenLage");
    return Integer.parseInt(value);
  }
  public void setHoehenLage(int value) {
    setattrvalue("HoehenLage", Integer.toString(value));
  }
  public final static String tag_Hausnummer="Hausnummer";
  public String getHausnummer() {
    String value=getattrvalue("Hausnummer");
    return value;
  }
  public void setHausnummer(String value) {
    setattrvalue("Hausnummer", value);
  }
  public final static String tag_Im_Gebaeude="Im_Gebaeude";
  public Gebaeudeeingang_Im_Gebaeude getIm_Gebaeude() {
    String value=getattrvalue("Im_Gebaeude");
    return Gebaeudeeingang_Im_Gebaeude.parseXmlCode(value);
  }
  public void setIm_Gebaeude(Gebaeudeeingang_Im_Gebaeude value) {
    setattrvalue("Im_Gebaeude", Gebaeudeeingang_Im_Gebaeude.toXmlCode(value));
  }
  public final static String tag_GWR_EGID="GWR_EGID";
  public int getGWR_EGID() {
    String value=getattrvalue("GWR_EGID");
    return Integer.parseInt(value);
  }
  public void setGWR_EGID(int value) {
    setattrvalue("GWR_EGID", Integer.toString(value));
  }
  public final static String tag_GWR_EDID="GWR_EDID";
  public int getGWR_EDID() {
    String value=getattrvalue("GWR_EDID");
    return Integer.parseInt(value);
  }
  public void setGWR_EDID(int value) {
    setattrvalue("GWR_EDID", Integer.toString(value));
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
  public final static String tag_Gebaeudeeingang_von="Gebaeudeeingang_von";
  public String getGebaeudeeingang_von() {
    ch.interlis.iom.IomObject value=getattrobj("Gebaeudeeingang_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setGebaeudeeingang_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Gebaeudeeingang_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
