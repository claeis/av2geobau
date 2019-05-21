package ch.interlis.models.DM01AVCH24LV95D.Landesgrenzen;
public class Landesgrenzabschnitt extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Landesgrenzen.Landesgrenzabschnitt";
  public Landesgrenzabschnitt(String oid) {
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
  public Landesgrenzabschnitt_Gueltigkeit getGueltigkeit() {
    String value=getattrvalue("Gueltigkeit");
    return Landesgrenzabschnitt_Gueltigkeit.parseXmlCode(value);
  }
  public void setGueltigkeit(Landesgrenzabschnitt_Gueltigkeit value) {
    setattrvalue("Gueltigkeit", Landesgrenzabschnitt_Gueltigkeit.toXmlCode(value));
  }
}
