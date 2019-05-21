package ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen;
public class Gebaeudeeingang_Im_Gebaeude{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Gebaeudeeingang_Im_Gebaeude(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Gebaeudeeingang_Im_Gebaeude value) {
     return value.value;
  }
  static public Gebaeudeeingang_Im_Gebaeude parseXmlCode(String value) {
     return (Gebaeudeeingang_Im_Gebaeude)valuev.get(value);
  }
  static public Gebaeudeeingang_Im_Gebaeude BB=new Gebaeudeeingang_Im_Gebaeude("BB");
  public final static String tag_BB="BB";
  static public Gebaeudeeingang_Im_Gebaeude EO=new Gebaeudeeingang_Im_Gebaeude("EO");
  public final static String tag_EO="EO";
}
