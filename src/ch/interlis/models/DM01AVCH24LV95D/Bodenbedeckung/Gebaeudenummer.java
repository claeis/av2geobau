package ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung;
public class Gebaeudenummer extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Bodenbedeckung.Gebaeudenummer";
  public Gebaeudenummer(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Nummer="Nummer";
  public String getNummer() {
    String value=getattrvalue("Nummer");
    return value;
  }
  public void setNummer(String value) {
    setattrvalue("Nummer", value);
  }
  public final static String tag_GWR_EGID="GWR_EGID";
  public int getGWR_EGID() {
    String value=getattrvalue("GWR_EGID");
    return Integer.parseInt(value);
  }
  public void setGWR_EGID(int value) {
    setattrvalue("GWR_EGID", Integer.toString(value));
  }
  public final static String tag_Gebaeudenummer_von="Gebaeudenummer_von";
  public String getGebaeudenummer_von() {
    ch.interlis.iom.IomObject value=getattrobj("Gebaeudenummer_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setGebaeudenummer_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Gebaeudenummer_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
