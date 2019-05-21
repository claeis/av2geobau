package ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie2;
public class LFP2Symbol extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.FixpunkteKategorie2.LFP2Symbol";
  public LFP2Symbol(String oid) {
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
  public final static String tag_LFP2Symbol_von="LFP2Symbol_von";
  public String getLFP2Symbol_von() {
    ch.interlis.iom.IomObject value=getattrobj("LFP2Symbol_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setLFP2Symbol_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("LFP2Symbol_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
