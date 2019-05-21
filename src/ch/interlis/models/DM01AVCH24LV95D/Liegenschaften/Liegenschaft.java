package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class Liegenschaft extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Liegenschaften.Liegenschaft";
  public Liegenschaft(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_NummerTeilGrundstueck="NummerTeilGrundstueck";
  public String getNummerTeilGrundstueck() {
    String value=getattrvalue("NummerTeilGrundstueck");
    return value;
  }
  public void setNummerTeilGrundstueck(String value) {
    setattrvalue("NummerTeilGrundstueck", value);
  }
  public final static String tag_Geometrie="Geometrie";
  public String getGeometrie() {
    String value=getattrvalue("Geometrie");
    return value;
  }
  public void setGeometrie(String value) {
    setattrvalue("Geometrie", value);
  }
  public final static String tag_Flaechenmass="Flaechenmass";
  public int getFlaechenmass() {
    String value=getattrvalue("Flaechenmass");
    return Integer.parseInt(value);
  }
  public void setFlaechenmass(int value) {
    setattrvalue("Flaechenmass", Integer.toString(value));
  }
  public final static String tag_Liegenschaft_von="Liegenschaft_von";
  public String getLiegenschaft_von() {
    ch.interlis.iom.IomObject value=getattrobj("Liegenschaft_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setLiegenschaft_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Liegenschaft_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
