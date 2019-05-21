package ch.interlis.models.DM01AVCH24LV95D.Planrahmen;
public class Kreuzart{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Kreuzart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Kreuzart value) {
     return value.value;
  }
  static public Kreuzart parseXmlCode(String value) {
     return (Kreuzart)valuev.get(value);
  }
  static public Kreuzart Koord_Kreuz=new Kreuzart("Koord_Kreuz");
  public final static String tag_Koord_Kreuz="Koord_Kreuz";
  static public Kreuzart Netzkreuz=new Kreuzart("Netzkreuz");
  public final static String tag_Netzkreuz="Netzkreuz";
  static public Kreuzart Netzmarkierung=new Kreuzart("Netzmarkierung");
  public final static String tag_Netzmarkierung="Netzmarkierung";
  static public Kreuzart weitere=new Kreuzart("weitere");
  public final static String tag_weitere="weitere";
}
