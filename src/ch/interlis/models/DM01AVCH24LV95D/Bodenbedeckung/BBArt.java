package ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung;
public class BBArt{
  static private java.util.HashMap valuev=new java.util.HashMap();
  private String value=null;
  private BBArt(String value) {
    this.value=value;
    valuev.put(value,this);
  }
  static public String toXmlCode(BBArt value) {
     return value.value;
  }
  static public BBArt parseXmlCode(String value) {
     return (BBArt)valuev.get(value);
  }
  static public BBArt Gebaeude=new BBArt("Gebaeude");
  public final static String tag_Gebaeude="Gebaeude";
  static public BBArt befestigt_Strasse_Weg=new BBArt("befestigt.Strasse_Weg");
  public final static String tag_befestigt_Strasse_Weg="befestigt.Strasse_Weg";
  static public BBArt befestigt_Trottoir=new BBArt("befestigt.Trottoir");
  public final static String tag_befestigt_Trottoir="befestigt.Trottoir";
  static public BBArt befestigt_Verkehrsinsel=new BBArt("befestigt.Verkehrsinsel");
  public final static String tag_befestigt_Verkehrsinsel="befestigt.Verkehrsinsel";
  static public BBArt befestigt_Bahn=new BBArt("befestigt.Bahn");
  public final static String tag_befestigt_Bahn="befestigt.Bahn";
  static public BBArt befestigt_Flugplatz=new BBArt("befestigt.Flugplatz");
  public final static String tag_befestigt_Flugplatz="befestigt.Flugplatz";
  static public BBArt befestigt_Wasserbecken=new BBArt("befestigt.Wasserbecken");
  public final static String tag_befestigt_Wasserbecken="befestigt.Wasserbecken";
  static public BBArt befestigt_uebrige_befestigte=new BBArt("befestigt.uebrige_befestigte");
  public final static String tag_befestigt_uebrige_befestigte="befestigt.uebrige_befestigte";
  static public BBArt humusiert_Acker_Wiese_Weide=new BBArt("humusiert.Acker_Wiese_Weide");
  public final static String tag_humusiert_Acker_Wiese_Weide="humusiert.Acker_Wiese_Weide";
  static public BBArt humusiert_Intensivkultur_Reben=new BBArt("humusiert.Intensivkultur.Reben");
  public final static String tag_humusiert_Intensivkultur_Reben="humusiert.Intensivkultur.Reben";
  static public BBArt humusiert_Intensivkultur_uebrige_Intensivkultur=new BBArt("humusiert.Intensivkultur.uebrige_Intensivkultur");
  public final static String tag_humusiert_Intensivkultur_uebrige_Intensivkultur="humusiert.Intensivkultur.uebrige_Intensivkultur";
  static public BBArt humusiert_Gartenanlage=new BBArt("humusiert.Gartenanlage");
  public final static String tag_humusiert_Gartenanlage="humusiert.Gartenanlage";
  static public BBArt humusiert_Hoch_Flachmoor=new BBArt("humusiert.Hoch_Flachmoor");
  public final static String tag_humusiert_Hoch_Flachmoor="humusiert.Hoch_Flachmoor";
  static public BBArt humusiert_uebrige_humusierte=new BBArt("humusiert.uebrige_humusierte");
  public final static String tag_humusiert_uebrige_humusierte="humusiert.uebrige_humusierte";
  static public BBArt Gewaesser_stehendes=new BBArt("Gewaesser.stehendes");
  public final static String tag_Gewaesser_stehendes="Gewaesser.stehendes";
  static public BBArt Gewaesser_fliessendes=new BBArt("Gewaesser.fliessendes");
  public final static String tag_Gewaesser_fliessendes="Gewaesser.fliessendes";
  static public BBArt Gewaesser_Schilfguertel=new BBArt("Gewaesser.Schilfguertel");
  public final static String tag_Gewaesser_Schilfguertel="Gewaesser.Schilfguertel";
  static public BBArt bestockt_geschlossener_Wald=new BBArt("bestockt.geschlossener_Wald");
  public final static String tag_bestockt_geschlossener_Wald="bestockt.geschlossener_Wald";
  static public BBArt bestockt_Wytweide_Wytweide_dicht=new BBArt("bestockt.Wytweide.Wytweide_dicht");
  public final static String tag_bestockt_Wytweide_Wytweide_dicht="bestockt.Wytweide.Wytweide_dicht";
  static public BBArt bestockt_Wytweide_Wytweide_offen=new BBArt("bestockt.Wytweide.Wytweide_offen");
  public final static String tag_bestockt_Wytweide_Wytweide_offen="bestockt.Wytweide.Wytweide_offen";
  static public BBArt bestockt_uebrige_bestockte=new BBArt("bestockt.uebrige_bestockte");
  public final static String tag_bestockt_uebrige_bestockte="bestockt.uebrige_bestockte";
  static public BBArt vegetationslos_Fels=new BBArt("vegetationslos.Fels");
  public final static String tag_vegetationslos_Fels="vegetationslos.Fels";
  static public BBArt vegetationslos_Gletscher_Firn=new BBArt("vegetationslos.Gletscher_Firn");
  public final static String tag_vegetationslos_Gletscher_Firn="vegetationslos.Gletscher_Firn";
  static public BBArt vegetationslos_Geroell_Sand=new BBArt("vegetationslos.Geroell_Sand");
  public final static String tag_vegetationslos_Geroell_Sand="vegetationslos.Geroell_Sand";
  static public BBArt vegetationslos_Abbau_Deponie=new BBArt("vegetationslos.Abbau_Deponie");
  public final static String tag_vegetationslos_Abbau_Deponie="vegetationslos.Abbau_Deponie";
  static public BBArt vegetationslos_uebrige_vegetationslose=new BBArt("vegetationslos.uebrige_vegetationslose");
  public final static String tag_vegetationslos_uebrige_vegetationslose="vegetationslos.uebrige_vegetationslose";
}
