package ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte;
public class Objektname extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Einzelobjekte.Objektname";
  public Objektname(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Name="Name";
  public String getName() {
    String value=getattrvalue("Name");
    return value;
  }
  public void setName(String value) {
    setattrvalue("Name", value);
  }
  public final static String tag_Objektname_von="Objektname_von";
  public String getObjektname_von() {
    ch.interlis.iom.IomObject value=getattrobj("Objektname_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setObjektname_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Objektname_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
