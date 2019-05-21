package ch.interlis.models.DM01AVCH24LV95D.Planrahmen;
public class PlanLayout_Mit_Koordinatennetz{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private PlanLayout_Mit_Koordinatennetz(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(PlanLayout_Mit_Koordinatennetz value) {
     return value.value;
  }
  static public PlanLayout_Mit_Koordinatennetz parseXmlCode(String value) {
     return (PlanLayout_Mit_Koordinatennetz)valuev.get(value);
  }
  static public PlanLayout_Mit_Koordinatennetz ja=new PlanLayout_Mit_Koordinatennetz("ja");
  public final static String tag_ja="ja";
  static public PlanLayout_Mit_Koordinatennetz nein=new PlanLayout_Mit_Koordinatennetz("nein");
  public final static String tag_nein="nein";
}
