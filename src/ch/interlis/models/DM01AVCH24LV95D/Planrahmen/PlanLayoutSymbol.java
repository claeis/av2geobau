package ch.interlis.models.DM01AVCH24LV95D.Planrahmen;
public class PlanLayoutSymbol extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Planrahmen.PlanLayoutSymbol";
  public PlanLayoutSymbol(String oid) {
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
  public ch.interlis.models.DM01AVCH24LV95D.Planrahmen.Symbolart getArt() {
    String value=getattrvalue("Art");
    return ch.interlis.models.DM01AVCH24LV95D.Planrahmen.Symbolart.parseXmlCode(value);
  }
  public void setArt(ch.interlis.models.DM01AVCH24LV95D.Planrahmen.Symbolart value) {
    setattrvalue("Art", ch.interlis.models.DM01AVCH24LV95D.Planrahmen.Symbolart.toXmlCode(value));
  }
  public final static String tag_PlanLayoutSymbol_von="PlanLayoutSymbol_von";
  public String getPlanLayoutSymbol_von() {
    ch.interlis.iom.IomObject value=getattrobj("PlanLayoutSymbol_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setPlanLayoutSymbol_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("PlanLayoutSymbol_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
