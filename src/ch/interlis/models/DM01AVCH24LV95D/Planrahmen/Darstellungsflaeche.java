package ch.interlis.models.DM01AVCH24LV95D.Planrahmen;
public class Darstellungsflaeche extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Planrahmen.Darstellungsflaeche";
  public Darstellungsflaeche(String oid) {
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
  public final static String tag_Auswahlart="Auswahlart";
  public Darstellungsflaeche_Auswahlart getAuswahlart() {
    String value=getattrvalue("Auswahlart");
    return Darstellungsflaeche_Auswahlart.parseXmlCode(value);
  }
  public void setAuswahlart(Darstellungsflaeche_Auswahlart value) {
    setattrvalue("Auswahlart", Darstellungsflaeche_Auswahlart.toXmlCode(value));
  }
  public final static String tag_Darstellungsflaeche_von="Darstellungsflaeche_von";
  public String getDarstellungsflaeche_von() {
    ch.interlis.iom.IomObject value=getattrobj("Darstellungsflaeche_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setDarstellungsflaeche_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Darstellungsflaeche_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
