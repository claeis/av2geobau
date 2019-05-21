package ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie2;
public class LFP2 extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.FixpunkteKategorie2.LFP2";
  public LFP2(String oid) {
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
  public final static String tag_Geometrie="Geometrie";
  public String getGeometrie() {
    String value=getattrvalue("Geometrie");
    return value;
  }
  public void setGeometrie(String value) {
    setattrvalue("Geometrie", value);
  }
  public final static String tag_HoeheGeom="HoeheGeom";
  public double getHoeheGeom() {
    String value=getattrvalue("HoeheGeom");
    return Double.parseDouble(value);
  }
  public void setHoeheGeom(double value) {
    setattrvalue("HoeheGeom", Double.toString(value));
  }
  public final static String tag_LageGen="LageGen";
  public double getLageGen() {
    String value=getattrvalue("LageGen");
    return Double.parseDouble(value);
  }
  public void setLageGen(double value) {
    setattrvalue("LageGen", Double.toString(value));
  }
  public final static String tag_LageZuv="LageZuv";
  public ch.interlis.models.DM01AVCH24LV95D.Zuverlaessigkeit getLageZuv() {
    String value=getattrvalue("LageZuv");
    return ch.interlis.models.DM01AVCH24LV95D.Zuverlaessigkeit.parseXmlCode(value);
  }
  public void setLageZuv(ch.interlis.models.DM01AVCH24LV95D.Zuverlaessigkeit value) {
    setattrvalue("LageZuv", ch.interlis.models.DM01AVCH24LV95D.Zuverlaessigkeit.toXmlCode(value));
  }
  public final static String tag_HoeheGen="HoeheGen";
  public double getHoeheGen() {
    String value=getattrvalue("HoeheGen");
    return Double.parseDouble(value);
  }
  public void setHoeheGen(double value) {
    setattrvalue("HoeheGen", Double.toString(value));
  }
  public final static String tag_HoeheZuv="HoeheZuv";
  public ch.interlis.models.DM01AVCH24LV95D.Zuverlaessigkeit getHoeheZuv() {
    String value=getattrvalue("HoeheZuv");
    return ch.interlis.models.DM01AVCH24LV95D.Zuverlaessigkeit.parseXmlCode(value);
  }
  public void setHoeheZuv(ch.interlis.models.DM01AVCH24LV95D.Zuverlaessigkeit value) {
    setattrvalue("HoeheZuv", ch.interlis.models.DM01AVCH24LV95D.Zuverlaessigkeit.toXmlCode(value));
  }
  public final static String tag_Begehbarkeit="Begehbarkeit";
  public LFP2_Begehbarkeit getBegehbarkeit() {
    String value=getattrvalue("Begehbarkeit");
    return LFP2_Begehbarkeit.parseXmlCode(value);
  }
  public void setBegehbarkeit(LFP2_Begehbarkeit value) {
    setattrvalue("Begehbarkeit", LFP2_Begehbarkeit.toXmlCode(value));
  }
  public final static String tag_Punktzeichen="Punktzeichen";
  public ch.interlis.models.DM01AVCH24LV95D.Versicherungsart getPunktzeichen() {
    String value=getattrvalue("Punktzeichen");
    return ch.interlis.models.DM01AVCH24LV95D.Versicherungsart.parseXmlCode(value);
  }
  public void setPunktzeichen(ch.interlis.models.DM01AVCH24LV95D.Versicherungsart value) {
    setattrvalue("Punktzeichen", ch.interlis.models.DM01AVCH24LV95D.Versicherungsart.toXmlCode(value));
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
