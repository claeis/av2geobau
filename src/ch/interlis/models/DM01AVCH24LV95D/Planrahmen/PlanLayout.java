package ch.interlis.models.DM01AVCH24LV95D.Planrahmen;
public class PlanLayout extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Planrahmen.PlanLayout";
  public PlanLayout(String oid) {
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
  public final static String tag_Layouttyp="Layouttyp";
  public String getLayouttyp() {
    String value=getattrvalue("Layouttyp");
    return value;
  }
  public void setLayouttyp(String value) {
    setattrvalue("Layouttyp", value);
  }
  public final static String tag_Plannummer="Plannummer";
  public String getPlannummer() {
    String value=getattrvalue("Plannummer");
    return value;
  }
  public void setPlannummer(String value) {
    setattrvalue("Plannummer", value);
  }
  public final static String tag_Gemeindename="Gemeindename";
  public String getGemeindename() {
    String value=getattrvalue("Gemeindename");
    return value;
  }
  public void setGemeindename(String value) {
    setattrvalue("Gemeindename", value);
  }
  public final static String tag_Geometername="Geometername";
  public String getGeometername() {
    String value=getattrvalue("Geometername");
    return value;
  }
  public void setGeometername(String value) {
    setattrvalue("Geometername", value);
  }
  public final static String tag_Erstellungsdatum="Erstellungsdatum";
  public String getErstellungsdatum() {
    String value=getattrvalue("Erstellungsdatum");
    return value;
  }
  public void setErstellungsdatum(String value) {
    setattrvalue("Erstellungsdatum", value);
  }
  public final static String tag_NachfuehrungsGeometername="NachfuehrungsGeometername";
  public String getNachfuehrungsGeometername() {
    String value=getattrvalue("NachfuehrungsGeometername");
    return value;
  }
  public void setNachfuehrungsGeometername(String value) {
    setattrvalue("NachfuehrungsGeometername", value);
  }
  public final static String tag_Nachfuehrungsdatum="Nachfuehrungsdatum";
  public String getNachfuehrungsdatum() {
    String value=getattrvalue("Nachfuehrungsdatum");
    return value;
  }
  public void setNachfuehrungsdatum(String value) {
    setattrvalue("Nachfuehrungsdatum", value);
  }
  public final static String tag_Massstabszahl="Massstabszahl";
  public int getMassstabszahl() {
    String value=getattrvalue("Massstabszahl");
    return Integer.parseInt(value);
  }
  public void setMassstabszahl(int value) {
    setattrvalue("Massstabszahl", Integer.toString(value));
  }
  public final static String tag_Plannullpunkt="Plannullpunkt";
  public String getPlannullpunkt() {
    String value=getattrvalue("Plannullpunkt");
    return value;
  }
  public void setPlannullpunkt(String value) {
    setattrvalue("Plannullpunkt", value);
  }
  public final static String tag_E_Azimut="E_Azimut";
  public double getE_Azimut() {
    String value=getattrvalue("E_Azimut");
    return Double.parseDouble(value);
  }
  public void setE_Azimut(double value) {
    setattrvalue("E_Azimut", Double.toString(value));
  }
  public final static String tag_UebersichtMassstabszahl="UebersichtMassstabszahl";
  public int getUebersichtMassstabszahl() {
    String value=getattrvalue("UebersichtMassstabszahl");
    return Integer.parseInt(value);
  }
  public void setUebersichtMassstabszahl(int value) {
    setattrvalue("UebersichtMassstabszahl", Integer.toString(value));
  }
  public final static String tag_UebersichtPlannullpunkt="UebersichtPlannullpunkt";
  public String getUebersichtPlannullpunkt() {
    String value=getattrvalue("UebersichtPlannullpunkt");
    return value;
  }
  public void setUebersichtPlannullpunkt(String value) {
    setattrvalue("UebersichtPlannullpunkt", value);
  }
  public final static String tag_Mit_Koordinatennetz="Mit_Koordinatennetz";
  public PlanLayout_Mit_Koordinatennetz getMit_Koordinatennetz() {
    String value=getattrvalue("Mit_Koordinatennetz");
    return PlanLayout_Mit_Koordinatennetz.parseXmlCode(value);
  }
  public void setMit_Koordinatennetz(PlanLayout_Mit_Koordinatennetz value) {
    setattrvalue("Mit_Koordinatennetz", PlanLayout_Mit_Koordinatennetz.toXmlCode(value));
  }
}
