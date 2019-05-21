package ch.interlis.models.DM01AVCH24LV95D.Liegenschaften;
public class LineAttrib2_Linienart{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private LineAttrib2_Linienart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(LineAttrib2_Linienart value) {
     return value.value;
  }
  static public LineAttrib2_Linienart parseXmlCode(String value) {
     return (LineAttrib2_Linienart)valuev.get(value);
  }
  static public LineAttrib2_Linienart streitig=new LineAttrib2_Linienart("streitig");
  public final static String tag_streitig="streitig";
  static public LineAttrib2_Linienart unvollstaendig=new LineAttrib2_Linienart("unvollstaendig");
  public final static String tag_unvollstaendig="unvollstaendig";
}
