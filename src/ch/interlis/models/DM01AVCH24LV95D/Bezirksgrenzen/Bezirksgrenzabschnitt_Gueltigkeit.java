package ch.interlis.models.DM01AVCH24LV95D.Bezirksgrenzen;
public class Bezirksgrenzabschnitt_Gueltigkeit{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Bezirksgrenzabschnitt_Gueltigkeit(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Bezirksgrenzabschnitt_Gueltigkeit value) {
     return value.value;
  }
  static public Bezirksgrenzabschnitt_Gueltigkeit parseXmlCode(String value) {
     return (Bezirksgrenzabschnitt_Gueltigkeit)valuev.get(value);
  }
  static public Bezirksgrenzabschnitt_Gueltigkeit rechtskraeftig=new Bezirksgrenzabschnitt_Gueltigkeit("rechtskraeftig");
  public final static String tag_rechtskraeftig="rechtskraeftig";
  static public Bezirksgrenzabschnitt_Gueltigkeit streitig=new Bezirksgrenzabschnitt_Gueltigkeit("streitig");
  public final static String tag_streitig="streitig";
  static public Bezirksgrenzabschnitt_Gueltigkeit provisorisch=new Bezirksgrenzabschnitt_Gueltigkeit("provisorisch");
  public final static String tag_provisorisch="provisorisch";
  static public Bezirksgrenzabschnitt_Gueltigkeit undefiniert=new Bezirksgrenzabschnitt_Gueltigkeit("undefiniert");
  public final static String tag_undefiniert="undefiniert";
}
