package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class LineAttrib1 extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Liegenschaften.LineAttrib1";
  public LineAttrib1() {
    super(tag,null);
  }
  protected LineAttrib1(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Linienart="Linienart";
  public LineAttrib1_Linienart getLinienart() {
    String value=getattrvalue("Linienart");
    return LineAttrib1_Linienart.parseXmlCode(value);
  }
  public void setLinienart(LineAttrib1_Linienart value) {
    setattrvalue("Linienart", LineAttrib1_Linienart.toXmlCode(value));
  }
}
