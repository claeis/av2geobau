package ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie3;
public class LFP3_Protokoll{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private LFP3_Protokoll(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(LFP3_Protokoll value) {
     return value.value;
  }
  static public LFP3_Protokoll parseXmlCode(String value) {
     return (LFP3_Protokoll)valuev.get(value);
  }
  static public LFP3_Protokoll ja=new LFP3_Protokoll("ja");
  public final static String tag_ja="ja";
  static public LFP3_Protokoll nein=new LFP3_Protokoll("nein");
  public final static String tag_nein="nein";
}
