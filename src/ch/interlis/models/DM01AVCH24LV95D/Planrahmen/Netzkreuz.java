package ch.interlis.models.DM01AVCH24LV95D.Planrahmen;
public class Netzkreuz extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Planrahmen.Netzkreuz";
  public Netzkreuz(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Pos="Pos";
  public String getPos() {
    String value=getattrvalue("Pos");
    return value;
  }
  public void setPos(String value) {
    setattrvalue("Pos", value);
  }
  public final static String tag_Ori="Ori";
  public double getOri() {
    String value=getattrvalue("Ori");
    return Double.parseDouble(value);
  }
  public void setOri(double value) {
    setattrvalue("Ori", Double.toString(value));
  }
  public final static String tag_Art="Art";
  public ch.interlis.models.DM01AVCH24LV95D.Planrahmen.Kreuzart getArt() {
    String value=getattrvalue("Art");
    return ch.interlis.models.DM01AVCH24LV95D.Planrahmen.Kreuzart.parseXmlCode(value);
  }
  public void setArt(ch.interlis.models.DM01AVCH24LV95D.Planrahmen.Kreuzart value) {
    setattrvalue("Art", ch.interlis.models.DM01AVCH24LV95D.Planrahmen.Kreuzart.toXmlCode(value));
  }
  public final static String tag_Netzkreuz_von="Netzkreuz_von";
  public String getNetzkreuz_von() {
    ch.interlis.iom.IomObject value=getattrobj("Netzkreuz_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setNetzkreuz_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Netzkreuz_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
