package ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen;
public class Linienelement_Linienart{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private Linienelement_Linienart(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(Linienelement_Linienart value) {
     return value.value;
  }
  static public Linienelement_Linienart parseXmlCode(String value) {
     return (Linienelement_Linienart)valuev.get(value);
  }
  static public Linienelement_Linienart sichtbar=new Linienelement_Linienart("sichtbar");
  public final static String tag_sichtbar="sichtbar";
}
