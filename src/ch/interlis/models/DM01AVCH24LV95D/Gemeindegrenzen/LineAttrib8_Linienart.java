package ch.interlis.models.DM01AVCH24LV95D.Gemeindegrenzen;
public class LineAttrib8_Linienart{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private LineAttrib8_Linienart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(LineAttrib8_Linienart value) {
     return value.value;
  }
  static public LineAttrib8_Linienart parseXmlCode(String value) {
     return (LineAttrib8_Linienart)valuev.get(value);
  }
  static public LineAttrib8_Linienart rechtskraeftig=new LineAttrib8_Linienart("rechtskraeftig");
  public final static String tag_rechtskraeftig="rechtskraeftig";
  static public LineAttrib8_Linienart streitig=new LineAttrib8_Linienart("streitig");
  public final static String tag_streitig="streitig";
  static public LineAttrib8_Linienart provisorisch=new LineAttrib8_Linienart("provisorisch");
  public final static String tag_provisorisch="provisorisch";
  static public LineAttrib8_Linienart undefiniert=new LineAttrib8_Linienart("undefiniert");
  public final static String tag_undefiniert="undefiniert";
}
