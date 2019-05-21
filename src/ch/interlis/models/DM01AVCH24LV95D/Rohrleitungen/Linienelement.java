package ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen;
public class Linienelement extends ch.interlis.iom_j.Iom_jObject
{
  public final static String tag= "DM01AVCH24LV95D.Rohrleitungen.Linienelement";
  public Linienelement(String oid) {
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
  public final static String tag_Linienart="Linienart";
  public Linienelement_Linienart getLinienart() {
    String value=getattrvalue("Linienart");
    return Linienelement_Linienart.parseXmlCode(value);
  }
  public void setLinienart(Linienelement_Linienart value) {
    setattrvalue("Linienart", Linienelement_Linienart.toXmlCode(value));
  }
  public final static String tag_Linienelement_von="Linienelement_von";
  public String getLinienelement_von() {
    ch.interlis.iom.IomObject value=getattrobj("Linienelement_von",0);
    if(value==null)throw new IllegalStateException();
    String oid=value.getobjectrefoid();
    if(oid==null)throw new IllegalStateException();
    return oid;
  }
  public void setLinienelement_von(String oid) {
    ch.interlis.iom.IomObject structvalue=addattrobj("Linienelement_von","REF");
    structvalue.setobjectrefoid(oid);
  }
}
