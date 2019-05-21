package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class LineAttrib4_Linienart{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private LineAttrib4_Linienart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(LineAttrib4_Linienart value) {
     return value.value;
  }
  static public LineAttrib4_Linienart parseXmlCode(String value) {
     return (LineAttrib4_Linienart)valuev.get(value);
  }
  static public LineAttrib4_Linienart streitig=new LineAttrib4_Linienart("streitig");
  public final static String tag_streitig="streitig";
  static public LineAttrib4_Linienart unvollstaendig=new LineAttrib4_Linienart("unvollstaendig");
  public final static String tag_unvollstaendig="unvollstaendig";
}
