package ch.interlis.models.DM01AVCH24LV95D.Gemeindegrenzen;
public class Gemeinde extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Gemeindegrenzen.Gemeinde";
  public Gemeinde(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Name="Name";
  public String getName() {
    String value=getattrvalue("Name");
    return value;
  }
  public void setName(String value) {
    setattrvalue("Name", value);
  }
  public final static String tag_BFSNr="BFSNr";
  public int getBFSNr() {
    String value=getattrvalue("BFSNr");
    return Integer.parseInt(value);
  }
  public void setBFSNr(int value) {
    setattrvalue("BFSNr", Integer.toString(value));
  }
}
