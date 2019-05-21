package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class LineAttrib3 extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Liegenschaften.LineAttrib3";
  public LineAttrib3() {
    super(tag,null);
  }
  protected LineAttrib3(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Linienart="Linienart";
  public LineAttrib3_Linienart getLinienart() {
    String value=getattrvalue("Linienart");
    return LineAttrib3_Linienart.parseXmlCode(value);
  }
  public void setLinienart(LineAttrib3_Linienart value) {
    setattrvalue("Linienart", LineAttrib3_Linienart.toXmlCode(value));
  }
}
