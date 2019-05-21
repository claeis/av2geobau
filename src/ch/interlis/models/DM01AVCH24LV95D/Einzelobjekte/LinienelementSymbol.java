package ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte;
public class LinienelementSymbol extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Einzelobjekte.LinienelementSymbol";
  public LinienelementSymbol(String oid) {
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
  public final static String tag_LinienelementSymbol_von="LinienelementSymbol_von";
  public String getLinienelementSymbol_von() {
    ch.interlis.iom.IomObject value=getattrobj("LinienelementSymbol_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setLinienelementSymbol_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("LinienelementSymbol_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
