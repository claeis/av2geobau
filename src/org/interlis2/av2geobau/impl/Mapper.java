package org.interlis2.av2geobau.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import ch.interlis.iom.IomObject;
import ch.interlis.iom_j.Iom_jObject;
import ch.interlis.iox.IoxEvent;
import ch.interlis.iox.ObjectEvent;
import ch.interlis.models.DM01AVCH24LV95D.Status_GA;
import ch.interlis.models.DM01AVCH24LV95D.Versicherungsart;
import ch.interlis.models.DM01AVCH24LV95D.Bezirksgrenzen.Bezirksgrenzabschnitt;
import ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.BBArt;
import ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.BoFlaeche;
import ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.ProjBoFlaeche;
import ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.EOArt;
import ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie1.HFP1;
import ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie1.HFP1Pos;
import ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie1.LFP1;
import ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie1.LFP1Pos;
import ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie1.LFP1_Begehbarkeit;
import ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie2.HFP2;
import ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie2.HFP2Pos;
import ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie2.LFP2;
import ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie2.LFP2Pos;
import ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie2.LFP2_Begehbarkeit;
import ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie3.HFP3;
import ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie3.HFP3Pos;
import ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie3.LFP3;
import ch.interlis.models.DM01AVCH24LV95D.FixpunkteKategorie3.LFP3Pos;
import ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen.Gebaeudeeingang;
import ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen.HausnummerPos;
import ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen.LokalisationsName;
import ch.interlis.models.DM01AVCH24LV95D.Gebaeudeadressen.LokalisationsNamePos;
import ch.interlis.models.DM01AVCH24LV95D.Gemeindegrenzen.Gemeindegrenze;
import ch.interlis.models.DM01AVCH24LV95D.Gemeindegrenzen.Hoheitsgrenzpunkt;
import ch.interlis.models.DM01AVCH24LV95D.Kantonsgrenzen.Kantonsgrenzabschnitt;
import ch.interlis.models.DM01AVCH24LV95D.Landesgrenzen.Landesgrenzabschnitt;
import ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.Grenzpunkt;
import ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.Grundstueck;
import ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.GrundstueckPos;
import ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.Grundstuecksart;
import ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.Liegenschaft;
import ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.ProjGrundstueck;
import ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.ProjGrundstueckPos;
import ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.ProjLiegenschaft;
import ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.ProjSelbstRecht;
import ch.interlis.models.DM01AVCH24LV95D.Liegenschaften.SelbstRecht;
import ch.interlis.models.DM01AVCH24LV95D.Nomenklatur.Flurname;
import ch.interlis.models.DM01AVCH24LV95D.Nomenklatur.FlurnamePos;
import ch.interlis.models.DM01AVCH24LV95D.Nomenklatur.Gelaendename;
import ch.interlis.models.DM01AVCH24LV95D.Nomenklatur.GelaendenamePos;
import ch.interlis.models.DM01AVCH24LV95D.Nomenklatur.Ortsname;
import ch.interlis.models.DM01AVCH24LV95D.Nomenklatur.OrtsnamePos;
import ch.interlis.models.INTERLIS.HALIGNMENT;
import ch.interlis.models.INTERLIS.VALIGNMENT;

public class Mapper {

    List<IomObject> out=new ArrayList<IomObject>();
    public void addInput(IoxEvent event) {
        if(event instanceof ObjectEvent) {
            IomObject iomObj=((ObjectEvent) event).getIomObject();
            String type=iomObj.getobjecttag();
            if(type.equals(LFP1.tag)) {
                mapLFP1(iomObj);
            }else  if(type.equals(LFP1Pos.tag)) {
                mapLFP1Pos(iomObj);
            }else  if(type.equals(LFP2.tag)) {
                mapLFP2(iomObj);
            }else  if(type.equals(LFP2Pos.tag)) {
                mapLFP2Pos(iomObj);
            }else  if(type.equals(LFP3.tag)) {
                mapLFP3(iomObj);
            }else  if(type.equals(LFP3Pos.tag)) {
                mapLFP3Pos(iomObj);
            }else  if(type.equals(HFP1.tag)) {
                mapHFP1(iomObj);
            }else  if(type.equals(HFP1Pos.tag)) {
                mapHFP1Pos(iomObj);
            }else  if(type.equals(HFP2.tag)) {
                mapHFP2(iomObj);
            }else  if(type.equals(HFP2Pos.tag)) {
                mapHFP2Pos(iomObj);
            }else  if(type.equals(HFP3.tag)) {
                mapHFP3(iomObj);
            }else  if(type.equals(HFP3Pos.tag)) {
                mapHFP3Pos(iomObj);
            }else  if(type.equals(ProjBoFlaeche.tag)) {
                mapProjBoFlaeche(iomObj);
            }else  if(type.equals(BoFlaeche.tag)) {
                mapBoFlaeche(iomObj);
            }else  if(type.equals(ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.Objektname.tag)) {
                mapBoFlaecheObjektname(iomObj);
            }else  if(type.equals(ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.ObjektnamePos.tag)){
                mapBoFlaecheObjektnamePos(iomObj);
            }else  if(type.equals(ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.Einzelobjekt.tag)) {
                mapEinzelobjekt(iomObj);
            }else  if(type.equals(ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.Flaechenelement.tag)) {
                mapEOFlaechenelement(iomObj);
            }else  if(type.equals(ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.Linienelement.tag)) {
                mapEOLinienelement(iomObj);
            }else  if(type.equals(ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.Objektname.tag)) {
                mapEOObjektname(iomObj);
            }else  if(type.equals(ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.ObjektnamePos.tag)){
                mapEOObjektnamePos(iomObj);
            }else  if(type.equals(Flurname.tag)) {
                mapFlurname(iomObj);
            }else  if(type.equals(FlurnamePos.tag)) {
                mapFlurnamePos(iomObj);
            }else  if(type.equals(Ortsname.tag)) {
                mapOrtsname(iomObj);
            }else  if(type.equals(OrtsnamePos.tag)) {
                mapOrtsnamePos(iomObj);
            }else  if(type.equals(Gelaendename.tag)) {
                mapGelaendename(iomObj);
            }else  if(type.equals(GelaendenamePos.tag)) {
                mapGelaendenamePos(iomObj);
            }else  if(type.equals(Grenzpunkt.tag)) {
                mapGrenzpunkt(iomObj);
            }else  if(type.equals(ProjGrundstueck.tag)) {
                mapProjGrundstueck(iomObj);
            }else  if(type.equals(ProjGrundstueckPos.tag)) {
                mapProjGrundstueckPos(iomObj);
            }else  if(type.equals(ProjLiegenschaft.tag)) {
                mapProjLiegenschaft(iomObj);
            }else  if(type.equals(ProjSelbstRecht.tag)) {
                mapProjSelbstRecht(iomObj);
            }else  if(type.equals(Grundstueck.tag)) {
                mapGrundstueck(iomObj);
            }else  if(type.equals(GrundstueckPos.tag)) {
                mapGrundstueckPos(iomObj);
            }else  if(type.equals(Liegenschaft.tag)) {
                mapLiegenschaft(iomObj);
            }else  if(type.equals(SelbstRecht.tag)) {
                mapSelbstRecht(iomObj);
            }else  if(type.equals(ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen.Linienelement.tag)) {
                mapRLLinienelement(iomObj);
            }else  if(type.equals(Hoheitsgrenzpunkt.tag)) {
                mapHoheitsgrenzpunkt(iomObj);
            }else  if(type.equals(Gemeindegrenze.tag)) {
                mapGemeindegrenze(iomObj);
            }else if(type.equals(Bezirksgrenzabschnitt.tag)) {
                mapBezirksgrenzabschnitt(iomObj);
            }else if(type.equals(Kantonsgrenzabschnitt.tag)) {
                mapKantonsgrenzabschnitt(iomObj);
            }else if(type.equals(Landesgrenzabschnitt.tag)) {
                mapLandesgrenzabschnitt(iomObj);
            }else if(type.equals(LokalisationsName.tag)) {
                mapLokalisationsName(iomObj);
            }else if(type.equals(LokalisationsNamePos.tag)) {
                mapLokalisationsNamePos(iomObj);
            }else if(type.equals(Gebaeudeeingang.tag)) {
                mapGebaeudeeingang(iomObj);
            }else if(type.equals(HausnummerPos.tag)) {
                mapHausnummerPos(iomObj);
            }
        }
    }
    public void close() {
    }

    public IomObject getMappedObject() {
        if(out.size()==0) {
            return null;
        }
        IomObject ret=out.remove(0);
        return ret;
    }




    private String mapOri(String ori) {
        if(ori==null) {
            return null;
        }
        double val=Double.parseDouble(ori);
        ori=Double.toString((100.0-val)*0.9);
        return ori;
    }
    private String mapVali(String vali) {
        if(vali==null) {
            return null;
        }
        if(vali.equals(VALIGNMENT.tag_Top)) {
            return "3";
        }else if(vali.equals(VALIGNMENT.tag_Cap)) {
            return "3";
        }else if(vali.equals(VALIGNMENT.tag_Half)) {
            return "2";
        }else if(vali.equals(VALIGNMENT.tag_Base)) {
            return "1";
        }else if(vali.equals(VALIGNMENT.tag_Bottom)) {
            return "0";
        }
        return null;
    }
    private String mapHali(String hali) {
        if(hali==null) {
            return null;
        }
        if(hali.equals(HALIGNMENT.tag_Left)) {
            return "0";
        }else if(hali.equals(HALIGNMENT.tag_Center)) {
            return "1";
        }else if(hali.equals(HALIGNMENT.tag_Right)) {
            return "2";
        }
        return null;
    }
    
    private HashMap<String,String> lfp1_tid2nummer=new HashMap<String,String>();
    private void mapLFP1(IomObject iomObj) {
        /*
            LFP1 begehbar 01111
            LFP1 nicht begehbar 01112
         */
        String begehbarkeit=iomObj.getattrvalue(LFP1.tag_Begehbarkeit);
        String block=null;
        String layer=null;
        if(begehbarkeit.equals(LFP1_Begehbarkeit.tag_begehbar)) {
            block="LFP1";
            layer="01111";
        }else if(begehbarkeit.equals(LFP1_Begehbarkeit.tag_nicht_begehbar)) {
            block="LFP1";
            layer="01112";
        }else {
            return;
        }
        String tid=iomObj.getobjectoid();
        String nummer=iomObj.getattrvalue(LFP1.tag_Nummer);
        lfp1_tid2nummer.put(tid, nummer);
        IomObject geom=iomObj.getattrobj(LFP1.tag_Geometrie,0);
        String z=iomObj.getattrvalue(LFP1.tag_HoeheGeom);
        if(z!=null) {
            geom.setattrvalue("C3", z);
        }
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_BLOCKINSERT,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_BLOCK, block);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        out.add(dxfObj);
    }
    private void mapLFP1Pos(IomObject iomObj) {
        IomObject refObj=iomObj.getattrobj(LFP1Pos.tag_LFP1Pos_von, 0);
        String ref=refObj.getobjectrefoid();
        String nummer=lfp1_tid2nummer.get(ref);
        String layer="01119";
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_TEXT,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT, nummer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT_SIZE,"1.35");
        IomObject geom=iomObj.getattrobj(LFP1Pos.tag_Pos,0);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        String ori=mapOri(iomObj.getattrvalue(LFP1Pos.tag_Ori));
        if(ori!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_ORI, ori);
        }
        String hali=mapHali(iomObj.getattrvalue(LFP1Pos.tag_HAli));
        if(hali!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_HALI, hali);
        }
        String vali=mapVali(iomObj.getattrvalue(LFP1Pos.tag_VAli));
        if(vali!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_VALI, vali);
        }
        out.add(dxfObj);
        
    }
    private HashMap<String,String> lfp2_tid2nummer=new HashMap<String,String>();
    private void mapLFP2(IomObject iomObj) {
        /*
        LFP2 begehbar 01121
        LFP2 nicht begehbar 01122
         */
    String begehbarkeit=iomObj.getattrvalue(LFP2.tag_Begehbarkeit);
    String block=null;
    String layer=null;
    if(begehbarkeit.equals(LFP2_Begehbarkeit.tag_begehbar)) {
        block="LFP2";
        layer="01121";
    }else if(begehbarkeit.equals(LFP2_Begehbarkeit.tag_nicht_begehbar)) {
        block="LFP2";
        layer="01122";
    }else {
        return;
    }
    String tid=iomObj.getobjectoid();
    String nummer=iomObj.getattrvalue(LFP2.tag_Nummer);
    lfp2_tid2nummer.put(tid, nummer);
    IomObject geom=iomObj.getattrobj(LFP2.tag_Geometrie,0);
    String z=iomObj.getattrvalue(LFP2.tag_HoeheGeom);
    if(z!=null) {
        geom.setattrvalue("C3", z);
    }
    IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_BLOCKINSERT,null);
    dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
    dxfObj.setattrvalue(DxfWriter.IOM_ATTR_BLOCK, block);
    dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
    out.add(dxfObj);
    }
    private void mapLFP2Pos(IomObject iomObj) {
        IomObject refObj=iomObj.getattrobj(LFP2Pos.tag_LFP2Pos_von, 0);
        String ref=refObj.getobjectrefoid();
        String nummer=lfp2_tid2nummer.get(ref);
        String layer="01129";
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_TEXT,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT, nummer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT_SIZE,"1.35");
        IomObject geom=iomObj.getattrobj(LFP2Pos.tag_Pos,0);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        String ori=mapOri(iomObj.getattrvalue(LFP2Pos.tag_Ori));
        if(ori!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_ORI, ori);
        }
        String hali=mapHali(iomObj.getattrvalue(LFP2Pos.tag_HAli));
        if(hali!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_HALI, hali);
        }
        String vali=mapVali(iomObj.getattrvalue(LFP2Pos.tag_VAli));
        if(vali!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_VALI, vali);
        }
        out.add(dxfObj);
        
    }
    private HashMap<String,String> lfp3_tid2nummer=new HashMap<String,String>();
    private void mapLFP3(IomObject iomObj) {
        /*
        LFP3 Stein 01131
        LFP3 Bolzen 01132
        LFP3 Kreuz 01133
        LFP3 unversichert 01134
        LFP3 Nummer 01139
         */
        String punktzeichen=iomObj.getattrvalue(LFP3.tag_Punktzeichen);
        String block=null;
        String layer=null;
        if(punktzeichen.equals(Versicherungsart.tag_Stein) || punktzeichen.equals(Versicherungsart.tag_Kunststoffzeichen)) {
            block="LFP3ST";
            layer="01131";
        }else if(punktzeichen.equals(Versicherungsart.tag_Bolzen) || punktzeichen.equals(Versicherungsart.tag_Rohr)) {
            block="LFP3BO";
            layer="01132";
        }else if(punktzeichen.equals(Versicherungsart.tag_Kreuz)) {
            block="LFP3KR";
            layer="01133";
        }else if(punktzeichen.equals(Versicherungsart.tag_unversichert) || punktzeichen.equals(Versicherungsart.tag_Pfahl)) {
            block="LFP3UV";
            layer="01134";
        }else {
            return;
        }
        String tid=iomObj.getobjectoid();
        String nummer=iomObj.getattrvalue(LFP3.tag_Nummer);
        lfp3_tid2nummer.put(tid, nummer);
        IomObject geom=iomObj.getattrobj(LFP3.tag_Geometrie,0);
        String z=iomObj.getattrvalue(LFP3.tag_HoeheGeom);
        if(z!=null) {
            geom.setattrvalue("C3", z);
        }
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_BLOCKINSERT,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_BLOCK, block);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        out.add(dxfObj);
    }
    private void mapLFP3Pos(IomObject iomObj) {
        IomObject refObj=iomObj.getattrobj(LFP3Pos.tag_LFP3Pos_von, 0);
        String ref=refObj.getobjectrefoid();
        String nummer=lfp3_tid2nummer.get(ref);
        String layer="01139";
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_TEXT,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT, nummer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT_SIZE,"1.35");
        IomObject geom=iomObj.getattrobj(LFP3Pos.tag_Pos,0);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        String ori=mapOri(iomObj.getattrvalue(LFP3Pos.tag_Ori));
        if(ori!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_ORI, ori);
        }
        String hali=mapHali(iomObj.getattrvalue(LFP3Pos.tag_HAli));
        if(hali!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_HALI, hali);
        }
        String vali=mapVali(iomObj.getattrvalue(LFP3Pos.tag_VAli));
        if(vali!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_VALI, vali);
        }
        out.add(dxfObj);
    }

    private HashMap<String,String> hfp1_tid2nummer=new HashMap<String,String>();
    private void mapHFP1(IomObject iomObj) {
        String block=null;
        String layer=null;
        block="HFP1";
        layer="01141";
        String tid=iomObj.getobjectoid();
        String nummer=iomObj.getattrvalue(HFP1.tag_Nummer);
        hfp1_tid2nummer.put(tid, nummer);
        IomObject geom=iomObj.getattrobj(HFP1.tag_Geometrie,0);
        String z=iomObj.getattrvalue(HFP1.tag_HoeheGeom);
        if(z!=null) {
            geom.setattrvalue("C3", z);
        }
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_BLOCKINSERT,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_BLOCK, block);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        out.add(dxfObj);
    }
    private void mapHFP1Pos(IomObject iomObj) {
        IomObject refObj=iomObj.getattrobj(HFP1Pos.tag_HFP1Pos_von, 0);
        String ref=refObj.getobjectrefoid();
        String nummer=hfp1_tid2nummer.get(ref);
        String layer="01149";
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_TEXT,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT, nummer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT_SIZE,"1.35");
        IomObject geom=iomObj.getattrobj(HFP1Pos.tag_Pos,0);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        String ori=mapOri(iomObj.getattrvalue(HFP1Pos.tag_Ori));
        if(ori!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_ORI, ori);
        }
        String hali=mapHali(iomObj.getattrvalue(HFP1Pos.tag_HAli));
        if(hali!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_HALI, hali);
        }
        String vali=mapVali(iomObj.getattrvalue(HFP1Pos.tag_VAli));
        if(vali!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_VALI, vali);
        }
        out.add(dxfObj);
    }
    private HashMap<String,String> hfp2_tid2nummer=new HashMap<String,String>();
    private void mapHFP2(IomObject iomObj) {
        String block=null;
        String layer=null;
        block="HFP2";
        layer="01151";
        String tid=iomObj.getobjectoid();
        String nummer=iomObj.getattrvalue(HFP2.tag_Nummer);
        hfp2_tid2nummer.put(tid, nummer);
        IomObject geom=iomObj.getattrobj(HFP2.tag_Geometrie,0);
        String z=iomObj.getattrvalue(HFP2.tag_HoeheGeom);
        if(z!=null) {
            geom.setattrvalue("C3", z);
        }
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_BLOCKINSERT,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_BLOCK, block);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        out.add(dxfObj);
    }
    private void mapHFP2Pos(IomObject iomObj) {
        IomObject refObj=iomObj.getattrobj(HFP2Pos.tag_HFP2Pos_von, 0);
        String ref=refObj.getobjectrefoid();
        String nummer=hfp2_tid2nummer.get(ref);
        String layer="01159";
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_TEXT,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT, nummer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT_SIZE,"1.35");
        IomObject geom=iomObj.getattrobj(HFP2Pos.tag_Pos,0);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        String ori=mapOri(iomObj.getattrvalue(HFP2Pos.tag_Ori));
        if(ori!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_ORI, ori);
        }
        String hali=mapHali(iomObj.getattrvalue(HFP2Pos.tag_HAli));
        if(hali!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_HALI, hali);
        }
        String vali=mapVali(iomObj.getattrvalue(HFP2Pos.tag_VAli));
        if(vali!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_VALI, vali);
        }
        out.add(dxfObj);
    }
    private HashMap<String,String> hfp3_tid2nummer=new HashMap<String,String>();
    private void mapHFP3(IomObject iomObj) {
        String block=null;
        String layer=null;
        block="HFP3";
        layer="01161";
        String tid=iomObj.getobjectoid();
        String nummer=iomObj.getattrvalue(HFP3.tag_Nummer);
        hfp3_tid2nummer.put(tid, nummer);
        IomObject geom=iomObj.getattrobj(HFP3.tag_Geometrie,0);
        String z=iomObj.getattrvalue(HFP3.tag_HoeheGeom);
        if(z!=null) {
            geom.setattrvalue("C3", z);
        }
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_BLOCKINSERT,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_BLOCK, block);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        out.add(dxfObj);
    }
    private void mapHFP3Pos(IomObject iomObj) {
        IomObject refObj=iomObj.getattrobj(HFP3Pos.tag_HFP3Pos_von, 0);
        String ref=refObj.getobjectrefoid();
        String nummer=hfp3_tid2nummer.get(ref);
        String layer="01169";
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_TEXT,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT, nummer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT_SIZE,"1.35");
        IomObject geom=iomObj.getattrobj(HFP3Pos.tag_Pos,0);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        String ori=mapOri(iomObj.getattrvalue(HFP3Pos.tag_Ori));
        if(ori!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_ORI, ori);
        }
        String hali=mapHali(iomObj.getattrvalue(HFP3Pos.tag_HAli));
        if(hali!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_HALI, hali);
        }
        String vali=mapVali(iomObj.getattrvalue(HFP3Pos.tag_VAli));
        if(vali!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_VALI, vali);
        }
        out.add(dxfObj);
    }
    private void mapProjBoFlaeche(IomObject iomObj) {
        String tid=iomObj.getobjectoid();
        String art=iomObj.getattrvalue(ProjBoFlaeche.tag_Art);
        String layer=null;
        if(art.equals(BBArt.tag_Gebaeude)) {
            layer="01911";
            gebaeude.add(tid);
        }else {
            return;
        }
        IomObject geom=iomObj.getattrobj(ProjBoFlaeche.tag_Geometrie,0);
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_POLYGON,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        out.add(dxfObj);
    }
    private HashSet<String> gebaeude=new HashSet<String>();
    private HashSet<String> gewaesser=new HashSet<String>();
    private void mapBoFlaeche(IomObject iomObj) {
        String tid=iomObj.getobjectoid();
        String art=iomObj.getattrvalue(BoFlaeche.tag_Art);
        String layer=null;
        if(art.equals(BBArt.tag_Gebaeude)) {
            layer="01211";
            gebaeude.add(tid);
        }else if(art.equals(BBArt.tag_befestigt_Strasse_Weg)) {
            layer="01221";
        }else if(art.equals(BBArt.tag_befestigt_Bahn)) {
            layer="01222";
        }else if(art.equals(BBArt.tag_befestigt_Flugplatz)) {
            layer="01223";
        }else if(art.equals(BBArt.tag_befestigt_Wasserbecken)) {
            layer="01224";
        }else if(art.equals(BBArt.tag_befestigt_uebrige_befestigte)) {
            layer="01225";
        }else if(art.equals(BBArt.tag_humusiert_Acker_Wiese_Weide)) {
            layer="01231";
        }else if(art.equals(BBArt.tag_humusiert_Intensivkultur_Reben)) {
            layer="01232";
        }else if(art.equals(BBArt.tag_humusiert_Intensivkultur_uebrige_Intensivkultur)) {
            layer="01233";
        }else if(art.equals(BBArt.tag_humusiert_Gartenanlage)) {
            layer="01234";
        }else if(art.equals(BBArt.tag_humusiert_Hoch_Flachmoor)) {
            layer="01235";
        }else if(art.equals(BBArt.tag_humusiert_uebrige_humusierte)) {
            layer="01236";
        }else if(art.equals(BBArt.tag_Gewaesser_fliessendes) || art.equals(BBArt.tag_Gewaesser_stehendes)) {
            layer="01241";
            gewaesser.add(tid);
        }else if(art.equals(BBArt.tag_Gewaesser_Schilfguertel)) {
            layer="01242";
        }else if(art.equals(BBArt.tag_bestockt_geschlossener_Wald)) {
            layer="01251";
        }else if(art.equals(BBArt.tag_bestockt_uebrige_bestockte)) {
            layer="01252";
        }else if(art.equals(BBArt.tag_vegetationslos_Fels)) {
            layer="01261";
        }else if(art.equals(BBArt.tag_vegetationslos_Geroell_Sand)) {
            layer="01263";
        }else if(art.equals(BBArt.tag_vegetationslos_Abbau_Deponie)) {
            layer="01264";
        }else if(art.equals(BBArt.tag_vegetationslos_uebrige_vegetationslose)) {
            layer="01265";
        }else if(art.equals(BBArt.tag_befestigt_Trottoir) || art.equals(BBArt.tag_befestigt_Verkehrsinsel)) {
            layer="01332";
        }else {
            return;
        }
        IomObject geom=iomObj.getattrobj(BoFlaeche.tag_Geometrie,0);
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_POLYGON,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        out.add(dxfObj);
    }
    private HashMap<String,String> gebaeudename=new HashMap<String,String>();
    private HashMap<String,String> gewaessername=new HashMap<String,String>();
    private void mapBoFlaecheObjektname(IomObject iomObj) {
        String tid=iomObj.getobjectoid();
        IomObject refObj=iomObj.getattrobj(ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.Objektname.tag_Objektname_von, 0);
        String ref=refObj.getobjectrefoid();
        
        String name=iomObj.getattrvalue(ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.Objektname.tag_Name);
        if(gebaeude.contains(ref)) {
            gebaeudename.put(tid, name);
        }else if(gewaesser.contains(ref)) {
            gewaessername.put(tid, name);
        }
    }
    private void mapBoFlaecheObjektnamePos(IomObject iomObj) {
        IomObject refObj=iomObj.getattrobj(ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.ObjektnamePos.tag_ObjektnamePos_von, 0);
        String ref=refObj.getobjectrefoid();
        String name=null;
        String layer=null;
        if(gebaeudename.containsKey(ref)) {
            name=gebaeudename.get(ref);
            layer="01219";
        }else if(gewaessername.containsKey(ref)) {
            name=gewaessername.get(ref);
            layer="01249";
        }
        if(layer!=null) {
            IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_TEXT,null);
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT, name);
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT_SIZE,"0.9");
            IomObject geom=iomObj.getattrobj(ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.ObjektnamePos.tag_Pos,0);
            dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
            String ori=mapOri(iomObj.getattrvalue(ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.ObjektnamePos.tag_Ori));
            if(ori!=null) {
                dxfObj.setattrvalue(DxfWriter.IOM_ATTR_ORI, ori);
            }
            String hali=mapHali(iomObj.getattrvalue(ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.ObjektnamePos.tag_HAli));
            if(hali!=null) {
                dxfObj.setattrvalue(DxfWriter.IOM_ATTR_HALI, hali);
            }
            String vali=mapVali(iomObj.getattrvalue(ch.interlis.models.DM01AVCH24LV95D.Bodenbedeckung.ObjektnamePos.tag_VAli));
            if(vali!=null) {
                dxfObj.setattrvalue(DxfWriter.IOM_ATTR_VALI, vali);
            }
            out.add(dxfObj);
        }
    }
    private HashMap<String,String> einzelobjekte=new HashMap<String,String>();
    private HashSet<String> geleise=new HashSet<String>();
    private void mapEinzelobjekt(IomObject iomObj) {
        String tid=iomObj.getobjectoid();
        String art=iomObj.getattrvalue(ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.Einzelobjekt.tag_Art);
        einzelobjekte.put(tid,art);
        if(art.equals(EOArt.tag_Bahngeleise)) {
            geleise.add(tid);
        }
    }
    private void mapEOFlaechenelement(IomObject iomObj) {
        IomObject refObj=iomObj.getattrobj(ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.Flaechenelement.tag_Flaechenelement_von, 0);
        String ref=refObj.getobjectrefoid();
        String art=einzelobjekte.get(ref);
        String layer=null;
        if(art.equals(EOArt.tag_uebriger_Gebaeudeteil)) {
            layer="01311";
        }else if(art.equals(EOArt.tag_wichtige_Treppe)) {
            layer="01312";
        }else if(art.equals(EOArt.tag_Mauer) || art.equals(EOArt.tag_massiver_Sockel)) {
            layer="01313";
        }else if(art.equals(EOArt.tag_Aussichtsturm) || art.equals(EOArt.tag_Silo_Turm_Gasometer)) {
            layer="01314";
        }else if(art.equals(EOArt.tag_Bruecke_Passerelle) || art.equals(EOArt.tag_Landungssteg)) {
            layer="01316";
        }else if(art.equals(EOArt.tag_unterirdisches_Gebaeude) || art.equals(EOArt.tag_Reservoir) || art.equals(EOArt.tag_Unterstand)) {
            layer="01321";
        }else if(art.equals(EOArt.tag_Tunnel_Unterfuehrung_Galerie)) {
            layer="01322";
        }else if(art.equals(EOArt.tag_schmaler_Weg)) {
            layer="01331";
        }else if(art.equals(EOArt.tag_eingedoltes_oeffentliches_Gewaesser)) {
            layer="01341";
        }else if(art.equals(EOArt.tag_Uferverbauung) || art.equals(EOArt.tag_Schwelle)) {
            layer="01342";
        }else if(art.equals(EOArt.tag_Brunnen)) {
            layer="01351";
        }else if(art.equals(EOArt.tag_Denkmal) || art.equals(EOArt.tag_Ruine_archaeologisches_Objekt)) {
            layer="01352";
        }else {
            return;
        }
        IomObject geom=iomObj.getattrobj(ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.Flaechenelement.tag_Geometrie,0);
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_POLYGON,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        out.add(dxfObj);
    }
    private void mapEOLinienelement(IomObject iomObj) {
        IomObject refObj=iomObj.getattrobj(ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.Linienelement.tag_Linienelement_von, 0);
        String ref=refObj.getobjectrefoid();
        String art=einzelobjekte.get(ref);
        String layer=null;
        if(art.equals(EOArt.tag_uebriger_Gebaeudeteil)) {
            layer="01311";
        }else if(art.equals(EOArt.tag_wichtige_Treppe)) {
            layer="01312";
        }else if(art.equals(EOArt.tag_Mauer) || art.equals(EOArt.tag_massiver_Sockel)) {
            layer="01313";
        }else if(art.equals(EOArt.tag_Aussichtsturm) || art.equals(EOArt.tag_Silo_Turm_Gasometer)) {
            layer="01314";
        }else if(art.equals(EOArt.tag_Hochkamin) || art.equals(EOArt.tag_Mast_Antenne) || art.equals(EOArt.tag_Pfeiler)) {
            layer="01315";
        }else if(art.equals(EOArt.tag_unterirdisches_Gebaeude) || art.equals(EOArt.tag_Reservoir) || art.equals(EOArt.tag_Unterstand)) {
            layer="01321";
        }else if(art.equals(EOArt.tag_Tunnel_Unterfuehrung_Galerie)) {
            layer="01322";
        }else if(art.equals(EOArt.tag_schmaler_Weg)) {
            layer="01331";
        }else if(art.equals(EOArt.tag_Bahngeleise) || art.equals(EOArt.tag_Achse)) {
                layer="01334";
        }else if(art.equals(EOArt.tag_Gondelbahn_Sesselbahn) || art.equals(EOArt.tag_Luftseilbahn) || art.equals(EOArt.tag_Skilift) || art.equals(EOArt.tag_Faehre)) {
            layer="01335";
        }else if(art.equals(EOArt.tag_Materialseilbahn)) {
            layer="01336";
        }else if(art.equals(EOArt.tag_eingedoltes_oeffentliches_Gewaesser)) {
            layer="01341";
        }else if(art.equals(EOArt.tag_Uferverbauung) || art.equals(EOArt.tag_Schwelle)) {
            layer="01342";
        }else if(art.equals(EOArt.tag_Rinnsal)) {
            layer="01343";
        }else if(art.equals(EOArt.tag_Brunnen)) {
            layer="01351";
        }else if(art.equals(EOArt.tag_Denkmal) || art.equals(EOArt.tag_Ruine_archaeologisches_Objekt)) {
            layer="01352";
        }else if(art.equals(EOArt.tag_Hochspannungsfreileitung)) {
            layer="01364";
        }else {
            return;
        }
        IomObject geom=iomObj.getattrobj(ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.Linienelement.tag_Geometrie,0);
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_POLYLINE,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        out.add(dxfObj);
    }
    private void mapEOPunktelement(IomObject iomObj) {
        IomObject refObj=iomObj.getattrobj(ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.Punktelement.tag_Punktelement_von, 0);
        String ref=refObj.getobjectrefoid();
        String art=einzelobjekte.get(ref);
        String layer=null;
        String block;
        if(art.equals(EOArt.tag_Bildstock_Kruzifix)) {
            layer="01353";
            block="EOPNT";
        }else if(art.equals(EOArt.tag_einzelner_Fels) || art.equals(EOArt.tag_wichtiger_Einzelbaum)) {
            layer="01361";
            block="EOPNT";
        }else if(art.equals(EOArt.tag_Grotte_Hoehleneingang)) {
            layer="01363";
            block="EOPNT";
        }else {
            return;
        }
        IomObject geom=iomObj.getattrobj(ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.Punktelement.tag_Geometrie,0);
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_BLOCKINSERT,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_BLOCK, block);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        out.add(dxfObj);
    }
    HashMap<String,String> geleisename=new HashMap<String,String>();
    private void mapEOObjektname(IomObject iomObj) {
        String tid=iomObj.getobjectoid();
        IomObject refObj=iomObj.getattrobj(ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.Objektname.tag_Objektname_von, 0);
        String ref=refObj.getobjectrefoid();
        
        String name=iomObj.getattrvalue(ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.Objektname.tag_Name);
        if(geleise.contains(ref)) {
            geleisename.put(tid, name);
        }
    }
    private void mapEOObjektnamePos(IomObject iomObj) {
        IomObject refObj=iomObj.getattrobj(ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.ObjektnamePos.tag_ObjektnamePos_von, 0);
        String ref=refObj.getobjectrefoid();
        String name=null;
        String layer=null;
        if(geleisename.containsKey(ref)) {
            name=geleisename.get(ref);
            layer="01339";
        }
        if(layer!=null) {
            IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_TEXT,null);
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT, name);
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT_SIZE,"0.9");
            IomObject geom=iomObj.getattrobj(ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.ObjektnamePos.tag_Pos,0);
            dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
            String ori=mapOri(iomObj.getattrvalue(ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.ObjektnamePos.tag_Ori));
            if(ori!=null) {
                dxfObj.setattrvalue(DxfWriter.IOM_ATTR_ORI, ori);
            }
            String hali=mapHali(iomObj.getattrvalue(ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.ObjektnamePos.tag_HAli));
            if(hali!=null) {
                dxfObj.setattrvalue(DxfWriter.IOM_ATTR_HALI, hali);
            }
            String vali=mapVali(iomObj.getattrvalue(ch.interlis.models.DM01AVCH24LV95D.Einzelobjekte.ObjektnamePos.tag_VAli));
            if(vali!=null) {
                dxfObj.setattrvalue(DxfWriter.IOM_ATTR_VALI, vali);
            }
            out.add(dxfObj);
        }
    }
    private HashMap<String,String> flurname_tid2name=new HashMap<String,String>();
    private void mapFlurname(IomObject iomObj) {
        String tid=iomObj.getobjectoid();
        String name=iomObj.getattrvalue(Flurname.tag_Name);
        flurname_tid2name.put(tid, name);
    }
    private void mapFlurnamePos(IomObject iomObj) {
        IomObject refObj=iomObj.getattrobj(FlurnamePos.tag_FlurnamePos_von, 0);
        String ref=refObj.getobjectrefoid();
        String name=flurname_tid2name.get(ref);
        String layer="01519";
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_TEXT,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT, name);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT_SIZE,"1.8");
        IomObject geom=iomObj.getattrobj(FlurnamePos.tag_Pos,0);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        String ori=mapOri(iomObj.getattrvalue(FlurnamePos.tag_Ori));
        if(ori!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_ORI, ori);
        }
        String hali=mapHali(iomObj.getattrvalue(FlurnamePos.tag_HAli));
        if(hali!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_HALI, hali);
        }
        String vali=mapVali(iomObj.getattrvalue(FlurnamePos.tag_VAli));
        if(vali!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_VALI, vali);
        }
        out.add(dxfObj);
    }
    private HashMap<String,String> ortsname_tid2name=new HashMap<String,String>();
    private void mapOrtsname(IomObject iomObj) {
        String tid=iomObj.getobjectoid();
        String name=iomObj.getattrvalue(Ortsname.tag_Name);
        ortsname_tid2name.put(tid, name);
    }
    private void mapOrtsnamePos(IomObject iomObj) {
        IomObject refObj=iomObj.getattrobj(OrtsnamePos.tag_OrtsnamePos_von, 0);
        String ref=refObj.getobjectrefoid();
        String name=ortsname_tid2name.get(ref);
        String layer="01529";
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_TEXT,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT, name);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT_SIZE,"1.8");
        IomObject geom=iomObj.getattrobj(OrtsnamePos.tag_Pos,0);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        String ori=mapOri(iomObj.getattrvalue(OrtsnamePos.tag_Ori));
        if(ori!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_ORI, ori);
        }
        String hali=mapHali(iomObj.getattrvalue(OrtsnamePos.tag_HAli));
        if(hali!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_HALI, hali);
        }
        String vali=mapVali(iomObj.getattrvalue(OrtsnamePos.tag_VAli));
        if(vali!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_VALI, vali);
        }
        out.add(dxfObj);
    }
    private HashMap<String,String> gelaendename_tid2name=new HashMap<String,String>();
    private void mapGelaendename(IomObject iomObj) {
        String tid=iomObj.getobjectoid();
        String name=iomObj.getattrvalue(Gelaendename.tag_Name);
        gelaendename_tid2name.put(tid, name);
    }
    private void mapGelaendenamePos(IomObject iomObj) {
        IomObject refObj=iomObj.getattrobj(GelaendenamePos.tag_GelaendenamePos_von, 0);
        String ref=refObj.getobjectrefoid();
        String name=gelaendename_tid2name.get(ref);
        String layer="01539";
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_TEXT,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT, name);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT_SIZE,"1.8");
        IomObject geom=iomObj.getattrobj(GelaendenamePos.tag_Pos,0);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        String ori=mapOri(iomObj.getattrvalue(GelaendenamePos.tag_Ori));
        if(ori!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_ORI, ori);
        }
        String hali=mapHali(iomObj.getattrvalue(GelaendenamePos.tag_HAli));
        if(hali!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_HALI, hali);
        }
        String vali=mapVali(iomObj.getattrvalue(GelaendenamePos.tag_VAli));
        if(vali!=null) {
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_VALI, vali);
        }
        out.add(dxfObj);
    }
    private void mapGrenzpunkt(IomObject iomObj) {
        String block=null;
        String layer=null;
        String punktzeichen=iomObj.getattrvalue(Grenzpunkt.tag_Punktzeichen);
        if(punktzeichen.equals(Versicherungsart.tag_Stein)) {
            block="GPSTE";
            layer="01651";
        }else if(punktzeichen.equals(Versicherungsart.tag_Kunststoffzeichen)) {
            block="GPKST";
            layer="01652";
        }else if(punktzeichen.equals(Versicherungsart.tag_Bolzen)) {
            block="GPBOL";
            layer="01653";
        }else if(punktzeichen.equals(Versicherungsart.tag_Rohr)) {
            block="GPROH";
            layer="01654";
        }else if(punktzeichen.equals(Versicherungsart.tag_Pfahl)) {
            block="GPPFA";
            layer="01655";
        }else if(punktzeichen.equals(Versicherungsart.tag_Kreuz)) {
            block="GPKRZ";
            layer="01656";
        }else if(punktzeichen.equals(Versicherungsart.tag_unversichert)) {
            block="GPUV";
            layer="01657";
        }
        if(layer!=null) {
            String tid=iomObj.getobjectoid();
            IomObject geom=iomObj.getattrobj(Grenzpunkt.tag_Geometrie,0);
            IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_BLOCKINSERT,null);
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_BLOCK, block);
            dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
            out.add(dxfObj);
        }
    }
    private HashMap<String,String> projLiegenschaften=new HashMap<String,String>();
    private HashMap<String,String> projSelbstRecht=new HashMap<String,String>();
    private void mapProjGrundstueck(IomObject iomObj) {
        String tid=iomObj.getobjectoid();
        String art=iomObj.getattrvalue(ProjGrundstueck.tag_Art);
        String nummer=iomObj.getattrvalue(ProjGrundstueck.tag_Nummer);
        if(art.equals(Grundstuecksart.tag_Liegenschaft)) {
            projLiegenschaften.put(tid,nummer);
        }else if(art.equals(Grundstuecksart.tag_SelbstRecht_Baurecht) 
                || art.equals(Grundstuecksart.tag_SelbstRecht_Konzessionsrecht)
                || art.equals(Grundstuecksart.tag_SelbstRecht_Quellenrecht)
                || art.equals(Grundstuecksart.tag_SelbstRecht_weitere)) {
            projSelbstRecht.put(tid,nummer);
        }
    }
    private void mapProjGrundstueckPos(IomObject iomObj) {
        IomObject refObj=iomObj.getattrobj(ProjGrundstueckPos.tag_ProjGrundstueckPos_von, 0);
        String ref=refObj.getobjectrefoid();
        String nummer=null;
        String layer=null;
        if(projLiegenschaften.containsKey(ref)) {
            nummer=projLiegenschaften.get(ref);
            layer="01629";
        }else if(projSelbstRecht.containsKey(ref)) {
            nummer="("+projSelbstRecht.get(ref)+")";
            layer="01649";
        }
        if(nummer!=null) {
            IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_TEXT,null);
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT, nummer);
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT_SIZE,"1.35");
            IomObject geom=iomObj.getattrobj(ProjGrundstueckPos.tag_Pos,0);
            dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
            String ori=mapOri(iomObj.getattrvalue(ProjGrundstueckPos.tag_Ori));
            if(ori!=null) {
                dxfObj.setattrvalue(DxfWriter.IOM_ATTR_ORI, ori);
            }
            String hali=mapHali(iomObj.getattrvalue(ProjGrundstueckPos.tag_HAli));
            if(hali!=null) {
                dxfObj.setattrvalue(DxfWriter.IOM_ATTR_HALI, hali);
            }
            String vali=mapVali(iomObj.getattrvalue(ProjGrundstueckPos.tag_VAli));
            if(vali!=null) {
                dxfObj.setattrvalue(DxfWriter.IOM_ATTR_VALI, vali);
            }
            out.add(dxfObj);
        }
    }
    private void mapProjLiegenschaft(IomObject iomObj) {
        String tid=iomObj.getobjectoid();
        String layer=null;
        layer="01621";
        IomObject geom=iomObj.getattrobj(ProjLiegenschaft.tag_Geometrie,0);
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_POLYGON,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        out.add(dxfObj);
    }
    private void mapProjSelbstRecht(IomObject iomObj) {
        String tid=iomObj.getobjectoid();
        String layer=null;
        layer="01641";
        IomObject geom=iomObj.getattrobj(ProjSelbstRecht.tag_Geometrie,0);
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_POLYGON,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        out.add(dxfObj);
    }
    private HashMap<String,String> liegenschaften=new HashMap<String,String>();
    private HashMap<String,String> selbstRecht=new HashMap<String,String>();
    private void mapGrundstueck(IomObject iomObj) {
        String tid=iomObj.getobjectoid();
        String art=iomObj.getattrvalue(Grundstueck.tag_Art);
        String nummer=iomObj.getattrvalue(Grundstueck.tag_Nummer);
        if(art.equals(Grundstuecksart.tag_Liegenschaft)) {
            liegenschaften.put(tid,nummer);
        }else if(art.equals(Grundstuecksart.tag_SelbstRecht_Baurecht) 
                || art.equals(Grundstuecksart.tag_SelbstRecht_Konzessionsrecht)
                || art.equals(Grundstuecksart.tag_SelbstRecht_Quellenrecht)
                || art.equals(Grundstuecksart.tag_SelbstRecht_weitere)) {
            selbstRecht.put(tid,nummer);
        }
    }
    private void mapGrundstueckPos(IomObject iomObj) {
        IomObject refObj=iomObj.getattrobj(GrundstueckPos.tag_GrundstueckPos_von, 0);
        String ref=refObj.getobjectrefoid();
        String nummer=null;
        String layer=null;
        if(liegenschaften.containsKey(ref)) {
            nummer=liegenschaften.get(ref);
            layer="01619";
        }else if(selbstRecht.containsKey(ref)) {
            nummer="("+selbstRecht.get(ref)+")";
            layer="01639";
        }
        if(nummer!=null) {
            IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_TEXT,null);
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT, nummer);
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT_SIZE,"1.35");
            IomObject geom=iomObj.getattrobj(GrundstueckPos.tag_Pos,0);
            dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
            String ori=mapOri(iomObj.getattrvalue(GrundstueckPos.tag_Ori));
            if(ori!=null) {
                dxfObj.setattrvalue(DxfWriter.IOM_ATTR_ORI, ori);
            }
            String hali=mapHali(iomObj.getattrvalue(GrundstueckPos.tag_HAli));
            if(hali!=null) {
                dxfObj.setattrvalue(DxfWriter.IOM_ATTR_HALI, hali);
            }
            String vali=mapVali(iomObj.getattrvalue(GrundstueckPos.tag_VAli));
            if(vali!=null) {
                dxfObj.setattrvalue(DxfWriter.IOM_ATTR_VALI, vali);
            }
            out.add(dxfObj);
        }
    }
    private void mapLiegenschaft(IomObject iomObj) {
        String tid=iomObj.getobjectoid();
        String layer=null;
        layer="01611";
        IomObject geom=iomObj.getattrobj(Liegenschaft.tag_Geometrie,0);
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_POLYGON,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        out.add(dxfObj);
    }
    private void mapSelbstRecht(IomObject iomObj) {
        String tid=iomObj.getobjectoid();
        String layer=null;
        layer="01631";
        IomObject geom=iomObj.getattrobj(SelbstRecht.tag_Geometrie,0);
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_POLYGON,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        out.add(dxfObj);
    }
    private void mapRLLinienelement(IomObject iomObj) {
        String layer="01712";
        IomObject geom=iomObj.getattrobj(ch.interlis.models.DM01AVCH24LV95D.Rohrleitungen.Linienelement.tag_Geometrie,0);
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_POLYLINE,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        out.add(dxfObj);
    }
    private void mapHoheitsgrenzpunkt(IomObject iomObj) {
        String block="HGP";
        String layer="01812";
        if(layer!=null) {
            String tid=iomObj.getobjectoid();
            IomObject geom=iomObj.getattrobj(Hoheitsgrenzpunkt.tag_Geometrie,0);
            IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_BLOCKINSERT,null);
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_BLOCK, block);
            dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
            out.add(dxfObj);
        }
    }
    private void mapGemeindegrenze(IomObject iomObj) {
        String tid=iomObj.getobjectoid();
        String layer=null;
        layer="01811";
        IomObject geom=iomObj.getattrobj(Gemeindegrenze.tag_Geometrie,0);
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_POLYGON,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        out.add(dxfObj);
    }
    private void mapBezirksgrenzabschnitt(IomObject iomObj) {
        String layer="01821";
        IomObject geom=iomObj.getattrobj(Bezirksgrenzabschnitt.tag_Geometrie,0);
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_POLYLINE,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        out.add(dxfObj);
    }
    private void mapKantonsgrenzabschnitt(IomObject iomObj) {
        String layer="01831";
        IomObject geom=iomObj.getattrobj(Kantonsgrenzabschnitt.tag_Geometrie,0);
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_POLYLINE,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        out.add(dxfObj);
    }
    private void mapLandesgrenzabschnitt(IomObject iomObj) {
        String layer="01841";
        IomObject geom=iomObj.getattrobj(Landesgrenzabschnitt.tag_Geometrie,0);
        IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_POLYLINE,null);
        dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
        dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
        out.add(dxfObj);
    }
    private HashMap<String,String> lokalisationsName=new HashMap<String,String>();
    private void mapLokalisationsName(IomObject iomObj) {
        String tid=iomObj.getobjectoid();
        String text=iomObj.getattrvalue(LokalisationsName.tag_Text);
        lokalisationsName.put(tid,text);
    }
    private void mapLokalisationsNamePos(IomObject iomObj) {
        IomObject refObj=iomObj.getattrobj(LokalisationsNamePos.tag_LokalisationsNamePos_von, 0);
        String ref=refObj.getobjectrefoid();
        String text=null;
        String layer=null;
        if(lokalisationsName.containsKey(ref)) {
            text=lokalisationsName.get(ref);
            layer="01229";
        }
        if(text!=null) {
            IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_TEXT,null);
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT, text);
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT_SIZE,"1.5");
            IomObject geom=iomObj.getattrobj(LokalisationsNamePos.tag_Pos,0);
            dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
            String ori=mapOri(iomObj.getattrvalue(LokalisationsNamePos.tag_Ori));
            if(ori!=null) {
                dxfObj.setattrvalue(DxfWriter.IOM_ATTR_ORI, ori);
            }
            String hali=mapHali(iomObj.getattrvalue(LokalisationsNamePos.tag_HAli));
            if(hali!=null) {
                dxfObj.setattrvalue(DxfWriter.IOM_ATTR_HALI, hali);
            }
            String vali=mapVali(iomObj.getattrvalue(LokalisationsNamePos.tag_VAli));
            if(vali!=null) {
                dxfObj.setattrvalue(DxfWriter.IOM_ATTR_VALI, vali);
            }
            out.add(dxfObj);
        }
    }
    private HashMap<String,String> hausnummerReal=new HashMap<String,String>();
    private HashMap<String,String> hausnummerProjektiert=new HashMap<String,String>();
    private void mapGebaeudeeingang(IomObject iomObj) {
        String tid=iomObj.getobjectoid();
        String hausnummer=iomObj.getattrvalue(Gebaeudeeingang.tag_Hausnummer);
        String status=iomObj.getattrvalue(Gebaeudeeingang.tag_Status);
        if(status.equals(Status_GA.tag_real)) {
            hausnummerReal.put(tid,hausnummer);
        }else if(status.equals(Status_GA.tag_projektiert)) {
            hausnummerProjektiert.put(tid,hausnummer);
        }
    }
    private void mapHausnummerPos(IomObject iomObj) {
        IomObject refObj=iomObj.getattrobj(HausnummerPos.tag_HausnummerPos_von, 0);
        String ref=refObj.getobjectrefoid();
        String nummer=null;
        String layer=null;
        if(hausnummerReal.containsKey(ref)) {
            nummer=hausnummerReal.get(ref);
            layer="01219";
        }else if(hausnummerProjektiert.containsKey(ref)) {
            nummer=hausnummerProjektiert.get(ref);
            layer="01919";
        }
        if(nummer!=null) {
            IomObject dxfObj=new Iom_jObject(DxfWriter.IOM_TEXT,null);
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_LAYERNAME, layer);
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT, nummer);
            dxfObj.setattrvalue(DxfWriter.IOM_ATTR_TEXT_SIZE,"0.9");
            IomObject geom=iomObj.getattrobj(HausnummerPos.tag_Pos,0);
            dxfObj.addattrobj(DxfWriter.IOM_ATTR_GEOM, geom);
            String ori=mapOri(iomObj.getattrvalue(HausnummerPos.tag_Ori));
            if(ori!=null) {
                dxfObj.setattrvalue(DxfWriter.IOM_ATTR_ORI, ori);
            }
            String hali=mapHali(iomObj.getattrvalue(HausnummerPos.tag_HAli));
            if(hali!=null) {
                dxfObj.setattrvalue(DxfWriter.IOM_ATTR_HALI, hali);
            }
            String vali=mapVali(iomObj.getattrvalue(HausnummerPos.tag_VAli));
            if(vali!=null) {
                dxfObj.setattrvalue(DxfWriter.IOM_ATTR_VALI, vali);
            }
            out.add(dxfObj);
        }
    }

}
