package ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte;
public class Flaechenelement extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Einzelobjekte.Flaechenelement";
  public Flaechenelement(String oid) {
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
  public final static String tag_Flaechenelement_von="Flaechenelement_von";
  public String getFlaechenelement_von() {
    ch.interlis.iom.IomObject value=getattrobj("Flaechenelement_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setFlaechenelement_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Flaechenelement_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
