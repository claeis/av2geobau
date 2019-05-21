package ch.interlis.models.DM01AVCH24LV95D;
public class Schriftstil{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Schriftstil(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Schriftstil value) {
     return value.value;
  }
  static public Schriftstil parseXmlCode(String value) {
     return (Schriftstil)valuev.get(value);
  }
  static public Schriftstil normal=new Schriftstil("normal");
  public final static String tag_normal="normal";
  static public Schriftstil gesperrt=new Schriftstil("gesperrt");
  public final static String tag_gesperrt="gesperrt";
  static public Schriftstil weitere=new Schriftstil("weitere");
  public final static String tag_weitere="weitere";
}
