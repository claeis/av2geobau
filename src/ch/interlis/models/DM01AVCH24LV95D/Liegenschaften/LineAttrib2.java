package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class LineAttrib2 extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Liegenschaften.LineAttrib2";
  public LineAttrib2() {
    super(tag,null);
  }
  protected LineAttrib2(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Linienart="Linienart";
  public LineAttrib2_Linienart getLinienart() {
    String value=getattrvalue("Linienart");
    return LineAttrib2_Linienart.parseXmlCode(value);
  }
  public void setLinienart(LineAttrib2_Linienart value) {
    setattrvalue("Linienart", LineAttrib2_Linienart.toXmlCode(value));
  }
}
