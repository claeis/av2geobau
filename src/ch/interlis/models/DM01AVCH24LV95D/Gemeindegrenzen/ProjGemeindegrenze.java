package ch.interlis.models.DM01AVCH24LV95D.Gemeindegrenzen;
public class ProjGemeindegrenze extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Gemeindegrenzen.ProjGemeindegrenze";
  public ProjGemeindegrenze(String oid) {
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
  public final static String tag_ProjGemeindegrenze_von="ProjGemeindegrenze_von";
  public String getProjGemeindegrenze_von() {
    ch.interlis.iom.IomObject value=getattrobj("ProjGemeindegrenze_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setProjGemeindegrenze_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("ProjGemeindegrenze_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
