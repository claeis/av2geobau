package ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung;
public class BoFlaecheSymbol extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Bodenbedeckung.BoFlaecheSymbol";
  public BoFlaecheSymbol(String oid) {
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
  public final static String tag_BoFlaecheSymbol_von="BoFlaecheSymbol_von";
  public String getBoFlaecheSymbol_von() {
    ch.interlis.iom.IomObject value=getattrobj("BoFlaecheSymbol_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setBoFlaecheSymbol_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("BoFlaecheSymbol_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
