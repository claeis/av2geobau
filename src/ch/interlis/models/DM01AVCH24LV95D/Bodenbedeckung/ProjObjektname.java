package ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung;
public class ProjObjektname extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Bodenbedeckung.ProjObjektname";
  public ProjObjektname(String oid) {
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
  public final static String tag_ProjObjektname_von="ProjObjektname_von";
  public String getProjObjektname_von() {
    ch.interlis.iom.IomObject value=getattrobj("ProjObjektname_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setProjObjektname_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("ProjObjektname_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
