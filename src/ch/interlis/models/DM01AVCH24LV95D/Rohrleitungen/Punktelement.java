package ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen;
public class Punktelement extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Rohrleitungen.Punktelement";
  public Punktelement(String oid) {
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
  public final static String tag_HoeheGeom="HoeheGeom";
  public double getHoeheGeom() {
    String value=getattrvalue("HoeheGeom");
    return Double.parseDouble(value);
  }
  public void setHoeheGeom(double value) {
    setattrvalue("HoeheGeom", Double.toString(value));
  }
  public final static String tag_Ori="Ori";
  public double getOri() {
    String value=getattrvalue("Ori");
    return Double.parseDouble(value);
  }
  public void setOri(double value) {
    setattrvalue("Ori", Double.toString(value));
  }
  public final static String tag_Punktelement_von="Punktelement_von";
  public String getPunktelement_von() {
    ch.interlis.iom.IomObject value=getattrobj("Punktelement_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setPunktelement_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Punktelement_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
