package ch.interlis.models.DM01AVCH24LV95D.Planrahmen;
public class Symbolart{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Symbolart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Symbolart value) {
     return value.value;
  }
  static public Symbolart parseXmlCode(String value) {
     return (Symbolart)valuev.get(value);
  }
  static public Symbolart Nordpfeil=new Symbolart("Nordpfeil");
  public final static String tag_Nordpfeil="Nordpfeil";
  static public Symbolart weitere=new Symbolart("weitere");
  public final static String tag_weitere="weitere";
}
