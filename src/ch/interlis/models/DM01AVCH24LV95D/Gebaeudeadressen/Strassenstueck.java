package ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen;
public class Strassenstueck extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Gebaeudeadressen.Strassenstueck";
  public Strassenstueck(String oid) {
    super(tag,oid);
  }
  public String getobjecttag() {
    return tag;
  }
  public final static String tag_Geometrie="Geometrie";
  public String getGeometrie() {
    String value=getattrvalue("Geometrie");
    return value;
  }
  public void setGeometrie(String value) {
    setattrvalue("Geometrie", value);
  }
  public final static String tag_Anfangspunkt="Anfangspunkt";
  public String getAnfangspunkt() {
    String value=getattrvalue("Anfangspunkt");
    return value;
  }
  public void setAnfangspunkt(String value) {
    setattrvalue("Anfangspunkt", value);
  }
  public final static String tag_Ordnung="Ordnung";
  public int getOrdnung() {
    String value=getattrvalue("Ordnung");
    return Integer.parseInt(value);
  }
  public void setOrdnung(int value) {
    setattrvalue("Ordnung", Integer.toString(value));
  }
  public final static String tag_IstAchse="IstAchse";
  public Strassenstueck_IstAchse getIstAchse() {
    String value=getattrvalue("IstAchse");
    return Strassenstueck_IstAchse.parseXmlCode(value);
  }
  public void setIstAchse(Strassenstueck_IstAchse value) {
    setattrvalue("IstAchse", Strassenstueck_IstAchse.toXmlCode(value));
  }
  public final static String tag_Strassenstueck_von="Strassenstueck_von";
  public String getStrassenstueck_von() {
    ch.interlis.iom.IomObject value=getattrobj("Strassenstueck_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setStrassenstueck_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Strassenstueck_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
