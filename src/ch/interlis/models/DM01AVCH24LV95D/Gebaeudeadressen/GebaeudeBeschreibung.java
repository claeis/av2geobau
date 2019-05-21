package ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen;
public class GebaeudeBeschreibung extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeBeschreibung";
  public GebaeudeBeschreibung(String oid) {
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
  public final static String tag_GebaeudeBeschreibung_von="GebaeudeBeschreibung_von";
  public String getGebaeudeBeschreibung_von() {
    ch.interlis.iom.IomObject value=getattrobj("GebaeudeBeschreibung_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setGebaeudeBeschreibung_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("GebaeudeBeschreibung_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
