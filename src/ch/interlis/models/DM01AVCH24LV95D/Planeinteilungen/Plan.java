package ch.interlis.models.DM01AVCH24LV95D.Planeinteilungen;
public class Plan extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Planeinteilungen.Plan";
  public Plan(String oid) {
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
  public final static String tag_Nummer="Nummer";
  public String getNummer() {
    String value=getattrvalue("Nummer");
    return value;
  }
  public void setNummer(String value) {
    setattrvalue("Nummer", value);
  }
  public final static String tag_TechDossier="TechDossier";
  public String getTechDossier() {
    String value=getattrvalue("TechDossier");
    return value;
  }
  public void setTechDossier(String value) {
    setattrvalue("TechDossier", value);
  }
  public final static String tag_GueltigerEintrag="GueltigerEintrag";
  public String getGueltigerEintrag() {
    String value=getattrvalue("GueltigerEintrag");
    return value;
  }
  public void setGueltigerEintrag(String value) {
    setattrvalue("GueltigerEintrag", value);
  }
}
