package ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen;
public class LineAttrib7 extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Rohrleitungen.LineAttrib7";
  public LineAttrib7() {
    super(tag,null);
  }
  protected LineAttrib7(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Linienart="Linienart";
  public LineAttrib7_Linienart getLinienart() {
    String value=getattrvalue("Linienart");
    return LineAttrib7_Linienart.parseXmlCode(value);
  }
  public void setLinienart(LineAttrib7_Linienart value) {
    setattrvalue("Linienart", LineAttrib7_Linienart.toXmlCode(value));
  }
}
