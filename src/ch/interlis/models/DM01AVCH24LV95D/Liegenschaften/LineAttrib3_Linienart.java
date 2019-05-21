package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class LineAttrib3_Linienart{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private LineAttrib3_Linienart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(LineAttrib3_Linienart value) {
     return value.value;
  }
  static public LineAttrib3_Linienart parseXmlCode(String value) {
     return (LineAttrib3_Linienart)valuev.get(value);
  }
  static public LineAttrib3_Linienart streitig=new LineAttrib3_Linienart("streitig");
  public final static String tag_streitig="streitig";
  static public LineAttrib3_Linienart unvollstaendig=new LineAttrib3_Linienart("unvollstaendig");
  public final static String tag_unvollstaendig="unvollstaendig";
}
