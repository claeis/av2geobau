package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class LineAttrib5 extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Liegenschaften.LineAttrib5";
  public LineAttrib5() {
    super(tag,null);
  }
  protected LineAttrib5(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Linienart="Linienart";
  public LineAttrib5_Linienart getLinienart() {
    String value=getattrvalue("Linienart");
    return LineAttrib5_Linienart.parseXmlCode(value);
  }
  public void setLinienart(LineAttrib5_Linienart value) {
    setattrvalue("Linienart", LineAttrib5_Linienart.toXmlCode(value));
  }
}
