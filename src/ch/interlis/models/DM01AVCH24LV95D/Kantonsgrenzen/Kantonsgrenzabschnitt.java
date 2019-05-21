package ch.interlis.models.DM01AVCH24LV95D.Kantonsgrenzen;
public class Kantonsgrenzabschnitt extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Kantonsgrenzen.Kantonsgrenzabschnitt";
  public Kantonsgrenzabschnitt(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Geometrie="Geometrie";
  public String getGeometrie() {
    String value=getattrvalue("Geometrie");
    return value;
  }
  public void setGeometrie(String value) {
    setattrvalue("Geometrie", value);
  }
  public final static String tag_Gueltigkeit="Gueltigkeit";
  public Kantonsgrenzabschnitt_Gueltigkeit getGueltigkeit() {
    String value=getattrvalue("Gueltigkeit");
    return Kantonsgrenzabschnitt_Gueltigkeit.parseXmlCode(value);
  }
  public void setGueltigkeit(Kantonsgrenzabschnitt_Gueltigkeit value) {
    setattrvalue("Gueltigkeit", Kantonsgrenzabschnitt_Gueltigkeit.toXmlCode(value));
  }
}
