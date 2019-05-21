package ch.interlis.models.DM01AVCH24LV95D.Hoehen;
public class Gelaendekante_Art{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Gelaendekante_Art(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Gelaendekante_Art value) {
     return value.value;
  }
  static public Gelaendekante_Art parseXmlCode(String value) {
     return (Gelaendekante_Art)valuev.get(value);
  }
  static public Gelaendekante_Art Bruchkante=new Gelaendekante_Art("Bruchkante");
  public final static String tag_Bruchkante="Bruchkante";
  static public Gelaendekante_Art Strukturlinie=new Gelaendekante_Art("Strukturlinie");
  public final static String tag_Strukturlinie="Strukturlinie";
  static public Gelaendekante_Art weitere=new Gelaendekante_Art("weitere");
  public final static String tag_weitere="weitere";
}
