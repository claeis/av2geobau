package ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie3;
public class LFP3Symbol extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.FixpunkteKategorie3.LFP3Symbol";
  public LFP3Symbol(String oid) {
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
  public final static String tag_LFP3Symbol_von="LFP3Symbol_von";
  public String getLFP3Symbol_von() {
    ch.interlis.iom.IomObject value=getattrobj("LFP3Symbol_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setLFP3Symbol_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("LFP3Symbol_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
