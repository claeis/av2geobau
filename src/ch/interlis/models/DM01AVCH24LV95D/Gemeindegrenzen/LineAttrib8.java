package ch.interlis.models.DM01AVCH24LV95D.Gemeindegrenzen;
public class LineAttrib8 extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Gemeindegrenzen.LineAttrib8";
  public LineAttrib8() {
    super(tag,null);
  }
  protected LineAttrib8(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Linienart="Linienart";
  public LineAttrib8_Linienart getLinienart() {
    String value=getattrvalue("Linienart");
    return LineAttrib8_Linienart.parseXmlCode(value);
  }
  public void setLinienart(LineAttrib8_Linienart value) {
    setattrvalue("Linienart", LineAttrib8_Linienart.toXmlCode(value));
  }
}
