package ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie1;
public class HFP1Nachfuehrung extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.FixpunkteKategorie1.HFP1Nachfuehrung";
  public HFP1Nachfuehrung(String oid) {
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
  public final static String tag_Beschreibung="Beschreibung";
  public String getBeschreibung() {
    String value=getattrvalue("Beschreibung");
    return value;
  }
  public void setBeschreibung(String value) {
    setattrvalue("Beschreibung", value);
  }
  public final static String tag_Perimeter="Perimeter";
  public String getPerimeter() {
    String value=getattrvalue("Perimeter");
    return value;
  }
  public void setPerimeter(String value) {
    setattrvalue("Perimeter", value);
  }
  public final static String tag_GueltigerEintrag="GueltigerEintrag";
  public String getGueltigerEintrag() {
    String value=getattrvalue("GueltigerEintrag");
    return value;
  }
  public void setGueltigerEintrag(String value) {
    setattrvalue("GueltigerEintrag", value);
  }
  public final static String tag_Datum1="Datum1";
  public String getDatum1() {
    String value=getattrvalue("Datum1");
    return value;
  }
  public void setDatum1(String value) {
    setattrvalue("Datum1", value);
  }
}
