package ch.interlis.models.DM01AVCH24LV95D.PLZOrtschaft;
public class OrtschaftsVerbundText extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsVerbundText";
  public OrtschaftsVerbundText(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Text="Text";
  public String getText() {
    String value=getattrvalue("Text");
    return value;
  }
  public void setText(String value) {
    setattrvalue("Text", value);
  }
  public final static String tag_Sprache="Sprache";
  public ch.interlis.models.DM01AVCH24LV95D.Sprachtyp getSprache() {
    String value=getattrvalue("Sprache");
    return ch.interlis.models.DM01AVCH24LV95D.Sprachtyp.parseXmlCode(value);
  }
  public void setSprache(ch.interlis.models.DM01AVCH24LV95D.Sprachtyp value) {
    setattrvalue("Sprache", ch.interlis.models.DM01AVCH24LV95D.Sprachtyp.toXmlCode(value));
  }
  public final static String tag_OrtschaftsVerbundText_von="OrtschaftsVerbundText_von";
  public String getOrtschaftsVerbundText_von() {
    ch.interlis.iom.IomObject value=getattrobj("OrtschaftsVerbundText_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setOrtschaftsVerbundText_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("OrtschaftsVerbundText_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
