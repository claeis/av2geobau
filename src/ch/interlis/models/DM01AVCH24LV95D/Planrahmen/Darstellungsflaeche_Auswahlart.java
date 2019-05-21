package ch.interlis.models.DM01AVCH24LV95D.Planrahmen;
public class Darstellungsflaeche_Auswahlart{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Darstellungsflaeche_Auswahlart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Darstellungsflaeche_Auswahlart value) {
     return value.value;
  }
  static public Darstellungsflaeche_Auswahlart parseXmlCode(String value) {
     return (Darstellungsflaeche_Auswahlart)valuev.get(value);
  }
  static public Darstellungsflaeche_Auswahlart vollstaendig=new Darstellungsflaeche_Auswahlart("vollstaendig");
  public final static String tag_vollstaendig="vollstaendig";
  static public Darstellungsflaeche_Auswahlart teilweise=new Darstellungsflaeche_Auswahlart("teilweise");
  public final static String tag_teilweise="teilweise";
}
