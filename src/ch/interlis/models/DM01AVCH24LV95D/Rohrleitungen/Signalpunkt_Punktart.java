package ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen;
public class Signalpunkt_Punktart{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Signalpunkt_Punktart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Signalpunkt_Punktart value) {
     return value.value;
  }
  static public Signalpunkt_Punktart parseXmlCode(String value) {
     return (Signalpunkt_Punktart)valuev.get(value);
  }
  static public Signalpunkt_Punktart Signal=new Signalpunkt_Punktart("Signal");
  public final static String tag_Signal="Signal";
  static public Signalpunkt_Punktart Tafel_Stein=new Signalpunkt_Punktart("Tafel_Stein");
  public final static String tag_Tafel_Stein="Tafel_Stein";
  static public Signalpunkt_Punktart weitere=new Signalpunkt_Punktart("weitere");
  public final static String tag_weitere="weitere";
}
