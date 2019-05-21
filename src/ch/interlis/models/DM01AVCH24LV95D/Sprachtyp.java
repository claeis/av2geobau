package ch.interlis.models.DM01AVCH24LV95D;
public class Sprachtyp{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Sprachtyp(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Sprachtyp value) {
     return value.value;
  }
  static public Sprachtyp parseXmlCode(String value) {
     return (Sprachtyp)valuev.get(value);
  }
  static public Sprachtyp de=new Sprachtyp("de");
  public final static String tag_de="de";
  static public Sprachtyp fr=new Sprachtyp("fr");
  public final static String tag_fr="fr";
  static public Sprachtyp it=new Sprachtyp("it");
  public final static String tag_it="it";
  static public Sprachtyp rm=new Sprachtyp("rm");
  public final static String tag_rm="rm";
  static public Sprachtyp en=new Sprachtyp("en");
  public final static String tag_en="en";
}
