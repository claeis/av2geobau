package ch.interlis.models.DM01AVCH24LV95D.Hoehen;
public class Aussparung_Art{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Aussparung_Art(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Aussparung_Art value) {
     return value.value;
  }
  static public Aussparung_Art parseXmlCode(String value) {
     return (Aussparung_Art)valuev.get(value);
  }
  static public Aussparung_Art ToteFlaeche=new Aussparung_Art("ToteFlaeche");
  public final static String tag_ToteFlaeche="ToteFlaeche";
  static public Aussparung_Art weitere=new Aussparung_Art("weitere");
  public final static String tag_weitere="weitere";
}
