package ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen;
public class Strassenstueck_IstAchse{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Strassenstueck_IstAchse(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Strassenstueck_IstAchse value) {
     return value.value;
  }
  static public Strassenstueck_IstAchse parseXmlCode(String value) {
     return (Strassenstueck_IstAchse)valuev.get(value);
  }
  static public Strassenstueck_IstAchse ja=new Strassenstueck_IstAchse("ja");
  public final static String tag_ja="ja";
  static public Strassenstueck_IstAchse nein=new Strassenstueck_IstAchse("nein");
  public final static String tag_nein="nein";
}
