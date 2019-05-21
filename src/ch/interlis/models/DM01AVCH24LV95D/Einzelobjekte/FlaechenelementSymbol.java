package ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte;
public class FlaechenelementSymbol extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Einzelobjekte.FlaechenelementSymbol";
  public FlaechenelementSymbol(String oid) {
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
  public final static String tag_FlaechenelementSymbol_von="FlaechenelementSymbol_von";
  public String getFlaechenelementSymbol_von() {
    ch.interlis.iom.IomObject value=getattrobj("FlaechenelementSymbol_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setFlaechenelementSymbol_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("FlaechenelementSymbol_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
