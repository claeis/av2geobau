package ch.interlis.models.DM01AVCH24LV95D.Landesgrenzen;
public class Landesgrenzabschnitt_Gueltigkeit{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Landesgrenzabschnitt_Gueltigkeit(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Landesgrenzabschnitt_Gueltigkeit value) {
     return value.value;
  }
  static public Landesgrenzabschnitt_Gueltigkeit parseXmlCode(String value) {
     return (Landesgrenzabschnitt_Gueltigkeit)valuev.get(value);
  }
  static public Landesgrenzabschnitt_Gueltigkeit rechtskraeftig=new Landesgrenzabschnitt_Gueltigkeit("rechtskraeftig");
  public final static String tag_rechtskraeftig="rechtskraeftig";
  static public Landesgrenzabschnitt_Gueltigkeit streitig=new Landesgrenzabschnitt_Gueltigkeit("streitig");
  public final static String tag_streitig="streitig";
  static public Landesgrenzabschnitt_Gueltigkeit provisorisch=new Landesgrenzabschnitt_Gueltigkeit("provisorisch");
  public final static String tag_provisorisch="provisorisch";
  static public Landesgrenzabschnitt_Gueltigkeit undefiniert=new Landesgrenzabschnitt_Gueltigkeit("undefiniert");
  public final static String tag_undefiniert="undefiniert";
}
