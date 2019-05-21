package ch.interlis.models.DM01AVCH24LV95D.TSEinteilung;
public class Toleranzstufe extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.TSEinteilung.Toleranzstufe";
  public Toleranzstufe(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_NBIdent="NBIdent";
  public String getNBIdent() {
    String value=getattrvalue("NBIdent");
    return value;
  }
  public void setNBIdent(String value) {
    setattrvalue("NBIdent", value);
  }
  public final static String tag_Identifikator="Identifikator";
  public String getIdentifikator() {
    String value=getattrvalue("Identifikator");
    return value;
  }
  public void setIdentifikator(String value) {
    setattrvalue("Identifikator", value);
  }
  public final static String tag_Geometrie="Geometrie";
  public String getGeometrie() {
    String value=getattrvalue("Geometrie");
    return value;
  }
  public void setGeometrie(String value) {
    setattrvalue("Geometrie", value);
  }
  public final static String tag_GueltigerEintrag="GueltigerEintrag";
  public String getGueltigerEintrag() {
    String value=getattrvalue("GueltigerEintrag");
    return value;
  }
  public void setGueltigerEintrag(String value) {
    setattrvalue("GueltigerEintrag", value);
  }
  public final static String tag_Art="Art";
  public Toleranzstufe_Art getArt() {
    String value=getattrvalue("Art");
    return Toleranzstufe_Art.parseXmlCode(value);
  }
  public void setArt(Toleranzstufe_Art value) {
    setattrvalue("Art", Toleranzstufe_Art.toXmlCode(value));
  }
}
