package ch.interlis.models.DM01AVCH24LV95D;
public class Status{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Status(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Status value) {
     return value.value;
  }
  static public Status parseXmlCode(String value) {
     return (Status)valuev.get(value);
  }
  static public Status projektiert=new Status("projektiert");
  public final static String tag_projektiert="projektiert";
  static public Status gueltig=new Status("gueltig");
  public final static String tag_gueltig="gueltig";
}
