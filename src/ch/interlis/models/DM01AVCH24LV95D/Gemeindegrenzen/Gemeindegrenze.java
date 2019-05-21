package ch.interlis.models.DM01AVCH24LV95D.Gemeindegrenzen;
public class Gemeindegrenze extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Gemeindegrenzen.Gemeindegrenze";
  public Gemeindegrenze(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Geometrie="Geometrie";
  public String getGeometrie() {
    String value=getattrvalue("Geometrie");
    return value;
  }
  public void setGeometrie(String value) {
    setattrvalue("Geometrie", value);
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
  public final static String tag_Gemeindegrenze_von="Gemeindegrenze_von";
  public String getGemeindegrenze_von() {
    ch.interlis.iom.IomObject value=getattrobj("Gemeindegrenze_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setGemeindegrenze_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Gemeindegrenze_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
