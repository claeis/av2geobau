package ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen;
public class Lokalisation_Nummerierungsprinzip{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Lokalisation_Nummerierungsprinzip(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Lokalisation_Nummerierungsprinzip value) {
     return value.value;
  }
  static public Lokalisation_Nummerierungsprinzip parseXmlCode(String value) {
     return (Lokalisation_Nummerierungsprinzip)valuev.get(value);
  }
  static public Lokalisation_Nummerierungsprinzip keineNummern=new Lokalisation_Nummerierungsprinzip("keineNummern");
  public final static String tag_keineNummern="keineNummern";
  static public Lokalisation_Nummerierungsprinzip beliebig=new Lokalisation_Nummerierungsprinzip("beliebig");
  public final static String tag_beliebig="beliebig";
  static public Lokalisation_Nummerierungsprinzip aufsteigend=new Lokalisation_Nummerierungsprinzip("aufsteigend");
  public final static String tag_aufsteigend="aufsteigend";
  static public Lokalisation_Nummerierungsprinzip ungeradelinks=new Lokalisation_Nummerierungsprinzip("ungeradelinks");
  public final static String tag_ungeradelinks="ungeradelinks";
  static public Lokalisation_Nummerierungsprinzip geradelinks=new Lokalisation_Nummerierungsprinzip("geradelinks");
  public final static String tag_geradelinks="geradelinks";
}
