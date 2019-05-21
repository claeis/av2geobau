package ch.interlis.models.DM01AVCH24LV95D.Kantonsgrenzen;
public class Kantonsgrenzabschnitt_Gueltigkeit{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Kantonsgrenzabschnitt_Gueltigkeit(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Kantonsgrenzabschnitt_Gueltigkeit value) {
     return value.value;
  }
  static public Kantonsgrenzabschnitt_Gueltigkeit parseXmlCode(String value) {
     return (Kantonsgrenzabschnitt_Gueltigkeit)valuev.get(value);
  }
  static public Kantonsgrenzabschnitt_Gueltigkeit rechtskraeftig=new Kantonsgrenzabschnitt_Gueltigkeit("rechtskraeftig");
  public final static String tag_rechtskraeftig="rechtskraeftig";
  static public Kantonsgrenzabschnitt_Gueltigkeit streitig=new Kantonsgrenzabschnitt_Gueltigkeit("streitig");
  public final static String tag_streitig="streitig";
  static public Kantonsgrenzabschnitt_Gueltigkeit provisorisch=new Kantonsgrenzabschnitt_Gueltigkeit("provisorisch");
  public final static String tag_provisorisch="provisorisch";
  static public Kantonsgrenzabschnitt_Gueltigkeit undefiniert=new Kantonsgrenzabschnitt_Gueltigkeit("undefiniert");
  public final static String tag_undefiniert="undefiniert";
}
