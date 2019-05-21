package ch.interlis.models.DM01AVCH24LV95D;
public class Schriftgroesse{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Schriftgroesse(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Schriftgroesse value) {
     return value.value;
  }
  static public Schriftgroesse parseXmlCode(String value) {
     return (Schriftgroesse)valuev.get(value);
  }
  static public Schriftgroesse klein=new Schriftgroesse("klein");
  public final static String tag_klein="klein";
  static public Schriftgroesse mittel=new Schriftgroesse("mittel");
  public final static String tag_mittel="mittel";
  static public Schriftgroesse gross=new Schriftgroesse("gross");
  public final static String tag_gross="gross";
}
