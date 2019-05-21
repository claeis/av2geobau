package ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen;
public class GebaeudeName extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeName";
  public GebaeudeName(String oid) {
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
  public final static String tag_KurzText="KurzText";
  public String getKurzText() {
    String value=getattrvalue("KurzText");
    return value;
  }
  public void setKurzText(String value) {
    setattrvalue("KurzText", value);
  }
  public final static String tag_IndexText="IndexText";
  public String getIndexText() {
    String value=getattrvalue("IndexText");
    return value;
  }
  public void setIndexText(String value) {
    setattrvalue("IndexText", value);
  }
  public final static String tag_Sprache="Sprache";
  public ch.interlis.models.DM01AVCH24LV95D.Sprachtyp getSprache() {
    String value=getattrvalue("Sprache");
    return ch.interlis.models.DM01AVCH24LV95D.Sprachtyp.parseXmlCode(value);
  }
  public void setSprache(ch.interlis.models.DM01AVCH24LV95D.Sprachtyp value) {
    setattrvalue("Sprache", ch.interlis.models.DM01AVCH24LV95D.Sprachtyp.toXmlCode(value));
  }
  public final static String tag_GebaeudeName_von="GebaeudeName_von";
  public String getGebaeudeName_von() {
    ch.interlis.iom.IomObject value=getattrobj("GebaeudeName_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setGebaeudeName_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("GebaeudeName_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
