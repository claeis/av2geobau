package ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie1;
public class LFP1_Begehbarkeit{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private LFP1_Begehbarkeit(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(LFP1_Begehbarkeit value) {
     return value.value;
  }
  static public LFP1_Begehbarkeit parseXmlCode(String value) {
     return (LFP1_Begehbarkeit)valuev.get(value);
  }
  static public LFP1_Begehbarkeit begehbar=new LFP1_Begehbarkeit("begehbar");
  public final static String tag_begehbar="begehbar";
  static public LFP1_Begehbarkeit nicht_begehbar=new LFP1_Begehbarkeit("nicht_begehbar");
  public final static String tag_nicht_begehbar="nicht_begehbar";
}
