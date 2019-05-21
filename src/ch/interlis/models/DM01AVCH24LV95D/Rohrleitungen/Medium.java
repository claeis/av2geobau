package ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen;
public class Medium{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Medium(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Medium value) {
     return value.value;
  }
  static public Medium parseXmlCode(String value) {
     return (Medium)valuev.get(value);
  }
  static public Medium Oel=new Medium("Oel");
  public final static String tag_Oel="Oel";
  static public Medium Gas=new Medium("Gas");
  public final static String tag_Gas="Gas";
  static public Medium weitere=new Medium("weitere");
  public final static String tag_weitere="weitere";
}
