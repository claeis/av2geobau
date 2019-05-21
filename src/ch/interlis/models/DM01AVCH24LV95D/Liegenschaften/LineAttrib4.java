package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class LineAttrib4 extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Liegenschaften.LineAttrib4";
  public LineAttrib4() {
    super(tag,null);
  }
  protected LineAttrib4(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Linienart="Linienart";
  public LineAttrib4_Linienart getLinienart() {
    String value=getattrvalue("Linienart");
    return LineAttrib4_Linienart.parseXmlCode(value);
  }
  public void setLinienart(LineAttrib4_Linienart value) {
    setattrvalue("Linienart", LineAttrib4_Linienart.toXmlCode(value));
  }
}
