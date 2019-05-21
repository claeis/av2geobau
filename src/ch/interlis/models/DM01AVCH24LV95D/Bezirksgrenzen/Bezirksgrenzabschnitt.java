package ch.interlis.models.DM01AVCH24LV95D.Bezirksgrenzen;
public class Bezirksgrenzabschnitt extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Bezirksgrenzen.Bezirksgrenzabschnitt";
  public Bezirksgrenzabschnitt(String oid) {
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
  public Bezirksgrenzabschnitt_Gueltigkeit getGueltigkeit() {
    String value=getattrvalue("Gueltigkeit");
    return Bezirksgrenzabschnitt_Gueltigkeit.parseXmlCode(value);
  }
  public void setGueltigkeit(Bezirksgrenzabschnitt_Gueltigkeit value) {
    setattrvalue("Gueltigkeit", Bezirksgrenzabschnitt_Gueltigkeit.toXmlCode(value));
  }
}
