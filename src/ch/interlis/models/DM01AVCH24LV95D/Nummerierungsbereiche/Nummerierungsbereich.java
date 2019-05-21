package ch.interlis.models.DM01AVCH24LV95D.Nummerierungsbereiche;
public class Nummerierungsbereich extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Nummerierungsbereiche.Nummerierungsbereich";
  public Nummerierungsbereich(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Kt="Kt";
  public ch.interlis.models.DM01AVCH24LV95D.Nummerierungsbereiche.Kantonskuerzel getKt() {
    String value=getattrvalue("Kt");
    return ch.interlis.models.DM01AVCH24LV95D.Nummerierungsbereiche.Kantonskuerzel.parseXmlCode(value);
  }
  public void setKt(ch.interlis.models.DM01AVCH24LV95D.Nummerierungsbereiche.Kantonskuerzel value) {
    setattrvalue("Kt", ch.interlis.models.DM01AVCH24LV95D.Nummerierungsbereiche.Kantonskuerzel.toXmlCode(value));
  }
  public final static String tag_NBNummer="NBNummer";
  public String getNBNummer() {
    String value=getattrvalue("NBNummer");
    return value;
  }
  public void setNBNummer(String value) {
    setattrvalue("NBNummer", value);
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
