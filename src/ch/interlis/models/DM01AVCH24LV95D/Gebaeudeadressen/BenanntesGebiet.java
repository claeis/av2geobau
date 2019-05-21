package ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen;
public class BenanntesGebiet extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Gebaeudeadressen.BenanntesGebiet";
  public BenanntesGebiet(String oid) {
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
  public final static String tag_BenanntesGebiet_von="BenanntesGebiet_von";
  public String getBenanntesGebiet_von() {
    ch.interlis.iom.IomObject value=getattrobj("BenanntesGebiet_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setBenanntesGebiet_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("BenanntesGebiet_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
