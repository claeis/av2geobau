package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class LineAttrib5_Linienart{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private LineAttrib5_Linienart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(LineAttrib5_Linienart value) {
     return value.value;
  }
  static public LineAttrib5_Linienart parseXmlCode(String value) {
     return (LineAttrib5_Linienart)valuev.get(value);
  }
  static public LineAttrib5_Linienart streitig=new LineAttrib5_Linienart("streitig");
  public final static String tag_streitig="streitig";
  static public LineAttrib5_Linienart unvollstaendig=new LineAttrib5_Linienart("unvollstaendig");
  public final static String tag_unvollstaendig="unvollstaendig";
}
