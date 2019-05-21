package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class ProjGrundstueck extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Liegenschaften.ProjGrundstueck";
  public ProjGrundstueck(String oid) {
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
  public final static String tag_EGRIS_EGRID="EGRIS_EGRID";
  public String getEGRIS_EGRID() {
    String value=getattrvalue("EGRIS_EGRID");
    return value;
  }
  public void setEGRIS_EGRID(String value) {
    setattrvalue("EGRIS_EGRID", value);
  }
  public final static String tag_Gueltigkeit="Gueltigkeit";
  public ProjGrundstueck_Gueltigkeit getGueltigkeit() {
    String value=getattrvalue("Gueltigkeit");
    return ProjGrundstueck_Gueltigkeit.parseXmlCode(value);
  }
  public void setGueltigkeit(ProjGrundstueck_Gueltigkeit value) {
    setattrvalue("Gueltigkeit", ProjGrundstueck_Gueltigkeit.toXmlCode(value));
  }
  public final static String tag_Vollstaendigkeit="Vollstaendigkeit";
  public ProjGrundstueck_Vollstaendigkeit getVollstaendigkeit() {
    String value=getattrvalue("Vollstaendigkeit");
    return ProjGrundstueck_Vollstaendigkeit.parseXmlCode(value);
  }
  public void setVollstaendigkeit(ProjGrundstueck_Vollstaendigkeit value) {
    setattrvalue("Vollstaendigkeit", ProjGrundstueck_Vollstaendigkeit.toXmlCode(value));
  }
  public final static String tag_Art="Art";
  public ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.Grundstuecksart getArt() {
    String value=getattrvalue("Art");
    return ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.Grundstuecksart.parseXmlCode(value);
  }
  public void setArt(ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.Grundstuecksart value) {
    setattrvalue("Art", ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.Grundstuecksart.toXmlCode(value));
  }
  public final static String tag_GesamteFlaechenmass="GesamteFlaechenmass";
  public int getGesamteFlaechenmass() {
    String value=getattrvalue("GesamteFlaechenmass");
    return Integer.parseInt(value);
  }
  public void setGesamteFlaechenmass(int value) {
    setattrvalue("GesamteFlaechenmass", Integer.toString(value));
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
