package ch.interlis.models.DM01AVCH24LV95D.Planrahmen;
public class Linientyp{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Linientyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Linientyp value) {
     return value.value;
  }
  static public Linientyp parseXmlCode(String value) {
     return (Linientyp)valuev.get(value);
  }
  static public Linientyp standard=new Linientyp("standard");
  public final static String tag_standard="standard";
  static public Linientyp weitere=new Linientyp("weitere");
  public final static String tag_weitere="weitere";
}
