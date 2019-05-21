package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class LineAttrib1_Linienart{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private LineAttrib1_Linienart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(LineAttrib1_Linienart value) {
     return value.value;
  }
  static public LineAttrib1_Linienart parseXmlCode(String value) {
     return (LineAttrib1_Linienart)valuev.get(value);
  }
  static public LineAttrib1_Linienart streitig=new LineAttrib1_Linienart("streitig");
  public final static String tag_streitig="streitig";
  static public LineAttrib1_Linienart unvollstaendig=new LineAttrib1_Linienart("unvollstaendig");
  public final static String tag_unvollstaendig="unvollstaendig";
}
