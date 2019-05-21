package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class Grenzpunkt extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Liegenschaften.Grenzpunkt";
  public Grenzpunkt(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
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
  public final static String tag_Punktzeichen="Punktzeichen";
  public ch.interlis.models.DM01AVCH24LV95D.Versicherungsart getPunktzeichen() {
    String value=getattrvalue("Punktzeichen");
    return ch.interlis.models.DM01AVCH24LV95D.Versicherungsart.parseXmlCode(value);
  }
  public void setPunktzeichen(ch.interlis.models.DM01AVCH24LV95D.Versicherungsart value) {
    setattrvalue("Punktzeichen", ch.interlis.models.DM01AVCH24LV95D.Versicherungsart.toXmlCode(value));
  }
  public final static String tag_ExaktDefiniert="ExaktDefiniert";
  public Grenzpunkt_ExaktDefiniert getExaktDefiniert() {
    String value=getattrvalue("ExaktDefiniert");
    return Grenzpunkt_ExaktDefiniert.parseXmlCode(value);
  }
  public void setExaktDefiniert(Grenzpunkt_ExaktDefiniert value) {
    setattrvalue("ExaktDefiniert", Grenzpunkt_ExaktDefiniert.toXmlCode(value));
  }
  public final static String tag_HoheitsgrenzsteinAlt="HoheitsgrenzsteinAlt";
  public Grenzpunkt_HoheitsgrenzsteinAlt getHoheitsgrenzsteinAlt() {
    String value=getattrvalue("HoheitsgrenzsteinAlt");
    return Grenzpunkt_HoheitsgrenzsteinAlt.parseXmlCode(value);
  }
  public void setHoheitsgrenzsteinAlt(Grenzpunkt_HoheitsgrenzsteinAlt value) {
    setattrvalue("HoheitsgrenzsteinAlt", Grenzpunkt_HoheitsgrenzsteinAlt.toXmlCode(value));
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
