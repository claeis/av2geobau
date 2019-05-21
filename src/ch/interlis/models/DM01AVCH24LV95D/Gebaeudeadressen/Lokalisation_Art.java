package ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen;
public class Lokalisation_Art{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Lokalisation_Art(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Lokalisation_Art value) {
     return value.value;
  }
  static public Lokalisation_Art parseXmlCode(String value) {
     return (Lokalisation_Art)valuev.get(value);
  }
  static public Lokalisation_Art BenanntesGebiet=new Lokalisation_Art("BenanntesGebiet");
  public final static String tag_BenanntesGebiet="BenanntesGebiet";
  static public Lokalisation_Art Strasse=new Lokalisation_Art("Strasse");
  public final static String tag_Strasse="Strasse";
  static public Lokalisation_Art Platz=new Lokalisation_Art("Platz");
  public final static String tag_Platz="Platz";
}
