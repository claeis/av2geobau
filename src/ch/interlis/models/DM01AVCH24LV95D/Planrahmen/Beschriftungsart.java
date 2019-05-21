package ch.interlis.models.DM01AVCH24LV95D.Planrahmen;
public class Beschriftungsart{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Beschriftungsart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Beschriftungsart value) {
     return value.value;
  }
  static public Beschriftungsart parseXmlCode(String value) {
     return (Beschriftungsart)valuev.get(value);
  }
  static public Beschriftungsart Nachbarn=new Beschriftungsart("Nachbarn");
  public final static String tag_Nachbarn="Nachbarn";
  static public Beschriftungsart Nachbarplan=new Beschriftungsart("Nachbarplan");
  public final static String tag_Nachbarplan="Nachbarplan";
  static public Beschriftungsart UebersichtNachbarn=new Beschriftungsart("UebersichtNachbarn");
  public final static String tag_UebersichtNachbarn="UebersichtNachbarn";
  static public Beschriftungsart Strassenrichtung=new Beschriftungsart("Strassenrichtung");
  public final static String tag_Strassenrichtung="Strassenrichtung";
  static public Beschriftungsart LK_Nr=new Beschriftungsart("LK_Nr");
  public final static String tag_LK_Nr="LK_Nr";
  static public Beschriftungsart BFSNr=new Beschriftungsart("BFSNr");
  public final static String tag_BFSNr="BFSNr";
  static public Beschriftungsart weitere=new Beschriftungsart("weitere");
  public final static String tag_weitere="weitere";
}
