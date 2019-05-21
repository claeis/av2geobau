package ch.interlis.models.DM01AVCH24LV95D.PLZOrtschaft;
public class PLZ6 extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.PLZOrtschaft.PLZ6";
  public PLZ6(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Flaeche="Flaeche";
  public String getFlaeche() {
    String value=getattrvalue("Flaeche");
    return value;
  }
  public void setFlaeche(String value) {
    setattrvalue("Flaeche", value);
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
  public PLZ6_InAenderung getInAenderung() {
    String value=getattrvalue("InAenderung");
    return PLZ6_InAenderung.parseXmlCode(value);
  }
  public void setInAenderung(PLZ6_InAenderung value) {
    setattrvalue("InAenderung", PLZ6_InAenderung.toXmlCode(value));
  }
  public final static String tag_PLZ="PLZ";
  public int getPLZ() {
    String value=getattrvalue("PLZ");
    return Integer.parseInt(value);
  }
  public void setPLZ(int value) {
    setattrvalue("PLZ", Integer.toString(value));
  }
  public final static String tag_Zusatzziffern="Zusatzziffern";
  public int getZusatzziffern() {
    String value=getattrvalue("Zusatzziffern");
    return Integer.parseInt(value);
  }
  public void setZusatzziffern(int value) {
    setattrvalue("Zusatzziffern", Integer.toString(value));
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
  public final static String tag_PLZ6_von="PLZ6_von";
  public String getPLZ6_von() {
    ch.interlis.iom.IomObject value=getattrobj("PLZ6_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setPLZ6_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("PLZ6_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
