package ch.interlis.models.DM01AVCH24LV95D;
public class Status_GA{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Status_GA(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Status_GA value) {
     return value.value;
  }
  static public Status_GA parseXmlCode(String value) {
     return (Status_GA)valuev.get(value);
  }
  static public Status_GA projektiert=new Status_GA("projektiert");
  public final static String tag_projektiert="projektiert";
  static public Status_GA real=new Status_GA("real");
  public final static String tag_real="real";
  static public Status_GA vergangen=new Status_GA("vergangen");
  public final static String tag_vergangen="vergangen";
}
