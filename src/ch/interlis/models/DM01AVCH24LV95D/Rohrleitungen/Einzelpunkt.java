package ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen;
public class Einzelpunkt extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Rohrleitungen.Einzelpunkt";
  public Einzelpunkt(String oid) {
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
  public final static String tag_ExaktDefiniert="ExaktDefiniert";
  public Einzelpunkt_ExaktDefiniert getExaktDefiniert() {
    String value=getattrvalue("ExaktDefiniert");
    return Einzelpunkt_ExaktDefiniert.parseXmlCode(value);
  }
  public void setExaktDefiniert(Einzelpunkt_ExaktDefiniert value) {
    setattrvalue("ExaktDefiniert", Einzelpunkt_ExaktDefiniert.toXmlCode(value));
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
