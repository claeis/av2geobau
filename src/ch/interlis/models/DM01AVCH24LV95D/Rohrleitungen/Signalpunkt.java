package ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen;
public class Signalpunkt extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Rohrleitungen.Signalpunkt";
  public Signalpunkt(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Nummer="Nummer";
  public String getNummer() {
    String value=getattrvalue("Nummer");
    return value;
  }
  public void setNummer(String value) {
    setattrvalue("Nummer", value);
  }
  public final static String tag_Betreiber="Betreiber";
  public String getBetreiber() {
    String value=getattrvalue("Betreiber");
    return value;
  }
  public void setBetreiber(String value) {
    setattrvalue("Betreiber", value);
  }
  public final static String tag_Geometrie="Geometrie";
  public String getGeometrie() {
    String value=getattrvalue("Geometrie");
    return value;
  }
  public void setGeometrie(String value) {
    setattrvalue("Geometrie", value);
  }
  public final static String tag_Qualitaet="Qualitaet";
  public ch.interlis.models.DM01AVCH24LV95D.Qualitaetsstandard getQualitaet() {
    String value=getattrvalue("Qualitaet");
    return ch.interlis.models.DM01AVCH24LV95D.Qualitaetsstandard.parseXmlCode(value);
  }
  public void setQualitaet(ch.interlis.models.DM01AVCH24LV95D.Qualitaetsstandard value) {
    setattrvalue("Qualitaet", ch.interlis.models.DM01AVCH24LV95D.Qualitaetsstandard.toXmlCode(value));
  }
  public final static String tag_Art="Art";
  public ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen.Medium getArt() {
    String value=getattrvalue("Art");
    return ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen.Medium.parseXmlCode(value);
  }
  public void setArt(ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen.Medium value) {
    setattrvalue("Art", ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen.Medium.toXmlCode(value));
  }
  public final static String tag_Punktart="Punktart";
  public Signalpunkt_Punktart getPunktart() {
    String value=getattrvalue("Punktart");
    return Signalpunkt_Punktart.parseXmlCode(value);
  }
  public void setPunktart(Signalpunkt_Punktart value) {
    setattrvalue("Punktart", Signalpunkt_Punktart.toXmlCode(value));
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
