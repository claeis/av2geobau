package ch.interlis.models.DM01AVCH24LV95D.Nomenklatur;
public class FlurnamePos extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Nomenklatur.FlurnamePos";
  public FlurnamePos(String oid) {
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
  public final static String tag_Stil="Stil";
  public ch.interlis.models.DM01AVCH24LV95D.Schriftstil getStil() {
    String value=getattrvalue("Stil");
    return ch.interlis.models.DM01AVCH24LV95D.Schriftstil.parseXmlCode(value);
  }
  public void setStil(ch.interlis.models.DM01AVCH24LV95D.Schriftstil value) {
    setattrvalue("Stil", ch.interlis.models.DM01AVCH24LV95D.Schriftstil.toXmlCode(value));
  }
  public final static String tag_FlurnamePos_von="FlurnamePos_von";
  public String getFlurnamePos_von() {
    ch.interlis.iom.IomObject value=getattrobj("FlurnamePos_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setFlurnamePos_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("FlurnamePos_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
