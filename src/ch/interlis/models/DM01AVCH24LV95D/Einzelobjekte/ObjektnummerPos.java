package ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte;
public class ObjektnummerPos extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Einzelobjekte.ObjektnummerPos";
  public ObjektnummerPos(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Pos="Pos";
  public String getPos() {
    String value=getattrvalue("Pos");
    return value;
  }
  public void setPos(String value) {
    setattrvalue("Pos", value);
  }
  public final static String tag_Ori="Ori";
  public double getOri() {
    String value=getattrvalue("Ori");
    return Double.parseDouble(value);
  }
  public void setOri(double value) {
    setattrvalue("Ori", Double.toString(value));
  }
  public final static String tag_HAli="HAli";
  public ch.interlis.models.INTERLIS.HALIGNMENT getHAli() {
    String value=getattrvalue("HAli");
    return ch.interlis.models.INTERLIS.HALIGNMENT.parseXmlCode(value);
  }
  public void setHAli(ch.interlis.models.INTERLIS.HALIGNMENT value) {
    setattrvalue("HAli", ch.interlis.models.INTERLIS.HALIGNMENT.toXmlCode(value));
  }
  public final static String tag_VAli="VAli";
  public ch.interlis.models.INTERLIS.VALIGNMENT getVAli() {
    String value=getattrvalue("VAli");
    return ch.interlis.models.INTERLIS.VALIGNMENT.parseXmlCode(value);
  }
  public void setVAli(ch.interlis.models.INTERLIS.VALIGNMENT value) {
    setattrvalue("VAli", ch.interlis.models.INTERLIS.VALIGNMENT.toXmlCode(value));
  }
  public final static String tag_Groesse="Groesse";
  public ch.interlis.models.DM01AVCH24LV95D.Schriftgroesse getGroesse() {
    String value=getattrvalue("Groesse");
    return ch.interlis.models.DM01AVCH24LV95D.Schriftgroesse.parseXmlCode(value);
  }
  public void setGroesse(ch.interlis.models.DM01AVCH24LV95D.Schriftgroesse value) {
    setattrvalue("Groesse", ch.interlis.models.DM01AVCH24LV95D.Schriftgroesse.toXmlCode(value));
  }
  public final static String tag_ObjektnummerPos_von="ObjektnummerPos_von";
  public String getObjektnummerPos_von() {
    ch.interlis.iom.IomObject value=getattrobj("ObjektnummerPos_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setObjektnummerPos_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("ObjektnummerPos_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
