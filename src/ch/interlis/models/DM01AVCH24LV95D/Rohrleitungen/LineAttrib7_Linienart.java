package ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen;
public class LineAttrib7_Linienart{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private LineAttrib7_Linienart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(LineAttrib7_Linienart value) {
     return value.value;
  }
  static public LineAttrib7_Linienart parseXmlCode(String value) {
     return (LineAttrib7_Linienart)valuev.get(value);
  }
  static public LineAttrib7_Linienart sichtbar=new LineAttrib7_Linienart("sichtbar");
  public final static String tag_sichtbar="sichtbar";
}
