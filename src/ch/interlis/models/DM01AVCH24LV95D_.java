package ch.interlis.models;
public class DM01AVCH24LV95D_{
  private DM01AVCH24LV95D_() {}
  public final static String MODEL= "DM01AVCH24LV95D";
  public final static String FixpunkteKategorie1= "DM01AVCH24LV95D.FixpunkteKategorie1";
  public final static String FixpunkteKategorie2= "DM01AVCH24LV95D.FixpunkteKategorie2";
  public final static String FixpunkteKategorie3= "DM01AVCH24LV95D.FixpunkteKategorie3";
  public final static String Bodenbedeckung= "DM01AVCH24LV95D.Bodenbedeckung";
  public final static String Einzelobjekte= "DM01AVCH24LV95D.Einzelobjekte";
  public final static String Hoehen= "DM01AVCH24LV95D.Hoehen";
  public final static String Nomenklatur= "DM01AVCH24LV95D.Nomenklatur";
  public final static String Liegenschaften= "DM01AVCH24LV95D.Liegenschaften";
  public final static String Rohrleitungen= "DM01AVCH24LV95D.Rohrleitungen";
  public final static String Nummerierungsbereiche= "DM01AVCH24LV95D.Nummerierungsbereiche";
  public final static String Gemeindegrenzen= "DM01AVCH24LV95D.Gemeindegrenzen";
  public final static String Bezirksgrenzen= "DM01AVCH24LV95D.Bezirksgrenzen";
  public final static String Kantonsgrenzen= "DM01AVCH24LV95D.Kantonsgrenzen";
  public final static String Landesgrenzen= "DM01AVCH24LV95D.Landesgrenzen";
  public final static String Planeinteilungen= "DM01AVCH24LV95D.Planeinteilungen";
  public final static String TSEinteilung= "DM01AVCH24LV95D.TSEinteilung";
  public final static String Rutschgebiete= "DM01AVCH24LV95D.Rutschgebiete";
  public final static String PLZOrtschaft= "DM01AVCH24LV95D.PLZOrtschaft";
  public final static String Gebaeudeadressen= "DM01AVCH24LV95D.Gebaeudeadressen";
  public final static String Planrahmen= "DM01AVCH24LV95D.Planrahmen";
  public static ch.interlis.iom_j.xtf.XtfModel getXtfModel(){ return new ch.interlis.iom_j.xtf.XtfModel("DM01AVCH24LV95D","null","null"); }
  static public ch.interlis.iox.IoxFactory getIoxFactory()
  {
    return new ch.interlis.iox.IoxFactory(){
      public ch.interlis.iom.IomObject createIomObject(String type,String oid) throws ch.interlis.iox.IoxException {
      if(type.equals("DM01AVCH24LV95D.Gebaeudeadressen.LokalisationsNamePos"))return new ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen.LokalisationsNamePos(oid);
      if(type.equals("DM01AVCH24LV95D.TSEinteilung.Toleranzstufe"))return new ch.interlis.models.DM01AVCH24LV95D.TSEinteilung.Toleranzstufe(oid);
      if(type.equals("DM01AVCH24LV95D.Planeinteilungen.Plan"))return new ch.interlis.models.DM01AVCH24LV95D.Planeinteilungen.Plan(oid);
      if(type.equals("DM01AVCH24LV95D.FixpunkteKategorie1.HFP1Pos"))return new ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie1.HFP1Pos(oid);
      if(type.equals("DM01AVCH24LV95D.Bodenbedeckung.EinzelpunktPos"))return new ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.EinzelpunktPos(oid);
      if(type.equals("DM01AVCH24LV95D.Nummerierungsbereiche.Nummerierungsbereich"))return new ch.interlis.models.DM01AVCH24LV95D.Nummerierungsbereiche.Nummerierungsbereich(oid);
      if(type.equals("DM01AVCH24LV95D.Planrahmen.Darstellungsflaeche"))return new ch.interlis.models.DM01AVCH24LV95D.Planrahmen.Darstellungsflaeche(oid);
      if(type.equals("DM01AVCH24LV95D.Landesgrenzen.Landesgrenzabschnitt"))return new ch.interlis.models.DM01AVCH24LV95D.Landesgrenzen.Landesgrenzabschnitt(oid);
      if(type.equals("DM01AVCH24LV95D.Planrahmen.PlanLayout"))return new ch.interlis.models.DM01AVCH24LV95D.Planrahmen.PlanLayout(oid);
      if(type.equals("DM01AVCH24LV95D.Liegenschaften.GrenzpunktPos"))return new ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.GrenzpunktPos(oid);
      if(type.equals("DM01AVCH24LV95D.Liegenschaften.GrenzpunktSymbol"))return new ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.GrenzpunktSymbol(oid);
      if(type.equals("DM01AVCH24LV95D.FixpunkteKategorie3.LFP3"))return new ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie3.LFP3(oid);
      if(type.equals("DM01AVCH24LV95D.Bodenbedeckung.BoFlaecheSymbol"))return new ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.BoFlaecheSymbol(oid);
      if(type.equals("DM01AVCH24LV95D.Gemeindegrenzen.Gemeinde"))return new ch.interlis.models.DM01AVCH24LV95D.Gemeindegrenzen.Gemeinde(oid);
      if(type.equals("DM01AVCH24LV95D.Rohrleitungen.Linienelement"))return new ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen.Linienelement(oid);
      if(type.equals("DM01AVCH24LV95D.Planrahmen.Netzkreuz"))return new ch.interlis.models.DM01AVCH24LV95D.Planrahmen.Netzkreuz(oid);
      if(type.equals("DM01AVCH24LV95D.PLZOrtschaft.PLZ6"))return new ch.interlis.models.DM01AVCH24LV95D.PLZOrtschaft.PLZ6(oid);
      if(type.equals("DM01AVCH24LV95D.Liegenschaften.ProjBergwerk"))return new ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.ProjBergwerk(oid);
      if(type.equals("DM01AVCH24LV95D.Bodenbedeckung.ProjObjektnamePos"))return new ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.ProjObjektnamePos(oid);
      if(type.equals("DM01AVCH24LV95D.Hoehen.HoehenpunktPos"))return new ch.interlis.models.DM01AVCH24LV95D.Hoehen.HoehenpunktPos(oid);
      if(type.equals("DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeName"))return new ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeName(oid);
      if(type.equals("DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeNamePos"))return new ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeNamePos(oid);
      if(type.equals("DM01AVCH24LV95D.Liegenschaften.GrundstueckPos"))return new ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.GrundstueckPos(oid);
      if(type.equals("DM01AVCH24LV95D.Hoehen.HONachfuehrung"))return new ch.interlis.models.DM01AVCH24LV95D.Hoehen.HONachfuehrung(oid);
      if(type.equals("DM01AVCH24LV95D.Gemeindegrenzen.HoheitsgrenzpunktPos"))return new ch.interlis.models.DM01AVCH24LV95D.Gemeindegrenzen.HoheitsgrenzpunktPos(oid);
      if(type.equals("DM01AVCH24LV95D.Gebaeudeadressen.LokalisationsName"))return new ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen.LokalisationsName(oid);
      if(type.equals("DM01AVCH24LV95D.Planrahmen.Linienobjekt"))return new ch.interlis.models.DM01AVCH24LV95D.Planrahmen.Linienobjekt(oid);
      if(type.equals("DM01AVCH24LV95D.Planrahmen.PlanbeschriftungPos"))return new ch.interlis.models.DM01AVCH24LV95D.Planrahmen.PlanbeschriftungPos(oid);
      if(type.equals("DM01AVCH24LV95D.Rohrleitungen.Leitungsobjekt"))return new ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen.Leitungsobjekt(oid);
      if(type.equals("DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsVerbundText"))return new ch.interlis.models.DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsVerbundText(oid);
      if(type.equals("DM01AVCH24LV95D.Bodenbedeckung.GebaeudenummerPos"))return new ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.GebaeudenummerPos(oid);
      if(type.equals("DM01AVCH24LV95D.Gebaeudeadressen.BenanntesGebiet"))return new ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen.BenanntesGebiet(oid);
      if(type.equals("DM01AVCH24LV95D.Rohrleitungen.LeitungsobjektPos"))return new ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen.LeitungsobjektPos(oid);
      if(type.equals("DM01AVCH24LV95D.Liegenschaften.ProjGrundstueck"))return new ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.ProjGrundstueck(oid);
      if(type.equals("DM01AVCH24LV95D.Rutschgebiete.RutschungPos"))return new ch.interlis.models.DM01AVCH24LV95D.Rutschgebiete.RutschungPos(oid);
      if(type.equals("DM01AVCH24LV95D.Liegenschaften.SelbstRecht"))return new ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.SelbstRecht(oid);
      if(type.equals("DM01AVCH24LV95D.Hoehen.Gelaendekante"))return new ch.interlis.models.DM01AVCH24LV95D.Hoehen.Gelaendekante(oid);
      if(type.equals("DM01AVCH24LV95D.Planrahmen.KoordinatenanschriftPos"))return new ch.interlis.models.DM01AVCH24LV95D.Planrahmen.KoordinatenanschriftPos(oid);
      if(type.equals("DM01AVCH24LV95D.Rohrleitungen.EinzelpunktPos"))return new ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen.EinzelpunktPos(oid);
      if(type.equals("DM01AVCH24LV95D.Bodenbedeckung.ProjBoFlaecheSymbol"))return new ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.ProjBoFlaecheSymbol(oid);
      if(type.equals("DM01AVCH24LV95D.Einzelobjekte.Punktelement"))return new ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.Punktelement(oid);
      if(type.equals("DM01AVCH24LV95D.Liegenschaften.ProjSelbstRecht"))return new ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.ProjSelbstRecht(oid);
      if(type.equals("DM01AVCH24LV95D.FixpunkteKategorie2.LFP2Symbol"))return new ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie2.LFP2Symbol(oid);
      if(type.equals("DM01AVCH24LV95D.Einzelobjekte.Objektname"))return new ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.Objektname(oid);
      if(type.equals("DM01AVCH24LV95D.FixpunkteKategorie3.HFP3"))return new ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie3.HFP3(oid);
      if(type.equals("DM01AVCH24LV95D.Kantonsgrenzen.Kantonsgrenzabschnitt"))return new ch.interlis.models.DM01AVCH24LV95D.Kantonsgrenzen.Kantonsgrenzabschnitt(oid);
      if(type.equals("DM01AVCH24LV95D.Hoehen.Hoehenpunkt"))return new ch.interlis.models.DM01AVCH24LV95D.Hoehen.Hoehenpunkt(oid);
      if(type.equals("DM01AVCH24LV95D.Gemeindegrenzen.ProjGemeindegrenze"))return new ch.interlis.models.DM01AVCH24LV95D.Gemeindegrenzen.ProjGemeindegrenze(oid);
      if(type.equals("DM01AVCH24LV95D.Nomenklatur.GelaendenamePos"))return new ch.interlis.models.DM01AVCH24LV95D.Nomenklatur.GelaendenamePos(oid);
      if(type.equals("DM01AVCH24LV95D.Planrahmen.KoordinatenLinie"))return new ch.interlis.models.DM01AVCH24LV95D.Planrahmen.KoordinatenLinie(oid);
      if(type.equals("DM01AVCH24LV95D.Liegenschaften.Grundstueck"))return new ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.Grundstueck(oid);
      if(type.equals("DM01AVCH24LV95D.Planeinteilungen.Plangeometrie"))return new ch.interlis.models.DM01AVCH24LV95D.Planeinteilungen.Plangeometrie(oid);
      if(type.equals("DM01AVCH24LV95D.Einzelobjekte.EONachfuehrung"))return new ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.EONachfuehrung(oid);
      if(type.equals("DM01AVCH24LV95D.Gebaeudeadressen.HausnummerPos"))return new ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen.HausnummerPos(oid);
      if(type.equals("DM01AVCH24LV95D.Planrahmen.PlanLayoutSymbol"))return new ch.interlis.models.DM01AVCH24LV95D.Planrahmen.PlanLayoutSymbol(oid);
      if(type.equals("DM01AVCH24LV95D.FixpunkteKategorie2.HFP2Nachfuehrung"))return new ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie2.HFP2Nachfuehrung(oid);
      if(type.equals("DM01AVCH24LV95D.Bodenbedeckung.ProjBoFlaeche"))return new ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.ProjBoFlaeche(oid);
      if(type.equals("DM01AVCH24LV95D.FixpunkteKategorie3.HFP3Pos"))return new ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie3.HFP3Pos(oid);
      if(type.equals("DM01AVCH24LV95D.Bodenbedeckung.Objektname"))return new ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.Objektname(oid);
      if(type.equals("DM01AVCH24LV95D.FixpunkteKategorie1.LFP1Nachfuehrung"))return new ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie1.LFP1Nachfuehrung(oid);
      if(type.equals("DM01AVCH24LV95D.Liegenschaften.LineAttrib6"))return new ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.LineAttrib6();
      if(type.equals("DM01AVCH24LV95D.Gemeindegrenzen.HoheitsgrenzpunktSymbol"))return new ch.interlis.models.DM01AVCH24LV95D.Gemeindegrenzen.HoheitsgrenzpunktSymbol(oid);
      if(type.equals("DM01AVCH24LV95D.Planrahmen.Planbeschriftung"))return new ch.interlis.models.DM01AVCH24LV95D.Planrahmen.Planbeschriftung(oid);
      if(type.equals("DM01AVCH24LV95D.Liegenschaften.LineAttrib1"))return new ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.LineAttrib1();
      if(type.equals("DM01AVCH24LV95D.Einzelobjekte.Einzelobjekt"))return new ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.Einzelobjekt(oid);
      if(type.equals("DM01AVCH24LV95D.Liegenschaften.LineAttrib2"))return new ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.LineAttrib2();
      if(type.equals("DM01AVCH24LV95D.FixpunkteKategorie2.HFP2"))return new ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie2.HFP2(oid);
      if(type.equals("DM01AVCH24LV95D.Liegenschaften.LineAttrib3"))return new ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.LineAttrib3();
      if(type.equals("DM01AVCH24LV95D.Liegenschaften.LineAttrib4"))return new ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.LineAttrib4();
      if(type.equals("DM01AVCH24LV95D.Liegenschaften.LineAttrib5"))return new ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.LineAttrib5();
      if(type.equals("DM01AVCH24LV95D.Rohrleitungen.RLNachfuehrung"))return new ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen.RLNachfuehrung(oid);
      if(type.equals("DM01AVCH24LV95D.Einzelobjekte.FlaechenelementSymbol"))return new ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.FlaechenelementSymbol(oid);
      if(type.equals("DM01AVCH24LV95D.Gebaeudeadressen.GEBNachfuehrung"))return new ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen.GEBNachfuehrung(oid);
      if(type.equals("DM01AVCH24LV95D.FixpunkteKategorie1.HFP1Nachfuehrung"))return new ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie1.HFP1Nachfuehrung(oid);
      if(type.equals("DM01AVCH24LV95D.Rutschgebiete.Rutschung"))return new ch.interlis.models.DM01AVCH24LV95D.Rutschgebiete.Rutschung(oid);
      if(type.equals("DM01AVCH24LV95D.Bezirksgrenzen.Bezirksgrenzabschnitt"))return new ch.interlis.models.DM01AVCH24LV95D.Bezirksgrenzen.Bezirksgrenzabschnitt(oid);
      if(type.equals("DM01AVCH24LV95D.Gebaeudeadressen.Gebaeudeeingang"))return new ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen.Gebaeudeeingang(oid);
      if(type.equals("DM01AVCH24LV95D.Einzelobjekte.ObjektnummerPos"))return new ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.ObjektnummerPos(oid);
      if(type.equals("DM01AVCH24LV95D.PLZOrtschaft.PLZ6Nachfuehrung"))return new ch.interlis.models.DM01AVCH24LV95D.PLZOrtschaft.PLZ6Nachfuehrung(oid);
      if(type.equals("DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsVerbund"))return new ch.interlis.models.DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsVerbund(oid);
      if(type.equals("DM01AVCH24LV95D.Gemeindegrenzen.Gemeindegrenze"))return new ch.interlis.models.DM01AVCH24LV95D.Gemeindegrenzen.Gemeindegrenze(oid);
      if(type.equals("DM01AVCH24LV95D.Einzelobjekte.Objektnummer"))return new ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.Objektnummer(oid);
      if(type.equals("DM01AVCH24LV95D.Nomenklatur.Flurname"))return new ch.interlis.models.DM01AVCH24LV95D.Nomenklatur.Flurname(oid);
      if(type.equals("DM01AVCH24LV95D.Bodenbedeckung.BoFlaeche"))return new ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.BoFlaeche(oid);
      if(type.equals("DM01AVCH24LV95D.Gebaeudeadressen.Strassenstueck"))return new ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen.Strassenstueck(oid);
      if(type.equals("DM01AVCH24LV95D.Nomenklatur.FlurnamePos"))return new ch.interlis.models.DM01AVCH24LV95D.Nomenklatur.FlurnamePos(oid);
      if(type.equals("DM01AVCH24LV95D.Nomenklatur.Gelaendename"))return new ch.interlis.models.DM01AVCH24LV95D.Nomenklatur.Gelaendename(oid);
      if(type.equals("DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeBeschreibung"))return new ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeBeschreibung(oid);
      if(type.equals("DM01AVCH24LV95D.Gemeindegrenzen.GEMNachfuehrung"))return new ch.interlis.models.DM01AVCH24LV95D.Gemeindegrenzen.GEMNachfuehrung(oid);
      if(type.equals("DM01AVCH24LV95D.Nomenklatur.NKNachfuehrung"))return new ch.interlis.models.DM01AVCH24LV95D.Nomenklatur.NKNachfuehrung(oid);
      if(type.equals("DM01AVCH24LV95D.Nomenklatur.Ortsname"))return new ch.interlis.models.DM01AVCH24LV95D.Nomenklatur.Ortsname(oid);
      if(type.equals("DM01AVCH24LV95D.Liegenschaften.Liegenschaft"))return new ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.Liegenschaft(oid);
      if(type.equals("DM01AVCH24LV95D.Liegenschaften.Grenzpunkt"))return new ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.Grenzpunkt(oid);
      if(type.equals("DM01AVCH24LV95D.Gebaeudeadressen.Lokalisation"))return new ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen.Lokalisation(oid);
      if(type.equals("DM01AVCH24LV95D.Liegenschaften.ProjGrundstueckPos"))return new ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.ProjGrundstueckPos(oid);
      if(type.equals("DM01AVCH24LV95D.FixpunkteKategorie2.LFP2"))return new ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie2.LFP2(oid);
      if(type.equals("DM01AVCH24LV95D.Einzelobjekte.Einzelpunkt"))return new ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.Einzelpunkt(oid);
      if(type.equals("DM01AVCH24LV95D.Gemeindegrenzen.Hoheitsgrenzpunkt"))return new ch.interlis.models.DM01AVCH24LV95D.Gemeindegrenzen.Hoheitsgrenzpunkt(oid);
      if(type.equals("DM01AVCH24LV95D.Liegenschaften.Bergwerk"))return new ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.Bergwerk(oid);
      if(type.equals("DM01AVCH24LV95D.Liegenschaften.LSNachfuehrung"))return new ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.LSNachfuehrung(oid);
      if(type.equals("DM01AVCH24LV95D.Bodenbedeckung.ObjektnamePos"))return new ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.ObjektnamePos(oid);
      if(type.equals("DM01AVCH24LV95D.Planrahmen.Koordinatenanschrift"))return new ch.interlis.models.DM01AVCH24LV95D.Planrahmen.Koordinatenanschrift(oid);
      if(type.equals("DM01AVCH24LV95D.FixpunkteKategorie3.HFP3Nachfuehrung"))return new ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie3.HFP3Nachfuehrung(oid);
      if(type.equals("DM01AVCH24LV95D.FixpunkteKategorie2.HFP2Pos"))return new ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie2.HFP2Pos(oid);
      if(type.equals("DM01AVCH24LV95D.FixpunkteKategorie2.LFP2Nachfuehrung"))return new ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie2.LFP2Nachfuehrung(oid);
      if(type.equals("DM01AVCH24LV95D.Rohrleitungen.Signalpunkt"))return new ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen.Signalpunkt(oid);
      if(type.equals("DM01AVCH24LV95D.Nomenklatur.OrtsnamePos"))return new ch.interlis.models.DM01AVCH24LV95D.Nomenklatur.OrtsnamePos(oid);
      if(type.equals("DM01AVCH24LV95D.FixpunkteKategorie1.HFP1"))return new ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie1.HFP1(oid);
      if(type.equals("DM01AVCH24LV95D.Rohrleitungen.SignalpunktPos"))return new ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen.SignalpunktPos(oid);
      if(type.equals("DM01AVCH24LV95D.PLZOrtschaft.OSNachfuehrung"))return new ch.interlis.models.DM01AVCH24LV95D.PLZOrtschaft.OSNachfuehrung(oid);
      if(type.equals("DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsName"))return new ch.interlis.models.DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsName(oid);
      if(type.equals("DM01AVCH24LV95D.Hoehen.Aussparung"))return new ch.interlis.models.DM01AVCH24LV95D.Hoehen.Aussparung(oid);
      if(type.equals("DM01AVCH24LV95D.FixpunkteKategorie1.LFP1Symbol"))return new ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie1.LFP1Symbol(oid);
      if(type.equals("DM01AVCH24LV95D.Bodenbedeckung.Gebaeudenummer"))return new ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.Gebaeudenummer(oid);
      if(type.equals("DM01AVCH24LV95D.FixpunkteKategorie1.LFP1Pos"))return new ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie1.LFP1Pos(oid);
      if(type.equals("DM01AVCH24LV95D.Nummerierungsbereiche.NBGeometrie"))return new ch.interlis.models.DM01AVCH24LV95D.Nummerierungsbereiche.NBGeometrie(oid);
      if(type.equals("DM01AVCH24LV95D.FixpunkteKategorie3.LFP3Nachfuehrung"))return new ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie3.LFP3Nachfuehrung(oid);
      if(type.equals("DM01AVCH24LV95D.FixpunkteKategorie3.LFP3Pos"))return new ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie3.LFP3Pos(oid);
      if(type.equals("DM01AVCH24LV95D.Bodenbedeckung.Einzelpunkt"))return new ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.Einzelpunkt(oid);
      if(type.equals("DM01AVCH24LV95D.Liegenschaften.ProjLiegenschaft"))return new ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.ProjLiegenschaft(oid);
      if(type.equals("DM01AVCH24LV95D.Rohrleitungen.Punktelement"))return new ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen.Punktelement(oid);
      if(type.equals("DM01AVCH24LV95D.Bodenbedeckung.ProjObjektname"))return new ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.ProjObjektname(oid);
      if(type.equals("DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsName_Pos"))return new ch.interlis.models.DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsName_Pos(oid);
      if(type.equals("DM01AVCH24LV95D.Nummerierungsbereiche.NummerierungsbereichPos"))return new ch.interlis.models.DM01AVCH24LV95D.Nummerierungsbereiche.NummerierungsbereichPos(oid);
      if(type.equals("DM01AVCH24LV95D.Planeinteilungen.PlanPos"))return new ch.interlis.models.DM01AVCH24LV95D.Planeinteilungen.PlanPos(oid);
      if(type.equals("DM01AVCH24LV95D.Einzelobjekte.Flaechenelement"))return new ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.Flaechenelement(oid);
      if(type.equals("DM01AVCH24LV95D.FixpunkteKategorie1.LFP1"))return new ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie1.LFP1(oid);
      if(type.equals("DM01AVCH24LV95D.Einzelobjekte.ObjektnamePos"))return new ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.ObjektnamePos(oid);
      if(type.equals("DM01AVCH24LV95D.Rohrleitungen.LineAttrib7"))return new ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen.LineAttrib7();
      if(type.equals("DM01AVCH24LV95D.TSEinteilung.ToleranzstufePos"))return new ch.interlis.models.DM01AVCH24LV95D.TSEinteilung.ToleranzstufePos(oid);
      if(type.equals("DM01AVCH24LV95D.Bodenbedeckung.BBNachfuehrung"))return new ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.BBNachfuehrung(oid);
      if(type.equals("DM01AVCH24LV95D.Bodenbedeckung.ProjGebaeudenummerPos"))return new ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.ProjGebaeudenummerPos(oid);
      if(type.equals("DM01AVCH24LV95D.Einzelobjekte.LinienelementSymbol"))return new ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.LinienelementSymbol(oid);
      if(type.equals("DM01AVCH24LV95D.FixpunkteKategorie3.LFP3Symbol"))return new ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie3.LFP3Symbol(oid);
      if(type.equals("DM01AVCH24LV95D.Rohrleitungen.Einzelpunkt"))return new ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen.Einzelpunkt(oid);
      if(type.equals("DM01AVCH24LV95D.Rohrleitungen.Flaechenelement"))return new ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen.Flaechenelement(oid);
      if(type.equals("DM01AVCH24LV95D.Gemeindegrenzen.LineAttrib8"))return new ch.interlis.models.DM01AVCH24LV95D.Gemeindegrenzen.LineAttrib8();
      if(type.equals("DM01AVCH24LV95D.Bodenbedeckung.ProjGebaeudenummer"))return new ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.ProjGebaeudenummer(oid);
      if(type.equals("DM01AVCH24LV95D.FixpunkteKategorie2.LFP2Pos"))return new ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie2.LFP2Pos(oid);
      if(type.equals("DM01AVCH24LV95D.PLZOrtschaft.Ortschaft"))return new ch.interlis.models.DM01AVCH24LV95D.PLZOrtschaft.Ortschaft(oid);
      if(type.equals("DM01AVCH24LV95D.Einzelobjekte.Linienelement"))return new ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.Linienelement(oid);
      if(type.equals("DM01AVCH24LV95D.Einzelobjekte.EinzelpunktPos"))return new ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.EinzelpunktPos(oid);
      return null;
      }
    };
  }
  static public ch.interlis.iom_j.ViewableProperties getIoxMapping()
  {
    ch.interlis.iom_j.ViewableProperties mapping=new ch.interlis.iom_j.ViewableProperties();
    java.util.HashMap<String,String> nameMap=new java.util.HashMap<String,String>();
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie1","FixpunkteKategorie1");
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie2","FixpunkteKategorie2");
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie3","FixpunkteKategorie3");
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung","Bodenbedeckung");
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte","Einzelobjekte");
    nameMap.put("DM01AVCH24LV95D.Hoehen","Hoehen");
    nameMap.put("DM01AVCH24LV95D.Nomenklatur","Nomenklatur");
    nameMap.put("DM01AVCH24LV95D.Liegenschaften","Liegenschaften");
    nameMap.put("DM01AVCH24LV95D.Rohrleitungen","Rohrleitungen");
    nameMap.put("DM01AVCH24LV95D.Nummerierungsbereiche","Nummerierungsbereiche");
    nameMap.put("DM01AVCH24LV95D.Gemeindegrenzen","Gemeindegrenzen");
    nameMap.put("DM01AVCH24LV95D.Bezirksgrenzen","Bezirksgrenzen");
    nameMap.put("DM01AVCH24LV95D.Kantonsgrenzen","Kantonsgrenzen");
    nameMap.put("DM01AVCH24LV95D.Landesgrenzen","Landesgrenzen");
    nameMap.put("DM01AVCH24LV95D.Planeinteilungen","Planeinteilungen");
    nameMap.put("DM01AVCH24LV95D.TSEinteilung","TSEinteilung");
    nameMap.put("DM01AVCH24LV95D.Rutschgebiete","Rutschgebiete");
    nameMap.put("DM01AVCH24LV95D.PLZOrtschaft","PLZOrtschaft");
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen","Gebaeudeadressen");
    nameMap.put("DM01AVCH24LV95D.Planrahmen","Planrahmen");
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.ObjektnameObjektname_von", "Bodenbedeckung.ObjektnameObjektname_von");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.ObjektnameObjektname_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen.LokalisationsNamePos", "LokalisationsNamePos");
    mapping.defineClass("DM01AVCH24LV95D.Gebaeudeadressen.LokalisationsNamePos", new String[]{   "AnfIndex"
      ,"EndIndex"
      ,"Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Groesse"
      ,"Hilfslinie"
      ,"LokalisationsNamePos_von"
      });
    nameMap.put("DM01AVCH24LV95D.TSEinteilung.Toleranzstufe", "Toleranzstufe");
    mapping.defineClass("DM01AVCH24LV95D.TSEinteilung.Toleranzstufe", new String[]{   "NBIdent"
      ,"Identifikator"
      ,"Geometrie"
      ,"GueltigerEintrag"
      ,"Art"
      });
    nameMap.put("DM01AVCH24LV95D.Planeinteilungen.Plan", "Plan");
    mapping.defineClass("DM01AVCH24LV95D.Planeinteilungen.Plan", new String[]{   "NBIdent"
      ,"Nummer"
      ,"TechDossier"
      ,"GueltigerEintrag"
      });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie1.LFP1SymbolLFP1Symbol_von", "LFP1SymbolLFP1Symbol_von");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie1.LFP1SymbolLFP1Symbol_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie1.HFP1Pos", "HFP1Pos");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie1.HFP1Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"HFP1Pos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.GebaeudenummerPosGebaeudenummerPos_von", "GebaeudenummerPosGebaeudenummerPos_von");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.GebaeudenummerPosGebaeudenummerPos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.ObjektnamePosObjektnamePos_von", "Bodenbedeckung.ObjektnamePosObjektnamePos_von");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.ObjektnamePosObjektnamePos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.EinzelpunktPos", "Bodenbedeckung.EinzelpunktPos");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.EinzelpunktPos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"EinzelpunktPos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Nummerierungsbereiche.Nummerierungsbereich", "Nummerierungsbereich");
    mapping.defineClass("DM01AVCH24LV95D.Nummerierungsbereiche.Nummerierungsbereich", new String[]{   "Kt"
      ,"NBNummer"
      ,"TechDossier"
      ,"GueltigerEintrag"
      });
    nameMap.put("DM01AVCH24LV95D.Planeinteilungen.PlangeometriePlangeometrie_von", "PlangeometriePlangeometrie_von");
    mapping.defineClass("DM01AVCH24LV95D.Planeinteilungen.PlangeometriePlangeometrie_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.EinzelobjektEntstehung", "EinzelobjektEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.EinzelobjektEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Planrahmen.Darstellungsflaeche", "Darstellungsflaeche");
    mapping.defineClass("DM01AVCH24LV95D.Planrahmen.Darstellungsflaeche", new String[]{   "Geometrie"
      ,"Auswahlart"
      ,"Darstellungsflaeche_von"
      });
    nameMap.put("DM01AVCH24LV95D.Landesgrenzen.Landesgrenzabschnitt", "Landesgrenzabschnitt");
    mapping.defineClass("DM01AVCH24LV95D.Landesgrenzen.Landesgrenzabschnitt", new String[]{   "Geometrie"
      ,"Gueltigkeit"
      });
    nameMap.put("DM01AVCH24LV95D.Planrahmen.PlanLayout", "PlanLayout");
    mapping.defineClass("DM01AVCH24LV95D.Planrahmen.PlanLayout", new String[]{   "NBIdent"
      ,"Identifikator"
      ,"Layouttyp"
      ,"Plannummer"
      ,"Gemeindename"
      ,"Geometername"
      ,"Erstellungsdatum"
      ,"NachfuehrungsGeometername"
      ,"Nachfuehrungsdatum"
      ,"Massstabszahl"
      ,"Plannullpunkt"
      ,"E_Azimut"
      ,"UebersichtMassstabszahl"
      ,"UebersichtPlannullpunkt"
      ,"Mit_Koordinatennetz"
      });
    nameMap.put("DM01AVCH24LV95D.Rohrleitungen.EinzelpunktPosEinzelpunktPos_von", "Rohrleitungen.EinzelpunktPosEinzelpunktPos_von");
    mapping.defineClass("DM01AVCH24LV95D.Rohrleitungen.EinzelpunktPosEinzelpunktPos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.GrenzpunktPos", "GrenzpunktPos");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.GrenzpunktPos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"GrenzpunktPos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Rohrleitungen.LeitungsobjektPosLeitungsobjektPos_von", "LeitungsobjektPosLeitungsobjektPos_von");
    mapping.defineClass("DM01AVCH24LV95D.Rohrleitungen.LeitungsobjektPosLeitungsobjektPos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie2.LFP2Entstehung", "LFP2Entstehung");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie2.LFP2Entstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.GrenzpunktSymbol", "GrenzpunktSymbol");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.GrenzpunktSymbol", new String[]{   "Ori"
      ,"GrenzpunktSymbol_von"
      });
    nameMap.put("DM01AVCH24LV95D.Nomenklatur.FlurnameEntstehung", "FlurnameEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.Nomenklatur.FlurnameEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Rohrleitungen.SignalpunktPosSignalpunktPos_von", "SignalpunktPosSignalpunktPos_von");
    mapping.defineClass("DM01AVCH24LV95D.Rohrleitungen.SignalpunktPosSignalpunktPos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Rohrleitungen.EinzelpunktEntstehung", "Rohrleitungen.EinzelpunktEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.Rohrleitungen.EinzelpunktEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.GrundstueckPosGrundstueckPos_von", "GrundstueckPosGrundstueckPos_von");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.GrundstueckPosGrundstueckPos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Rutschgebiete.RutschungPosRutschungPos_von", "RutschungPosRutschungPos_von");
    mapping.defineClass("DM01AVCH24LV95D.Rutschgebiete.RutschungPosRutschungPos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie3.LFP3", "LFP3");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie3.LFP3", new String[]{   "NBIdent"
      ,"Nummer"
      ,"Geometrie"
      ,"HoeheGeom"
      ,"LageGen"
      ,"LageZuv"
      ,"HoeheGen"
      ,"HoeheZuv"
      ,"Punktzeichen"
      ,"Protokoll"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.BoFlaecheSymbol", "BoFlaecheSymbol");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.BoFlaecheSymbol", new String[]{   "Pos"
      ,"Ori"
      ,"BoFlaecheSymbol_von"
      });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie3.LFP3Entstehung", "LFP3Entstehung");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie3.LFP3Entstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Gemeindegrenzen.Gemeinde", "Gemeinde");
    mapping.defineClass("DM01AVCH24LV95D.Gemeindegrenzen.Gemeinde", new String[]{   "Name"
      ,"BFSNr"
      });
    nameMap.put("DM01AVCH24LV95D.Rohrleitungen.Linienelement", "Rohrleitungen.Linienelement");
    mapping.defineClass("DM01AVCH24LV95D.Rohrleitungen.Linienelement", new String[]{   "Geometrie"
      ,"Linienart"
      ,"Linienelement_von"
      });
    nameMap.put("DM01AVCH24LV95D.Planrahmen.Netzkreuz", "Netzkreuz");
    mapping.defineClass("DM01AVCH24LV95D.Planrahmen.Netzkreuz", new String[]{   "Pos"
      ,"Ori"
      ,"Art"
      ,"Netzkreuz_von"
      });
    nameMap.put("DM01AVCH24LV95D.PLZOrtschaft.PLZ6", "PLZ6");
    mapping.defineClass("DM01AVCH24LV95D.PLZOrtschaft.PLZ6", new String[]{   "Flaeche"
      ,"Status"
      ,"InAenderung"
      ,"PLZ"
      ,"Zusatzziffern"
      ,"Entstehung"
      ,"PLZ6_von"
      });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie2.LFP2SymbolLFP2Symbol_von", "LFP2SymbolLFP2Symbol_von");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie2.LFP2SymbolLFP2Symbol_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.ProjGebaeudenummerProjGebaeudenummer_von", "ProjGebaeudenummerProjGebaeudenummer_von");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.ProjGebaeudenummerProjGebaeudenummer_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.GrenzpunktPosGrenzpunktPos_von", "GrenzpunktPosGrenzpunktPos_von");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.GrenzpunktPosGrenzpunktPos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.ProjBergwerk", "ProjBergwerk");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.ProjBergwerk", new String[]{   "NummerTeilGrundstueck"
      ,"Geometrie"
      ,"Flaechenmass"
      ,"ProjBergwerk_von"
      });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.ProjObjektnamePos", "ProjObjektnamePos");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.ProjObjektnamePos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Groesse"
      ,"ProjObjektnamePos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Hoehen.AussparungEntstehung", "AussparungEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.Hoehen.AussparungEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeBeschreibungGebaeudeBeschreibung_von", "GebaeudeBeschreibungGebaeudeBeschreibung_von");
    mapping.defineClass("DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeBeschreibungGebaeudeBeschreibung_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.ObjektnameObjektname_von", "Einzelobjekte.ObjektnameObjektname_von");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.ObjektnameObjektname_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Hoehen.HoehenpunktPos", "HoehenpunktPos");
    mapping.defineClass("DM01AVCH24LV95D.Hoehen.HoehenpunktPos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"HoehenpunktPos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeName", "GebaeudeName");
    mapping.defineClass("DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeName", new String[]{   "Text"
      ,"KurzText"
      ,"IndexText"
      ,"Sprache"
      ,"GebaeudeName_von"
      });
    nameMap.put("DM01AVCH24LV95D.Hoehen.HoehenpunktEntstehung", "HoehenpunktEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.Hoehen.HoehenpunktEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeNamePos", "GebaeudeNamePos");
    mapping.defineClass("DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeNamePos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Groesse"
      ,"Hilfslinie"
      ,"GebaeudeNamePos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.ProjGrundstueckPosProjGrundstueckPos_von", "ProjGrundstueckPosProjGrundstueckPos_von");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.ProjGrundstueckPosProjGrundstueckPos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.GrundstueckPos", "GrundstueckPos");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.GrundstueckPos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Groesse"
      ,"Hilfslinie"
      ,"GrundstueckPos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Hoehen.HONachfuehrung", "HONachfuehrung");
    mapping.defineClass("DM01AVCH24LV95D.Hoehen.HONachfuehrung", new String[]{   "NBIdent"
      ,"Identifikator"
      ,"Beschreibung"
      ,"Perimeter"
      ,"Gueltigkeit"
      ,"GueltigerEintrag"
      ,"Datum1"
      });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.BergwerkBergwerk_von", "BergwerkBergwerk_von");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.BergwerkBergwerk_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Gemeindegrenzen.HoheitsgrenzpunktPos", "HoheitsgrenzpunktPos");
    mapping.defineClass("DM01AVCH24LV95D.Gemeindegrenzen.HoheitsgrenzpunktPos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"HoheitsgrenzpunktPos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen.LokalisationsName", "LokalisationsName");
    mapping.defineClass("DM01AVCH24LV95D.Gebaeudeadressen.LokalisationsName", new String[]{   "Text"
      ,"KurzText"
      ,"IndexText"
      ,"Sprache"
      ,"Benannte"
      });
    nameMap.put("DM01AVCH24LV95D.Gemeindegrenzen.GemeindegrenzeGemeindegrenze_von", "GemeindegrenzeGemeindegrenze_von");
    mapping.defineClass("DM01AVCH24LV95D.Gemeindegrenzen.GemeindegrenzeGemeindegrenze_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Planrahmen.Linienobjekt", "Linienobjekt");
    mapping.defineClass("DM01AVCH24LV95D.Planrahmen.Linienobjekt", new String[]{   "Geometrie"
      ,"Art"
      ,"Linienobjekt_von"
      });
    nameMap.put("DM01AVCH24LV95D.Planrahmen.KoordinatenLinieKoordinatenLinie_von", "KoordinatenLinieKoordinatenLinie_von");
    mapping.defineClass("DM01AVCH24LV95D.Planrahmen.KoordinatenLinieKoordinatenLinie_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Nomenklatur.OrtsnameEntstehung", "OrtsnameEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.Nomenklatur.OrtsnameEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Planrahmen.PlanbeschriftungPos", "PlanbeschriftungPos");
    mapping.defineClass("DM01AVCH24LV95D.Planrahmen.PlanbeschriftungPos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Groesse"
      ,"PlanbeschriftungPos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Rohrleitungen.Leitungsobjekt", "Leitungsobjekt");
    mapping.defineClass("DM01AVCH24LV95D.Rohrleitungen.Leitungsobjekt", new String[]{   "Betreiber"
      ,"Qualitaet"
      ,"Art"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.GebaeudenummerGebaeudenummer_von", "GebaeudenummerGebaeudenummer_von");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.GebaeudenummerGebaeudenummer_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Gemeindegrenzen.ProjGemeindegrenzeProjGemeindegrenze_von", "ProjGemeindegrenzeProjGemeindegrenze_von");
    mapping.defineClass("DM01AVCH24LV95D.Gemeindegrenzen.ProjGemeindegrenzeProjGemeindegrenze_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsVerbundText", "OrtschaftsVerbundText");
    mapping.defineClass("DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsVerbundText", new String[]{   "Text"
      ,"Sprache"
      ,"OrtschaftsVerbundText_von"
      });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.GebaeudenummerPos", "GebaeudenummerPos");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.GebaeudenummerPos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Groesse"
      ,"GebaeudenummerPos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Gemeindegrenzen.HoheitsgrenzpunktEntstehung", "HoheitsgrenzpunktEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.Gemeindegrenzen.HoheitsgrenzpunktEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen.BenanntesGebiet", "BenanntesGebiet");
    mapping.defineClass("DM01AVCH24LV95D.Gebaeudeadressen.BenanntesGebiet", new String[]{   "Flaeche"
      ,"BenanntesGebiet_von"
      });
    nameMap.put("DM01AVCH24LV95D.Rohrleitungen.LeitungsobjektPos", "LeitungsobjektPos");
    mapping.defineClass("DM01AVCH24LV95D.Rohrleitungen.LeitungsobjektPos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Groesse"
      ,"LeitungsobjektPos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.EinzelpunktPosEinzelpunktPos_von", "Einzelobjekte.EinzelpunktPosEinzelpunktPos_von");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.EinzelpunktPosEinzelpunktPos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.ProjGrundstueck", "ProjGrundstueck");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.ProjGrundstueck", new String[]{   "NBIdent"
      ,"Nummer"
      ,"EGRIS_EGRID"
      ,"Gueltigkeit"
      ,"Vollstaendigkeit"
      ,"Art"
      ,"GesamteFlaechenmass"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.Rutschgebiete.RutschungPos", "RutschungPos");
    mapping.defineClass("DM01AVCH24LV95D.Rutschgebiete.RutschungPos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Groesse"
      ,"RutschungPos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.SelbstRecht", "SelbstRecht");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.SelbstRecht", new String[]{   "NummerTeilGrundstueck"
      ,"Geometrie"
      ,"Flaechenmass"
      ,"SelbstRecht_von"
      });
    nameMap.put("DM01AVCH24LV95D.Hoehen.Gelaendekante", "Gelaendekante");
    mapping.defineClass("DM01AVCH24LV95D.Hoehen.Gelaendekante", new String[]{   "Geometrie"
      ,"Qualitaet"
      ,"Art"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.Planrahmen.KoordinatenanschriftPos", "KoordinatenanschriftPos");
    mapping.defineClass("DM01AVCH24LV95D.Planrahmen.KoordinatenanschriftPos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Groesse"
      ,"KoordinatenanschriftPos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.ProjBoFlaecheSymbolProjBoFlaecheSymbol_von", "ProjBoFlaecheSymbolProjBoFlaecheSymbol_von");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.ProjBoFlaecheSymbolProjBoFlaecheSymbol_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Rohrleitungen.EinzelpunktPos", "Rohrleitungen.EinzelpunktPos");
    mapping.defineClass("DM01AVCH24LV95D.Rohrleitungen.EinzelpunktPos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"EinzelpunktPos_von"
      });
    nameMap.put("DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsNameOrtschaftsName_von", "OrtschaftsNameOrtschaftsName_von");
    mapping.defineClass("DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsNameOrtschaftsName_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.ProjBoFlaecheSymbol", "ProjBoFlaecheSymbol");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.ProjBoFlaecheSymbol", new String[]{   "Pos"
      ,"Ori"
      ,"ProjBoFlaecheSymbol_von"
      });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.Punktelement", "Einzelobjekte.Punktelement");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.Punktelement", new String[]{   "Geometrie"
      ,"Ori"
      ,"Punktelement_von"
      });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.ProjBoFlaecheEntstehung", "ProjBoFlaecheEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.ProjBoFlaecheEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.TSEinteilung.ToleranzstufePosToleranzstufePos_von", "ToleranzstufePosToleranzstufePos_von");
    mapping.defineClass("DM01AVCH24LV95D.TSEinteilung.ToleranzstufePosToleranzstufePos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeNamePosGebaeudeNamePos_von", "GebaeudeNamePosGebaeudeNamePos_von");
    mapping.defineClass("DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeNamePosGebaeudeNamePos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.ProjLiegenschaftProjLiegenschaft_von", "ProjLiegenschaftProjLiegenschaft_von");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.ProjLiegenschaftProjLiegenschaft_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.ProjSelbstRecht", "ProjSelbstRecht");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.ProjSelbstRecht", new String[]{   "NummerTeilGrundstueck"
      ,"Geometrie"
      ,"Flaechenmass"
      ,"ProjSelbstRecht_von"
      });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie2.LFP2Symbol", "LFP2Symbol");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie2.LFP2Symbol", new String[]{   "Ori"
      ,"LFP2Symbol_von"
      });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie3.LFP3PosLFP3Pos_von", "LFP3PosLFP3Pos_von");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie3.LFP3PosLFP3Pos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.Objektname", "Einzelobjekte.Objektname");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.Objektname", new String[]{   "Name"
      ,"Objektname_von"
      });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie3.HFP3", "HFP3");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie3.HFP3", new String[]{   "NBIdent"
      ,"Nummer"
      ,"Geometrie"
      ,"HoeheGeom"
      ,"LageGen"
      ,"LageZuv"
      ,"HoeheGen"
      ,"HoeheZuv"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.ProjGrundstueckEntstehung", "ProjGrundstueckEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.ProjGrundstueckEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeNameGebaeudeName_von", "GebaeudeNameGebaeudeName_von");
    mapping.defineClass("DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeNameGebaeudeName_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Kantonsgrenzen.Kantonsgrenzabschnitt", "Kantonsgrenzabschnitt");
    mapping.defineClass("DM01AVCH24LV95D.Kantonsgrenzen.Kantonsgrenzabschnitt", new String[]{   "Geometrie"
      ,"Gueltigkeit"
      });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie1.LFP1PosLFP1Pos_von", "LFP1PosLFP1Pos_von");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie1.LFP1PosLFP1Pos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Hoehen.Hoehenpunkt", "Hoehenpunkt");
    mapping.defineClass("DM01AVCH24LV95D.Hoehen.Hoehenpunkt", new String[]{   "Geometrie"
      ,"Qualitaet"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.Gemeindegrenzen.ProjGemeindegrenze", "ProjGemeindegrenze");
    mapping.defineClass("DM01AVCH24LV95D.Gemeindegrenzen.ProjGemeindegrenze", new String[]{   "Geometrie"
      ,"Entstehung"
      ,"ProjGemeindegrenze_von"
      });
    nameMap.put("DM01AVCH24LV95D.Nomenklatur.GelaendenamePos", "GelaendenamePos");
    mapping.defineClass("DM01AVCH24LV95D.Nomenklatur.GelaendenamePos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Groesse"
      ,"Stil"
      ,"GelaendenamePos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Rohrleitungen.LeitungsobjektEntstehung", "LeitungsobjektEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.Rohrleitungen.LeitungsobjektEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Planrahmen.KoordinatenLinie", "KoordinatenLinie");
    mapping.defineClass("DM01AVCH24LV95D.Planrahmen.KoordinatenLinie", new String[]{   "Geometrie"
      ,"KoordinatenLinie_von"
      });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.Grundstueck", "Grundstueck");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.Grundstueck", new String[]{   "NBIdent"
      ,"Nummer"
      ,"EGRIS_EGRID"
      ,"Gueltigkeit"
      ,"Vollstaendigkeit"
      ,"Art"
      ,"GesamteFlaechenmass"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.Rohrleitungen.FlaechenelementFlaechenelement_von", "Rohrleitungen.FlaechenelementFlaechenelement_von");
    mapping.defineClass("DM01AVCH24LV95D.Rohrleitungen.FlaechenelementFlaechenelement_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Planeinteilungen.Plangeometrie", "Plangeometrie");
    mapping.defineClass("DM01AVCH24LV95D.Planeinteilungen.Plangeometrie", new String[]{   "Geometrie"
      ,"Plangeometrie_von"
      });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.EONachfuehrung", "EONachfuehrung");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.EONachfuehrung", new String[]{   "NBIdent"
      ,"Identifikator"
      ,"Beschreibung"
      ,"Perimeter"
      ,"Gueltigkeit"
      ,"GueltigerEintrag"
      ,"Datum1"
      });
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen.HausnummerPos", "HausnummerPos");
    mapping.defineClass("DM01AVCH24LV95D.Gebaeudeadressen.HausnummerPos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Groesse"
      ,"HausnummerPos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Planrahmen.PlanLayoutSymbol", "PlanLayoutSymbol");
    mapping.defineClass("DM01AVCH24LV95D.Planrahmen.PlanLayoutSymbol", new String[]{   "Pos"
      ,"Ori"
      ,"Art"
      ,"PlanLayoutSymbol_von"
      });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie2.HFP2Nachfuehrung", "HFP2Nachfuehrung");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie2.HFP2Nachfuehrung", new String[]{   "NBIdent"
      ,"Identifikator"
      ,"Beschreibung"
      ,"Perimeter"
      ,"GueltigerEintrag"
      ,"Datum1"
      });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.ProjBoFlaeche", "ProjBoFlaeche");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.ProjBoFlaeche", new String[]{   "Geometrie"
      ,"Qualitaet"
      ,"Art"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie3.HFP3Pos", "HFP3Pos");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie3.HFP3Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"HFP3Pos_von"
      });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie1.LFP1Entstehung", "LFP1Entstehung");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie1.LFP1Entstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Planrahmen.PlanbeschriftungPlanbeschriftung_von", "PlanbeschriftungPlanbeschriftung_von");
    mapping.defineClass("DM01AVCH24LV95D.Planrahmen.PlanbeschriftungPlanbeschriftung_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Nomenklatur.FlurnamePosFlurnamePos_von", "FlurnamePosFlurnamePos_von");
    mapping.defineClass("DM01AVCH24LV95D.Nomenklatur.FlurnamePosFlurnamePos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie1.HFP1Entstehung", "HFP1Entstehung");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie1.HFP1Entstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.Objektname", "Bodenbedeckung.Objektname");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.Objektname", new String[]{   "Name"
      ,"Objektname_von"
      });
    nameMap.put("DM01AVCH24LV95D.Rohrleitungen.SignalpunktEntstehung", "SignalpunktEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.Rohrleitungen.SignalpunktEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Planrahmen.LinienobjektLinienobjekt_von", "LinienobjektLinienobjekt_von");
    mapping.defineClass("DM01AVCH24LV95D.Planrahmen.LinienobjektLinienobjekt_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie1.LFP1Nachfuehrung", "LFP1Nachfuehrung");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie1.LFP1Nachfuehrung", new String[]{   "NBIdent"
      ,"Identifikator"
      ,"Beschreibung"
      ,"Perimeter"
      ,"GueltigerEintrag"
      ,"Datum1"
      });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.LineAttrib6", "LineAttrib6");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.LineAttrib6", new String[]{   "Linienart"
      });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.ProjObjektnameProjObjektname_von", "ProjObjektnameProjObjektname_von");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.ProjObjektnameProjObjektname_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.EinzelpunktEntstehung", "Bodenbedeckung.EinzelpunktEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.EinzelpunktEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Gemeindegrenzen.HoheitsgrenzpunktSymbol", "HoheitsgrenzpunktSymbol");
    mapping.defineClass("DM01AVCH24LV95D.Gemeindegrenzen.HoheitsgrenzpunktSymbol", new String[]{   "Ori"
      ,"HoheitsgrenzpunktSymbol_von"
      });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.ProjObjektnamePosProjObjektnamePos_von", "ProjObjektnamePosProjObjektnamePos_von");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.ProjObjektnamePosProjObjektnamePos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Planrahmen.Planbeschriftung", "Planbeschriftung");
    mapping.defineClass("DM01AVCH24LV95D.Planrahmen.Planbeschriftung", new String[]{   "Beschriftung"
      ,"Art"
      ,"Planbeschriftung_von"
      });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.LineAttrib1", "LineAttrib1");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.LineAttrib1", new String[]{   "Linienart"
      });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.Einzelobjekt", "Einzelobjekt");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.Einzelobjekt", new String[]{   "Qualitaet"
      ,"Art"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.LineAttrib2", "LineAttrib2");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.LineAttrib2", new String[]{   "Linienart"
      });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie2.HFP2", "HFP2");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie2.HFP2", new String[]{   "NBIdent"
      ,"Nummer"
      ,"Geometrie"
      ,"HoeheGeom"
      ,"LageGen"
      ,"LageZuv"
      ,"HoeheGen"
      ,"HoeheZuv"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.LineAttrib3", "LineAttrib3");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.LineAttrib3", new String[]{   "Linienart"
      });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.LineAttrib4", "LineAttrib4");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.LineAttrib4", new String[]{   "Linienart"
      });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.LineAttrib5", "LineAttrib5");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.LineAttrib5", new String[]{   "Linienart"
      });
    nameMap.put("DM01AVCH24LV95D.Rohrleitungen.RLNachfuehrung", "RLNachfuehrung");
    mapping.defineClass("DM01AVCH24LV95D.Rohrleitungen.RLNachfuehrung", new String[]{   "NBIdent"
      ,"Identifikator"
      ,"Beschreibung"
      ,"Perimeter"
      ,"Gueltigkeit"
      ,"GueltigerEintrag"
      ,"Datum1"
      });
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen.BenanntesGebietBenanntesGebiet_von", "BenanntesGebietBenanntesGebiet_von");
    mapping.defineClass("DM01AVCH24LV95D.Gebaeudeadressen.BenanntesGebietBenanntesGebiet_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Planrahmen.KoordinatenanschriftKoordinatenanschrift_von", "KoordinatenanschriftKoordinatenanschrift_von");
    mapping.defineClass("DM01AVCH24LV95D.Planrahmen.KoordinatenanschriftKoordinatenanschrift_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Nomenklatur.GelaendenameEntstehung", "GelaendenameEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.Nomenklatur.GelaendenameEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.FlaechenelementSymbol", "FlaechenelementSymbol");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.FlaechenelementSymbol", new String[]{   "Pos"
      ,"Ori"
      ,"FlaechenelementSymbol_von"
      });
    nameMap.put("DM01AVCH24LV95D.PLZOrtschaft.PLZ6Entstehung", "PLZ6Entstehung");
    mapping.defineClass("DM01AVCH24LV95D.PLZOrtschaft.PLZ6Entstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.ObjektnummerPosObjektnummerPos_von", "ObjektnummerPosObjektnummerPos_von");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.ObjektnummerPosObjektnummerPos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen.GEBNachfuehrung", "GEBNachfuehrung");
    mapping.defineClass("DM01AVCH24LV95D.Gebaeudeadressen.GEBNachfuehrung", new String[]{   "NBIdent"
      ,"Identifikator"
      ,"Beschreibung"
      ,"Perimeter"
      ,"Gueltigkeit"
      ,"GueltigerEintrag"
      });
    nameMap.put("DM01AVCH24LV95D.Rohrleitungen.LinienelementLinienelement_von", "Rohrleitungen.LinienelementLinienelement_von");
    mapping.defineClass("DM01AVCH24LV95D.Rohrleitungen.LinienelementLinienelement_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie1.HFP1Nachfuehrung", "HFP1Nachfuehrung");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie1.HFP1Nachfuehrung", new String[]{   "NBIdent"
      ,"Identifikator"
      ,"Beschreibung"
      ,"Perimeter"
      ,"GueltigerEintrag"
      ,"Datum1"
      });
    nameMap.put("DM01AVCH24LV95D.Rutschgebiete.Rutschung", "Rutschung");
    mapping.defineClass("DM01AVCH24LV95D.Rutschgebiete.Rutschung", new String[]{   "NBIdent"
      ,"Identifikator"
      ,"Name"
      ,"Geometrie"
      ,"GueltigerEintrag"
      });
    nameMap.put("DM01AVCH24LV95D.Hoehen.HoehenpunktPosHoehenpunktPos_von", "HoehenpunktPosHoehenpunktPos_von");
    mapping.defineClass("DM01AVCH24LV95D.Hoehen.HoehenpunktPosHoehenpunktPos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeeingangGebaeudeeingang_von", "GebaeudeeingangGebaeudeeingang_von");
    mapping.defineClass("DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeeingangGebaeudeeingang_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Bezirksgrenzen.Bezirksgrenzabschnitt", "Bezirksgrenzabschnitt");
    mapping.defineClass("DM01AVCH24LV95D.Bezirksgrenzen.Bezirksgrenzabschnitt", new String[]{   "Geometrie"
      ,"Gueltigkeit"
      });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.SelbstRechtSelbstRecht_von", "SelbstRechtSelbstRecht_von");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.SelbstRechtSelbstRecht_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Rohrleitungen.PunktelementPunktelement_von", "Rohrleitungen.PunktelementPunktelement_von");
    mapping.defineClass("DM01AVCH24LV95D.Rohrleitungen.PunktelementPunktelement_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Gemeindegrenzen.GemeindegrenzeEntstehung", "GemeindegrenzeEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.Gemeindegrenzen.GemeindegrenzeEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen.Gebaeudeeingang", "Gebaeudeeingang");
    mapping.defineClass("DM01AVCH24LV95D.Gebaeudeadressen.Gebaeudeeingang", new String[]{   "Status"
      ,"InAenderung"
      ,"AttributeProvisorisch"
      ,"IstOffizielleBezeichnung"
      ,"Lage"
      ,"HoehenLage"
      ,"Hausnummer"
      ,"Im_Gebaeude"
      ,"GWR_EGID"
      ,"GWR_EDID"
      ,"Entstehung"
      ,"Gebaeudeeingang_von"
      });
    nameMap.put("DM01AVCH24LV95D.Gemeindegrenzen.ProjGemeindegrenzeEntstehung", "ProjGemeindegrenzeEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.Gemeindegrenzen.ProjGemeindegrenzeEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsVerbundTextOrtschaftsVerbundText_von", "OrtschaftsVerbundTextOrtschaftsVerbundText_von");
    mapping.defineClass("DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsVerbundTextOrtschaftsVerbundText_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.ObjektnummerPos", "ObjektnummerPos");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.ObjektnummerPos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Groesse"
      ,"ObjektnummerPos_von"
      });
    nameMap.put("DM01AVCH24LV95D.PLZOrtschaft.PLZ6Nachfuehrung", "PLZ6Nachfuehrung");
    mapping.defineClass("DM01AVCH24LV95D.PLZOrtschaft.PLZ6Nachfuehrung", new String[]{   "NBIdent"
      ,"Identifikator"
      ,"Beschreibung"
      ,"Perimeter"
      ,"Gueltigkeit"
      ,"GueltigerEintrag"
      });
    nameMap.put("DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsVerbund", "OrtschaftsVerbund");
    mapping.defineClass("DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsVerbund", new String[]{   "Leer"
      });
    nameMap.put("DM01AVCH24LV95D.Gemeindegrenzen.Gemeindegrenze", "Gemeindegrenze");
    mapping.defineClass("DM01AVCH24LV95D.Gemeindegrenzen.Gemeindegrenze", new String[]{   "Geometrie"
      ,"Entstehung"
      ,"Gemeindegrenze_von"
      });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.PunktelementPunktelement_von", "Einzelobjekte.PunktelementPunktelement_von");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.PunktelementPunktelement_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.Objektnummer", "Objektnummer");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.Objektnummer", new String[]{   "Nummer"
      ,"GWR_EGID"
      ,"Objektnummer_von"
      });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.GrenzpunktEntstehung", "GrenzpunktEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.GrenzpunktEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.LiegenschaftLiegenschaft_von", "LiegenschaftLiegenschaft_von");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.LiegenschaftLiegenschaft_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Nomenklatur.Flurname", "Flurname");
    mapping.defineClass("DM01AVCH24LV95D.Nomenklatur.Flurname", new String[]{   "Name"
      ,"Geometrie"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie2.HFP2Entstehung", "HFP2Entstehung");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie2.HFP2Entstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Gemeindegrenzen.HoheitsgrenzpunktPosHoheitsgrenzpunktPos_von", "HoheitsgrenzpunktPosHoheitsgrenzpunktPos_von");
    mapping.defineClass("DM01AVCH24LV95D.Gemeindegrenzen.HoheitsgrenzpunktPosHoheitsgrenzpunktPos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.BoFlaeche", "BoFlaeche");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.BoFlaeche", new String[]{   "Geometrie"
      ,"Qualitaet"
      ,"Art"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.GrenzpunktSymbolGrenzpunktSymbol_von", "GrenzpunktSymbolGrenzpunktSymbol_von");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.GrenzpunktSymbolGrenzpunktSymbol_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen.Strassenstueck", "Strassenstueck");
    mapping.defineClass("DM01AVCH24LV95D.Gebaeudeadressen.Strassenstueck", new String[]{   "Geometrie"
      ,"Anfangspunkt"
      ,"Ordnung"
      ,"IstAchse"
      ,"Strassenstueck_von"
      });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie3.HFP3Entstehung", "HFP3Entstehung");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie3.HFP3Entstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Nomenklatur.FlurnamePos", "FlurnamePos");
    mapping.defineClass("DM01AVCH24LV95D.Nomenklatur.FlurnamePos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Groesse"
      ,"Stil"
      ,"FlurnamePos_von"
      });
    nameMap.put("DM01AVCH24LV95D.PLZOrtschaft.OrtschaftEntstehung", "OrtschaftEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.PLZOrtschaft.OrtschaftEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Nomenklatur.Gelaendename", "Gelaendename");
    mapping.defineClass("DM01AVCH24LV95D.Nomenklatur.Gelaendename", new String[]{   "Name"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeBeschreibung", "GebaeudeBeschreibung");
    mapping.defineClass("DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeBeschreibung", new String[]{   "Text"
      ,"Sprache"
      ,"GebaeudeBeschreibung_von"
      });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.FlaechenelementSymbolFlaechenelementSymbol_von", "FlaechenelementSymbolFlaechenelementSymbol_von");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.FlaechenelementSymbolFlaechenelementSymbol_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Gemeindegrenzen.GEMNachfuehrung", "GEMNachfuehrung");
    mapping.defineClass("DM01AVCH24LV95D.Gemeindegrenzen.GEMNachfuehrung", new String[]{   "NBIdent"
      ,"Identifikator"
      ,"Beschreibung"
      ,"Perimeter"
      ,"Gueltigkeit"
      ,"GueltigerEintrag"
      ,"Datum1"
      });
    nameMap.put("DM01AVCH24LV95D.Nomenklatur.NKNachfuehrung", "NKNachfuehrung");
    mapping.defineClass("DM01AVCH24LV95D.Nomenklatur.NKNachfuehrung", new String[]{   "NBIdent"
      ,"Identifikator"
      ,"Beschreibung"
      ,"Perimeter"
      ,"GueltigerEintrag"
      ,"Datum1"
      });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.ObjektnummerObjektnummer_von", "ObjektnummerObjektnummer_von");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.ObjektnummerObjektnummer_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen.LokalisationsNamePosLokalisationsNamePos_von", "LokalisationsNamePosLokalisationsNamePos_von");
    mapping.defineClass("DM01AVCH24LV95D.Gebaeudeadressen.LokalisationsNamePosLokalisationsNamePos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Nomenklatur.Ortsname", "Ortsname");
    mapping.defineClass("DM01AVCH24LV95D.Nomenklatur.Ortsname", new String[]{   "Name"
      ,"Geometrie"
      ,"Typ"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.Liegenschaft", "Liegenschaft");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.Liegenschaft", new String[]{   "NummerTeilGrundstueck"
      ,"Geometrie"
      ,"Flaechenmass"
      ,"Liegenschaft_von"
      });
    nameMap.put("DM01AVCH24LV95D.Planrahmen.DarstellungsflaecheDarstellungsflaeche_von", "DarstellungsflaecheDarstellungsflaeche_von");
    mapping.defineClass("DM01AVCH24LV95D.Planrahmen.DarstellungsflaecheDarstellungsflaeche_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.Grenzpunkt", "Grenzpunkt");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.Grenzpunkt", new String[]{   "Identifikator"
      ,"Geometrie"
      ,"LageGen"
      ,"LageZuv"
      ,"Punktzeichen"
      ,"ExaktDefiniert"
      ,"HoheitsgrenzsteinAlt"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen.Lokalisation", "Lokalisation");
    mapping.defineClass("DM01AVCH24LV95D.Gebaeudeadressen.Lokalisation", new String[]{   "Nummerierungsprinzip"
      ,"LokalisationNummer"
      ,"AttributeProvisorisch"
      ,"IstOffizielleBezeichnung"
      ,"Status"
      ,"InAenderung"
      ,"Art"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.ProjGrundstueckPos", "ProjGrundstueckPos");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.ProjGrundstueckPos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Groesse"
      ,"Hilfslinie"
      ,"ProjGrundstueckPos_von"
      });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie2.LFP2", "LFP2");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie2.LFP2", new String[]{   "NBIdent"
      ,"Nummer"
      ,"Geometrie"
      ,"HoeheGeom"
      ,"LageGen"
      ,"LageZuv"
      ,"HoeheGen"
      ,"HoeheZuv"
      ,"Begehbarkeit"
      ,"Punktzeichen"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie2.HFP2PosHFP2Pos_von", "HFP2PosHFP2Pos_von");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie2.HFP2PosHFP2Pos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.Einzelpunkt", "Einzelobjekte.Einzelpunkt");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.Einzelpunkt", new String[]{   "Identifikator"
      ,"Geometrie"
      ,"LageGen"
      ,"LageZuv"
      ,"ExaktDefiniert"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.Gemeindegrenzen.Hoheitsgrenzpunkt", "Hoheitsgrenzpunkt");
    mapping.defineClass("DM01AVCH24LV95D.Gemeindegrenzen.Hoheitsgrenzpunkt", new String[]{   "Identifikator"
      ,"Geometrie"
      ,"LageGen"
      ,"LageZuv"
      ,"Punktzeichen"
      ,"Hoheitsgrenzstein"
      ,"ExaktDefiniert"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen.LokalisationEntstehung", "LokalisationEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.Gebaeudeadressen.LokalisationEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Planrahmen.KoordinatenanschriftPosKoordinatenanschriftPos_von", "KoordinatenanschriftPosKoordinatenanschriftPos_von");
    mapping.defineClass("DM01AVCH24LV95D.Planrahmen.KoordinatenanschriftPosKoordinatenanschriftPos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.Bergwerk", "Bergwerk");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.Bergwerk", new String[]{   "NummerTeilGrundstueck"
      ,"Geometrie"
      ,"Flaechenmass"
      ,"Bergwerk_von"
      });
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen.StrassenstueckStrassenstueck_von", "StrassenstueckStrassenstueck_von");
    mapping.defineClass("DM01AVCH24LV95D.Gebaeudeadressen.StrassenstueckStrassenstueck_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.LSNachfuehrung", "LSNachfuehrung");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.LSNachfuehrung", new String[]{   "NBIdent"
      ,"Identifikator"
      ,"Beschreibung"
      ,"Perimeter"
      ,"Gueltigkeit"
      ,"GueltigerEintrag"
      ,"GBEintrag"
      ,"Datum1"
      ,"Datum2"
      });
    nameMap.put("DM01AVCH24LV95D.Nummerierungsbereiche.NBGeometrieNBGeometrie_von", "NBGeometrieNBGeometrie_von");
    mapping.defineClass("DM01AVCH24LV95D.Nummerierungsbereiche.NBGeometrieNBGeometrie_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.ObjektnamePos", "Bodenbedeckung.ObjektnamePos");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.ObjektnamePos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Groesse"
      ,"ObjektnamePos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Planrahmen.Koordinatenanschrift", "Koordinatenanschrift");
    mapping.defineClass("DM01AVCH24LV95D.Planrahmen.Koordinatenanschrift", new String[]{   "Beschriftung"
      ,"Koordinatenanschrift_von"
      });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie3.HFP3Nachfuehrung", "HFP3Nachfuehrung");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie3.HFP3Nachfuehrung", new String[]{   "NBIdent"
      ,"Identifikator"
      ,"Beschreibung"
      ,"Perimeter"
      ,"GueltigerEintrag"
      ,"Datum1"
      });
    nameMap.put("DM01AVCH24LV95D.Nomenklatur.OrtsnamePosOrtsnamePos_von", "OrtsnamePosOrtsnamePos_von");
    mapping.defineClass("DM01AVCH24LV95D.Nomenklatur.OrtsnamePosOrtsnamePos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie2.HFP2Pos", "HFP2Pos");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie2.HFP2Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"HFP2Pos_von"
      });
    nameMap.put("DM01AVCH24LV95D.PLZOrtschaft.PLZ6PLZ6_von", "PLZ6PLZ6_von");
    mapping.defineClass("DM01AVCH24LV95D.PLZOrtschaft.PLZ6PLZ6_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie2.LFP2Nachfuehrung", "LFP2Nachfuehrung");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie2.LFP2Nachfuehrung", new String[]{   "NBIdent"
      ,"Identifikator"
      ,"Beschreibung"
      ,"Perimeter"
      ,"GueltigerEintrag"
      ,"Datum1"
      });
    nameMap.put("DM01AVCH24LV95D.Rohrleitungen.Signalpunkt", "Signalpunkt");
    mapping.defineClass("DM01AVCH24LV95D.Rohrleitungen.Signalpunkt", new String[]{   "Nummer"
      ,"Betreiber"
      ,"Geometrie"
      ,"Qualitaet"
      ,"Art"
      ,"Punktart"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie3.HFP3PosHFP3Pos_von", "HFP3PosHFP3Pos_von");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie3.HFP3PosHFP3Pos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.ProjGebaeudenummerPosProjGebaeudenummerPos_von", "ProjGebaeudenummerPosProjGebaeudenummerPos_von");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.ProjGebaeudenummerPosProjGebaeudenummerPos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Nomenklatur.OrtsnamePos", "OrtsnamePos");
    mapping.defineClass("DM01AVCH24LV95D.Nomenklatur.OrtsnamePos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Groesse"
      ,"Stil"
      ,"OrtsnamePos_von"
      });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie1.HFP1", "HFP1");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie1.HFP1", new String[]{   "NBIdent"
      ,"Nummer"
      ,"Geometrie"
      ,"HoeheGeom"
      ,"LageGen"
      ,"LageZuv"
      ,"HoeheGen"
      ,"HoeheZuv"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.Rohrleitungen.SignalpunktPos", "SignalpunktPos");
    mapping.defineClass("DM01AVCH24LV95D.Rohrleitungen.SignalpunktPos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"SignalpunktPos_von"
      });
    nameMap.put("DM01AVCH24LV95D.PLZOrtschaft.OSNachfuehrung", "OSNachfuehrung");
    mapping.defineClass("DM01AVCH24LV95D.PLZOrtschaft.OSNachfuehrung", new String[]{   "NBIdent"
      ,"Identifikator"
      ,"Beschreibung"
      ,"Perimeter"
      ,"Gueltigkeit"
      ,"GueltigerEintrag"
      });
    nameMap.put("DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsName", "OrtschaftsName");
    mapping.defineClass("DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsName", new String[]{   "Text"
      ,"KurzText"
      ,"IndexText"
      ,"Sprache"
      ,"OrtschaftsName_von"
      });
    nameMap.put("DM01AVCH24LV95D.Hoehen.Aussparung", "Aussparung");
    mapping.defineClass("DM01AVCH24LV95D.Hoehen.Aussparung", new String[]{   "Geometrie"
      ,"Qualitaet"
      ,"Art"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.PLZOrtschaft.OrtschaftOrtschaft_von", "OrtschaftOrtschaft_von");
    mapping.defineClass("DM01AVCH24LV95D.PLZOrtschaft.OrtschaftOrtschaft_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Nummerierungsbereiche.NummerierungsbereichPosNummerierungsbereichPos_von", "NummerierungsbereichPosNummerierungsbereichPos_von");
    mapping.defineClass("DM01AVCH24LV95D.Nummerierungsbereiche.NummerierungsbereichPosNummerierungsbereichPos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Planeinteilungen.PlanPosPlanPos_von", "PlanPosPlanPos_von");
    mapping.defineClass("DM01AVCH24LV95D.Planeinteilungen.PlanPosPlanPos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie1.LFP1Symbol", "LFP1Symbol");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie1.LFP1Symbol", new String[]{   "Ori"
      ,"LFP1Symbol_von"
      });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.Gebaeudenummer", "Gebaeudenummer");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.Gebaeudenummer", new String[]{   "Nummer"
      ,"GWR_EGID"
      ,"Gebaeudenummer_von"
      });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie1.LFP1Pos", "LFP1Pos");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie1.LFP1Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"LFP1Pos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.EinzelpunktPosEinzelpunktPos_von", "Bodenbedeckung.EinzelpunktPosEinzelpunktPos_von");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.EinzelpunktPosEinzelpunktPos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Nummerierungsbereiche.NBGeometrie", "NBGeometrie");
    mapping.defineClass("DM01AVCH24LV95D.Nummerierungsbereiche.NBGeometrie", new String[]{   "Geometrie"
      ,"NBGeometrie_von"
      });
    nameMap.put("DM01AVCH24LV95D.Planrahmen.NetzkreuzNetzkreuz_von", "NetzkreuzNetzkreuz_von");
    mapping.defineClass("DM01AVCH24LV95D.Planrahmen.NetzkreuzNetzkreuz_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie3.LFP3Nachfuehrung", "LFP3Nachfuehrung");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie3.LFP3Nachfuehrung", new String[]{   "NBIdent"
      ,"Identifikator"
      ,"Beschreibung"
      ,"Perimeter"
      ,"GueltigerEintrag"
      ,"Datum1"
      });
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen.LokalisationsNameBenannte", "LokalisationsNameBenannte");
    mapping.defineClass("DM01AVCH24LV95D.Gebaeudeadressen.LokalisationsNameBenannte", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.GrundstueckEntstehung", "GrundstueckEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.GrundstueckEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeeingangEntstehung", "GebaeudeeingangEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.Gebaeudeadressen.GebaeudeeingangEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie3.LFP3Pos", "LFP3Pos");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie3.LFP3Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"LFP3Pos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Gebaeudeadressen.HausnummerPosHausnummerPos_von", "HausnummerPosHausnummerPos_von");
    mapping.defineClass("DM01AVCH24LV95D.Gebaeudeadressen.HausnummerPosHausnummerPos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.BoFlaecheEntstehung", "BoFlaecheEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.BoFlaecheEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.ProjSelbstRechtProjSelbstRecht_von", "ProjSelbstRechtProjSelbstRecht_von");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.ProjSelbstRechtProjSelbstRecht_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.Einzelpunkt", "Bodenbedeckung.Einzelpunkt");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.Einzelpunkt", new String[]{   "Identifikator"
      ,"Geometrie"
      ,"LageGen"
      ,"LageZuv"
      ,"ExaktDefiniert"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.ProjLiegenschaft", "ProjLiegenschaft");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.ProjLiegenschaft", new String[]{   "NummerTeilGrundstueck"
      ,"Geometrie"
      ,"Flaechenmass"
      ,"ProjLiegenschaft_von"
      });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.LinienelementSymbolLinienelementSymbol_von", "LinienelementSymbolLinienelementSymbol_von");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.LinienelementSymbolLinienelementSymbol_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Gemeindegrenzen.HoheitsgrenzpunktSymbolHoheitsgrenzpunktSymbol_von", "HoheitsgrenzpunktSymbolHoheitsgrenzpunktSymbol_von");
    mapping.defineClass("DM01AVCH24LV95D.Gemeindegrenzen.HoheitsgrenzpunktSymbolHoheitsgrenzpunktSymbol_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Rohrleitungen.Punktelement", "Rohrleitungen.Punktelement");
    mapping.defineClass("DM01AVCH24LV95D.Rohrleitungen.Punktelement", new String[]{   "Geometrie"
      ,"HoeheGeom"
      ,"Ori"
      ,"Punktelement_von"
      });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.ProjObjektname", "ProjObjektname");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.ProjObjektname", new String[]{   "Name"
      ,"ProjObjektname_von"
      });
    nameMap.put("DM01AVCH24LV95D.Hoehen.GelaendekanteEntstehung", "GelaendekanteEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.Hoehen.GelaendekanteEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.EinzelpunktEntstehung", "Einzelobjekte.EinzelpunktEntstehung");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.EinzelpunktEntstehung", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsName_Pos", "OrtschaftsName_Pos");
    mapping.defineClass("DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsName_Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Groesse"
      ,"OrtschaftsName_Pos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Nummerierungsbereiche.NummerierungsbereichPos", "NummerierungsbereichPos");
    mapping.defineClass("DM01AVCH24LV95D.Nummerierungsbereiche.NummerierungsbereichPos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Groesse"
      ,"NummerierungsbereichPos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Planeinteilungen.PlanPos", "PlanPos");
    mapping.defineClass("DM01AVCH24LV95D.Planeinteilungen.PlanPos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Groesse"
      ,"PlanPos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Planrahmen.PlanLayoutSymbolPlanLayoutSymbol_von", "PlanLayoutSymbolPlanLayoutSymbol_von");
    mapping.defineClass("DM01AVCH24LV95D.Planrahmen.PlanLayoutSymbolPlanLayoutSymbol_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.Flaechenelement", "Einzelobjekte.Flaechenelement");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.Flaechenelement", new String[]{   "Geometrie"
      ,"Flaechenelement_von"
      });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie1.LFP1", "LFP1");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie1.LFP1", new String[]{   "NBIdent"
      ,"Nummer"
      ,"Geometrie"
      ,"HoeheGeom"
      ,"LageGen"
      ,"LageZuv"
      ,"HoeheGen"
      ,"HoeheZuv"
      ,"Begehbarkeit"
      ,"Punktzeichen"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.BoFlaecheSymbolBoFlaecheSymbol_von", "BoFlaecheSymbolBoFlaecheSymbol_von");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.BoFlaecheSymbolBoFlaecheSymbol_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.ObjektnamePos", "Einzelobjekte.ObjektnamePos");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.ObjektnamePos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Groesse"
      ,"ObjektnamePos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Rohrleitungen.LineAttrib7", "LineAttrib7");
    mapping.defineClass("DM01AVCH24LV95D.Rohrleitungen.LineAttrib7", new String[]{   "Linienart"
      });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie1.HFP1PosHFP1Pos_von", "HFP1PosHFP1Pos_von");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie1.HFP1PosHFP1Pos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.TSEinteilung.ToleranzstufePos", "ToleranzstufePos");
    mapping.defineClass("DM01AVCH24LV95D.TSEinteilung.ToleranzstufePos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Groesse"
      ,"ToleranzstufePos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.ObjektnamePosObjektnamePos_von", "Einzelobjekte.ObjektnamePosObjektnamePos_von");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.ObjektnamePosObjektnamePos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.BBNachfuehrung", "BBNachfuehrung");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.BBNachfuehrung", new String[]{   "NBIdent"
      ,"Identifikator"
      ,"Beschreibung"
      ,"Perimeter"
      ,"Gueltigkeit"
      ,"GueltigerEintrag"
      ,"Datum1"
      });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.ProjGebaeudenummerPos", "ProjGebaeudenummerPos");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.ProjGebaeudenummerPos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"Groesse"
      ,"ProjGebaeudenummerPos_von"
      });
    nameMap.put("DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsName_PosOrtschaftsName_Pos_von", "OrtschaftsName_PosOrtschaftsName_Pos_von");
    mapping.defineClass("DM01AVCH24LV95D.PLZOrtschaft.OrtschaftsName_PosOrtschaftsName_Pos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Liegenschaften.ProjBergwerkProjBergwerk_von", "ProjBergwerkProjBergwerk_von");
    mapping.defineClass("DM01AVCH24LV95D.Liegenschaften.ProjBergwerkProjBergwerk_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.LinienelementSymbol", "LinienelementSymbol");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.LinienelementSymbol", new String[]{   "Pos"
      ,"Ori"
      ,"LinienelementSymbol_von"
      });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie3.LFP3Symbol", "LFP3Symbol");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie3.LFP3Symbol", new String[]{   "Ori"
      ,"LFP3Symbol_von"
      });
    nameMap.put("DM01AVCH24LV95D.Nomenklatur.GelaendenamePosGelaendenamePos_von", "GelaendenamePosGelaendenamePos_von");
    mapping.defineClass("DM01AVCH24LV95D.Nomenklatur.GelaendenamePosGelaendenamePos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie3.LFP3SymbolLFP3Symbol_von", "LFP3SymbolLFP3Symbol_von");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie3.LFP3SymbolLFP3Symbol_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Rohrleitungen.Einzelpunkt", "Rohrleitungen.Einzelpunkt");
    mapping.defineClass("DM01AVCH24LV95D.Rohrleitungen.Einzelpunkt", new String[]{   "Identifikator"
      ,"Geometrie"
      ,"LageGen"
      ,"LageZuv"
      ,"ExaktDefiniert"
      ,"Entstehung"
      });
    nameMap.put("DM01AVCH24LV95D.Rohrleitungen.Flaechenelement", "Rohrleitungen.Flaechenelement");
    mapping.defineClass("DM01AVCH24LV95D.Rohrleitungen.Flaechenelement", new String[]{   "Geometrie"
      ,"Flaechenelement_von"
      });
    nameMap.put("DM01AVCH24LV95D.Gemeindegrenzen.LineAttrib8", "LineAttrib8");
    mapping.defineClass("DM01AVCH24LV95D.Gemeindegrenzen.LineAttrib8", new String[]{   "Linienart"
      });
    nameMap.put("DM01AVCH24LV95D.Bodenbedeckung.ProjGebaeudenummer", "ProjGebaeudenummer");
    mapping.defineClass("DM01AVCH24LV95D.Bodenbedeckung.ProjGebaeudenummer", new String[]{   "Nummer"
      ,"GWR_EGID"
      ,"ProjGebaeudenummer_von"
      });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.LinienelementLinienelement_von", "Einzelobjekte.LinienelementLinienelement_von");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.LinienelementLinienelement_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie2.LFP2Pos", "LFP2Pos");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie2.LFP2Pos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"LFP2Pos_von"
      });
    nameMap.put("DM01AVCH24LV95D.PLZOrtschaft.Ortschaft", "Ortschaft");
    mapping.defineClass("DM01AVCH24LV95D.PLZOrtschaft.Ortschaft", new String[]{   "Status"
      ,"InAenderung"
      ,"Flaeche"
      ,"Entstehung"
      ,"Ortschaft_von"
      });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.FlaechenelementFlaechenelement_von", "Einzelobjekte.FlaechenelementFlaechenelement_von");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.FlaechenelementFlaechenelement_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.FixpunkteKategorie2.LFP2PosLFP2Pos_von", "LFP2PosLFP2Pos_von");
    mapping.defineClass("DM01AVCH24LV95D.FixpunkteKategorie2.LFP2PosLFP2Pos_von", new String[]{  });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.Linienelement", "Einzelobjekte.Linienelement");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.Linienelement", new String[]{   "Geometrie"
      ,"Linienelement_von"
      });
    nameMap.put("DM01AVCH24LV95D.Einzelobjekte.EinzelpunktPos", "Einzelobjekte.EinzelpunktPos");
    mapping.defineClass("DM01AVCH24LV95D.Einzelobjekte.EinzelpunktPos", new String[]{   "Pos"
      ,"Ori"
      ,"HAli"
      ,"VAli"
      ,"EinzelpunktPos_von"
      });
    nameMap.put("DM01AVCH24LV95D.Planrahmen.PlanbeschriftungPosPlanbeschriftungPos_von", "PlanbeschriftungPosPlanbeschriftungPos_von");
    mapping.defineClass("DM01AVCH24LV95D.Planrahmen.PlanbeschriftungPosPlanbeschriftungPos_von", new String[]{  });
    mapping.setXtf24nameMapping(nameMap);
    return mapping;
  }
}
