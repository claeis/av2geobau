package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class LineAttrib6_Linienart{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private LineAttrib6_Linienart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(LineAttrib6_Linienart value) {
     return value.value;
  }
  static public LineAttrib6_Linienart parseXmlCode(String value) {
     return (LineAttrib6_Linienart)valuev.get(value);
  }
  static public LineAttrib6_Linienart streitig=new LineAttrib6_Linienart("streitig");
  public final static String tag_streitig="streitig";
  static public LineAttrib6_Linienart unvollstaendig=new LineAttrib6_Linienart("unvollstaendig");
  public final static String tag_unvollstaendig="unvollstaendig";
}
