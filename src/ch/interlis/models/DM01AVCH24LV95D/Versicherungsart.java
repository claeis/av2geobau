package ch.interlis.models.DM01AVCH24LV95D;
public class Versicherungsart{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Versicherungsart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Versicherungsart value) {
     return value.value;
  }
  static public Versicherungsart parseXmlCode(String value) {
     return (Versicherungsart)valuev.get(value);
  }
  static public Versicherungsart Stein=new Versicherungsart("Stein");
  public final static String tag_Stein="Stein";
  static public Versicherungsart Kunststoffzeichen=new Versicherungsart("Kunststoffzeichen");
  public final static String tag_Kunststoffzeichen="Kunststoffzeichen";
  static public Versicherungsart Bolzen=new Versicherungsart("Bolzen");
  public final static String tag_Bolzen="Bolzen";
  static public Versicherungsart Rohr=new Versicherungsart("Rohr");
  public final static String tag_Rohr="Rohr";
  static public Versicherungsart Pfahl=new Versicherungsart("Pfahl");
  public final static String tag_Pfahl="Pfahl";
  static public Versicherungsart Kreuz=new Versicherungsart("Kreuz");
  public final static String tag_Kreuz="Kreuz";
  static public Versicherungsart unversichert=new Versicherungsart("unversichert");
  public final static String tag_unversichert="unversichert";
  static public Versicherungsart weitere=new Versicherungsart("weitere");
  public final static String tag_weitere="weitere";
}
