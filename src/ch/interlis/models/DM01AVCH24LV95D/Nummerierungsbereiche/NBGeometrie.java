package ch.interlis.models.DM01AVCH24LV95D.Nummerierungsbereiche;
public class NBGeometrie extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Nummerierungsbereiche.NBGeometrie";
  public NBGeometrie(String oid) {
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
  public final static String tag_NBGeometrie_von="NBGeometrie_von";
  public String getNBGeometrie_von() {
    ch.interlis.iom.IomObject value=getattrobj("NBGeometrie_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setNBGeometrie_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("NBGeometrie_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
