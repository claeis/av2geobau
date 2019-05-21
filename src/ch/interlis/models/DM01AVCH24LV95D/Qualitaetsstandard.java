package ch.interlis.models.DM01AVCH24LV95D;
public class Qualitaetsstandard{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Qualitaetsstandard(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Qualitaetsstandard value) {
     return value.value;
  }
  static public Qualitaetsstandard parseXmlCode(String value) {
     return (Qualitaetsstandard)valuev.get(value);
  }
  static public Qualitaetsstandard AV93=new Qualitaetsstandard("AV93");
  public final static String tag_AV93="AV93";
  static public Qualitaetsstandard PV74=new Qualitaetsstandard("PV74");
  public final static String tag_PV74="PV74";
  static public Qualitaetsstandard PN=new Qualitaetsstandard("PN");
  public final static String tag_PN="PN";
  static public Qualitaetsstandard PEP=new Qualitaetsstandard("PEP");
  public final static String tag_PEP="PEP";
  static public Qualitaetsstandard weitere=new Qualitaetsstandard("weitere");
  public final static String tag_weitere="weitere";
}
