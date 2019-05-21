package ch.interlis.models.DM01AVCH24LV95D.PLZOrtschaft;
public class OrtschaftsVerbund extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsVerbund";
  public OrtschaftsVerbund(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Leer="Leer";
  public String getLeer() {
    String value=getattrvalue("Leer");
    return value;
  }
  public void setLeer(String value) {
    setattrvalue("Leer", value);
  }
}
