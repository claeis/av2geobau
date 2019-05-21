package ch.interlis.models.DM01AVCH24LV95D.Planrahmen;
public class Planbeschriftung extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Planrahmen.Planbeschriftung";
  public Planbeschriftung(String oid) {
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
  public final static String tag_Art="Art";
  public ch.interlis.models.DM01AVCH24LV95D.Planrahmen.Beschriftungsart getArt() {
    String value=getattrvalue("Art");
    return ch.interlis.models.DM01AVCH24LV95D.Planrahmen.Beschriftungsart.parseXmlCode(value);
  }
  public void setArt(ch.interlis.models.DM01AVCH24LV95D.Planrahmen.Beschriftungsart value) {
    setattrvalue("Art", ch.interlis.models.DM01AVCH24LV95D.Planrahmen.Beschriftungsart.toXmlCode(value));
  }
  public final static String tag_Planbeschriftung_von="Planbeschriftung_von";
  public String getPlanbeschriftung_von() {
    ch.interlis.iom.IomObject value=getattrobj("Planbeschriftung_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setPlanbeschriftung_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Planbeschriftung_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
