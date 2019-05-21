package ch.interlis.models.DM01AVCH24LV95D.Hoehen;
public class Gelaendekante extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Hoehen.Gelaendekante";
  public Gelaendekante(String oid) {
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
  public final static String tag_Qualitaet="Qualitaet";
  public ch.interlis.models.DM01AVCH24LV95D.Qualitaetsstandard getQualitaet() {
    String value=getattrvalue("Qualitaet");
    return ch.interlis.models.DM01AVCH24LV95D.Qualitaetsstandard.parseXmlCode(value);
  }
  public void setQualitaet(ch.interlis.models.DM01AVCH24LV95D.Qualitaetsstandard value) {
    setattrvalue("Qualitaet", ch.interlis.models.DM01AVCH24LV95D.Qualitaetsstandard.toXmlCode(value));
  }
  public final static String tag_Art="Art";
  public Gelaendekante_Art getArt() {
    String value=getattrvalue("Art");
    return Gelaendekante_Art.parseXmlCode(value);
  }
  public void setArt(Gelaendekante_Art value) {
    setattrvalue("Art", Gelaendekante_Art.toXmlCode(value));
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
