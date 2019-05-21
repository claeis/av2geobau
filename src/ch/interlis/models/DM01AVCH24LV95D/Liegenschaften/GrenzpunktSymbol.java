package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class GrenzpunktSymbol extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Liegenschaften.GrenzpunktSymbol";
  public GrenzpunktSymbol(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Ori="Ori";
  public double getOri() {
    String value=getattrvalue("Ori");
    return Double.parseDouble(value);
  }
  public void setOri(double value) {
    setattrvalue("Ori", Double.toString(value));
  }
  public final static String tag_GrenzpunktSymbol_von="GrenzpunktSymbol_von";
  public String getGrenzpunktSymbol_von() {
    ch.interlis.iom.IomObject value=getattrobj("GrenzpunktSymbol_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setGrenzpunktSymbol_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("GrenzpunktSymbol_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
