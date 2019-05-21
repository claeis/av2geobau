package ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie2;
public class LFP2_Begehbarkeit{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private LFP2_Begehbarkeit(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(LFP2_Begehbarkeit value) {
     return value.value;
  }
  static public LFP2_Begehbarkeit parseXmlCode(String value) {
     return (LFP2_Begehbarkeit)valuev.get(value);
  }
  static public LFP2_Begehbarkeit begehbar=new LFP2_Begehbarkeit("begehbar");
  public final static String tag_begehbar="begehbar";
  static public LFP2_Begehbarkeit nicht_begehbar=new LFP2_Begehbarkeit("nicht_begehbar");
  public final static String tag_nicht_begehbar="nicht_begehbar";
}
