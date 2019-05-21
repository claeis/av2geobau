package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class LineAttrib6 extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Liegenschaften.LineAttrib6";
  public LineAttrib6() {
    super(tag,null);
  }
  protected LineAttrib6(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Linienart="Linienart";
  public LineAttrib6_Linienart getLinienart() {
    String value=getattrvalue("Linienart");
    return LineAttrib6_Linienart.parseXmlCode(value);
  }
  public void setLinienart(LineAttrib6_Linienart value) {
    setattrvalue("Linienart", LineAttrib6_Linienart.toXmlCode(value));
  }
}
