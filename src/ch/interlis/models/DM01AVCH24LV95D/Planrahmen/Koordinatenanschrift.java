package ch.interlis.models.DM01AVCH24LV95D.Planrahmen;
public class Koordinatenanschrift extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Planrahmen.Koordinatenanschrift";
  public Koordinatenanschrift(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Beschriftung="Beschriftung";
  public String getBeschriftung() {
    String value=getattrvalue("Beschriftung");
    return value;
  }
  public void setBeschriftung(String value) {
    setattrvalue("Beschriftung", value);
  }
  public final static String tag_Koordinatenanschrift_von="Koordinatenanschrift_von";
  public String getKoordinatenanschrift_von() {
    ch.interlis.iom.IomObject value=getattrobj("Koordinatenanschrift_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setKoordinatenanschrift_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Koordinatenanschrift_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
