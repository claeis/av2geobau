package ch.interlis.models.DM01AVCH24LV95D.PLZOrtschaft;
public class Ortschaft extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.PLZOrtschaft.Ortschaft";
  public Ortschaft(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Status="Status";
  public ch.interlis.models.DM01AVCH24LV95D.Status_GA getStatus() {
    String value=getattrvalue("Status");
    return ch.interlis.models.DM01AVCH24LV95D.Status_GA.parseXmlCode(value);
  }
  public void setStatus(ch.interlis.models.DM01AVCH24LV95D.Status_GA value) {
    setattrvalue("Status", ch.interlis.models.DM01AVCH24LV95D.Status_GA.toXmlCode(value));
  }
  public final static String tag_InAenderung="InAenderung";
  public Ortschaft_InAenderung getInAenderung() {
    String value=getattrvalue("InAenderung");
    return Ortschaft_InAenderung.parseXmlCode(value);
  }
  public void setInAenderung(Ortschaft_InAenderung value) {
    setattrvalue("InAenderung", Ortschaft_InAenderung.toXmlCode(value));
  }
  public final static String tag_Flaeche="Flaeche";
  public String getFlaeche() {
    String value=getattrvalue("Flaeche");
    return value;
  }
  public void setFlaeche(String value) {
    setattrvalue("Flaeche", value);
  }
  public final static String tag_Entstehung="Entstehung";
  public String getEntstehung() {
    ch.interlis.iom.IomObject value=getattrobj("Entstehung",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setEntstehung(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Entstehung","REF");
    structvalue.setobjectrefoid(oid);
  }
  public final static String tag_Ortschaft_von="Ortschaft_von";
  public String getOrtschaft_von() {
    ch.interlis.iom.IomObject value=getattrobj("Ortschaft_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setOrtschaft_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Ortschaft_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
