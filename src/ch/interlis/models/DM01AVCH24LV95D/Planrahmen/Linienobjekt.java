package ch.interlis.models.DM01AVCH24LV95D.Planrahmen;
public class Linienobjekt extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Planrahmen.Linienobjekt";
  public Linienobjekt(String oid) {
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
  public final static String tag_Art="Art";
  public ch.interlis.models.DM01AVCH24LV95D.Planrahmen.Linientyp getArt() {
    String value=getattrvalue("Art");
    return ch.interlis.models.DM01AVCH24LV95D.Planrahmen.Linientyp.parseXmlCode(value);
  }
  public void setArt(ch.interlis.models.DM01AVCH24LV95D.Planrahmen.Linientyp value) {
    setattrvalue("Art", ch.interlis.models.DM01AVCH24LV95D.Planrahmen.Linientyp.toXmlCode(value));
  }
  public final static String tag_Linienobjekt_von="Linienobjekt_von";
  public String getLinienobjekt_von() {
    ch.interlis.iom.IomObject value=getattrobj("Linienobjekt_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setLinienobjekt_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Linienobjekt_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
