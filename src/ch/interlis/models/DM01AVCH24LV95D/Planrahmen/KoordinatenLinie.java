package ch.interlis.models.DM01AVCH24LV95D.Planrahmen;
public class KoordinatenLinie extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Planrahmen.KoordinatenLinie";
  public KoordinatenLinie(String oid) {
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
  public final static String tag_KoordinatenLinie_von="KoordinatenLinie_von";
  public String getKoordinatenLinie_von() {
    ch.interlis.iom.IomObject value=getattrobj("KoordinatenLinie_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setKoordinatenLinie_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("KoordinatenLinie_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
