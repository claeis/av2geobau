package org.interlis2.av2geobau.impl;

import ch.ehi.basics.logging.EhiLogger;
import ch.interlis.iom.IomObject;
import ch.interlis.iom_j.itf.impl.hrg.HrgUtility;
import ch.interlis.iom_j.itf.impl.jtsext.geom.ArcSegment;
import ch.interlis.iom_j.itf.impl.jtsext.geom.CompoundCurve;
import ch.interlis.iom_j.itf.impl.jtsext.geom.CompoundCurveRing;
import ch.interlis.iom_j.itf.impl.jtsext.geom.CurvePolygon;
import ch.interlis.iom_j.itf.impl.jtsext.geom.CurveSegment;
import ch.interlis.iom_j.itf.impl.jtsext.geom.StraightSegment;
import ch.interlis.iox.IoxException;
import ch.interlis.iox_j.jts.Iox2jts;
import ch.interlis.iox_j.jts.Iox2jtsException;
import ch.interlis.iox_j.jts.Iox2jtsext;

import java.util.ArrayList;

import com.vividsolutions.jts.algorithm.Angle;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.LineString;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.util.GeometryEditor.CoordinateOperation;
import com.vividsolutions.jts.util.NumberUtil;


public class DxfWriter {
    public static final String IOM_DXF_TOPIC="Dxf.Topic";
    public static final String IOM_TEXT=IOM_DXF_TOPIC+".Text";
    public static final String IOM_BLOCKINSERT=IOM_DXF_TOPIC+".BlockInsert";
    public static final String IOM_POLYLINE=IOM_DXF_TOPIC+".Polyline";
    public static final String IOM_POLYGON=IOM_DXF_TOPIC+".Polygon";
    public static final String IOM_ATTR_TEXT = "text";
    public static final String IOM_ATTR_TEXT_SIZE = "text_size";
    public static final String IOM_ATTR_GEOM = "geom";
    public static final String IOM_ATTR_BLOCK = "block";
    public static final String IOM_ATTR_LAYERNAME = "layername";
    public static final String IOM_ATTR_ORI = "ori";
    public static final String IOM_ATTR_HALI = "hali";
    public static final String IOM_ATTR_VALI = "vali"; 
    
	private static int precision = 3;

	public static String feature2Dxf(IomObject feature) throws Exception {

		String type = feature.getobjecttag();
		if (type.equals(IOM_BLOCKINSERT)) {
			return blockinsert2Dxf(feature);
		}else if (type.equals(IOM_TEXT)) {
            return text2Dxf(feature);
		}
		else if (type.equals(IOM_POLYLINE)) {
			return lineString2Dxf(feature);
		}
		else if (type.equals(IOM_POLYGON)) {
			return polygon2Dxf(feature);
		}
		else {
			throw new IllegalArgumentException("unexpected type "+type);
		}
	}


	public static String blockinsert2Dxf(IomObject feature) throws Exception {
		StringBuffer sb = null;

		String layerName=feature.getattrvalue(IOM_ATTR_LAYERNAME);
        sb = new StringBuffer(DxfUtil.toString(0, "INSERT"));          
        sb.append(DxfUtil.toString(2, feature.getattrvalue(IOM_ATTR_BLOCK)));
        sb.append(DxfUtil.toString(8, layerName));
        Coordinate coord = Iox2jts.coord2JTS(feature.getattrobj(IOM_ATTR_GEOM, 0));
        sb.append(DxfUtil.toString(10, coord.x, precision));
        sb.append(DxfUtil.toString(20, coord.y, precision));

        if(!Double.isNaN(coord.z)) {
            double h = coord.z;
            if(h > 0) {
                sb.append(DxfUtil.toString(30, h, precision));
            } else {
                sb.append(DxfUtil.toString(30, 0, precision));
            }
        } else {
            sb.append(DxfUtil.toString(30, 0, precision));         
        }
            
            
        sb.append(DxfUtil.toString(50, "0.0"));
        sb.append(DxfUtil.toString(41, "0.5"));
        sb.append(DxfUtil.toString(42, "0.5"));
        sb.append(DxfUtil.toString(43, "0.5"));
		return sb.toString();
	}
    public static String text2Dxf(IomObject feature) throws Exception {
        StringBuffer sb = null;

        String layerName=feature.getattrvalue(IOM_ATTR_LAYERNAME);

        sb = new StringBuffer(DxfUtil.toString(0, "TEXT"));
        sb.append(DxfUtil.toString(1, (String) feature.getattrvalue(IOM_ATTR_TEXT)));
        sb.append(DxfUtil.toString(40, (Double) Double.valueOf(feature.getattrvalue(IOM_ATTR_TEXT_SIZE))));
        //sb.append(DxfGroup.toString(7, "STANDARD"));
        sb.append(DxfUtil.toString(8, layerName));
        //sb.append(DxfGroup.toString(6, "CONTINOUS"));
        //sb.append(DxfGroup.toString(62, "7"));
        Coordinate coord = Iox2jts.coord2JTS(feature.getattrobj(IOM_ATTR_GEOM, 0));
        sb.append(DxfUtil.toString(10, coord.x, precision));
        sb.append(DxfUtil.toString(20, coord.y, precision));
        sb.append(DxfUtil.toString(30, 0, precision));
        
        Double ori = null;
        String oriTxt=feature.getattrvalue(IOM_ATTR_ORI);
        if(oriTxt!=null) {
            ori=Double.valueOf(oriTxt);
        }
        if (ori != null) {
            sb.append(DxfUtil.toString(50, ori));
        } else {
            sb.append(DxfUtil.toString(50, 0.0));
        }
        
        Integer hali = null;
        String haliTxt=feature.getattrvalue(IOM_ATTR_HALI);
        if(haliTxt!=null) {
            hali=Integer.valueOf(haliTxt);
        }
        if (hali != null) {
            sb.append(DxfUtil.toString(72, hali));
        } else {
            sb.append(DxfUtil.toString(72, 1));
        }

        Integer dxfVali = 2;
        String valiTxt=feature.getattrvalue(IOM_ATTR_VALI);
        if ( valiTxt!= null) {
            dxfVali = Integer.parseInt(valiTxt);
        } 

        sb.append(DxfUtil.toString(73, dxfVali.toString()));
        sb.append(DxfUtil.toString(11, coord.x, precision));
        sb.append(DxfUtil.toString(21, coord.y, precision));
        sb.append(DxfUtil.toString(31, 0));   
        return sb.toString();
    }

	public static String lineString2Dxf(IomObject feature) throws Exception {
        String layerName=feature.getattrvalue(IOM_ATTR_LAYERNAME);
		CompoundCurve curve = Iox2jtsext.polyline2JTS(feature.getattrobj(IOM_ATTR_GEOM, 0),false,0.0);
		StringBuffer sb = new StringBuffer();

		writePolyline(sb, layerName, curve,true,false);
		return sb.toString();
	}

    private static void writePolyline(StringBuffer sb, String layerName, LineString line,boolean is3D,boolean isClosed) {
        ArrayList<CurveSegment> segs=new ArrayList<CurveSegment>();
        if(line instanceof CompoundCurveRing) {
            CompoundCurveRing ring=(CompoundCurveRing)line;
            ArrayList<CompoundCurve> lines=ring.getLines();
            for(CompoundCurve cline:lines) {
                segs.addAll(cline.getSegments());
            }
        }else if(line instanceof CompoundCurve) {
            segs=((CompoundCurve) line).getSegments();
        }else {
            Coordinate coords[]=line.getCoordinates();
            for(int coordi=1;coordi<coords.length;coordi++){
                segs.add(new StraightSegment(coords[coordi-1],coords[coordi]));
            }
        }
        sb.append(DxfUtil.toString(0, "POLYLINE"));
        sb.append(DxfUtil.toString(8, layerName));
		
		sb.append(DxfUtil.toString(66, 1));
		sb.append(DxfUtil.toString(10, "0.0"));
		sb.append(DxfUtil.toString(20, "0.0"));
		sb.append(DxfUtil.toString(30, "0.0"));
		sb.append(DxfUtil.toString(70, (is3D?8:0)+(isClosed?1:0))); // Polyline flag: 1 = closed polyline, 8 = 3D Polyline

		for (int i = 0 ; i < segs.size() ; i++) {
			sb.append(DxfUtil.toString(0, "VERTEX"));
			sb.append(DxfUtil.toString(8, layerName));
			final CurveSegment curveSegment = segs.get(i);
            final Coordinate coord = curveSegment.getStartPoint();
            sb.append(DxfUtil.toString(10, coord.x, precision));
			sb.append(DxfUtil.toString(20, coord.y, precision));
			if (!Double.isNaN(coord.z)) {
			    sb.append(DxfUtil.toString(30, coord.z, precision));
			}else {
	            sb.append(DxfUtil.toString(30, 0.0,precision));
			}
			if(curveSegment instanceof ArcSegment) {
	            // Bulge (optional; default is 0).
			    final ArcSegment arc = (ArcSegment)curveSegment;
			    if(!arc.isStraight()) {
	                double bulge=calcBulge(arc);
                    final String bulgeTxt = DxfUtil.toString(42, bulge, precision);
                    sb.append(bulgeTxt);
			    }
			}
			sb.append(DxfUtil.toString(70, 1)); // Vertex flag:  1 = Extra vertex created by curve-fitting
		}
        {
            sb.append(DxfUtil.toString(0, "VERTEX"));
            sb.append(DxfUtil.toString(8, layerName));
            final Coordinate coord = segs.get(segs.size()-1).getEndPoint();
            sb.append(DxfUtil.toString(10, coord.x, precision));
            sb.append(DxfUtil.toString(20, coord.y, precision));
            if (!Double.isNaN(coord.z)) {
                sb.append(DxfUtil.toString(30, coord.z, precision));
            }else {
                sb.append(DxfUtil.toString(30, 0.0,precision));
            }
            sb.append(DxfUtil.toString(70, 1)); // Vertex flag:  1 = Extra vertex created by curve-fitting
            
        }
		sb.append(DxfUtil.toString(0, "SEQEND"));
    }


    /** The bulge is the tangent of one fourth the included angle for an
     * arc segment, made negative if the arc goes clockwise from the start point to the endpoint. A
     * bulge of 0 indicates a straight segment, and a bulge of 1 is a semicircle
     */
    public static double calcBulge(final ArcSegment arc) {
        
        double a = (Math.PI - Angle.angle(arc.getMidPoint(), arc.getStartPoint()) + Angle.angle(arc.getMidPoint(), arc.getEndPoint())) / 2.0;
        double bulge= Math.sin(a) / Math.cos(a);
        if(!Double.isFinite(bulge)) {
            throw new IllegalStateException("unexpected bulge "+bulge);
        }
        return  bulge;
    }

	public static String polygon2Dxf(IomObject feature) {
        String layerName=feature.getattrvalue(IOM_ATTR_LAYERNAME);
		Polygon geom;
        try {
            geom = Iox2jtsext.surface2JTS(feature.getattrobj(IOM_ATTR_GEOM, 0),0.0);
        } catch (IoxException e) {
            throw new IllegalArgumentException(e);
        }
        LineString boundary = geom.getExteriorRing();
        
        StringBuffer sb = new StringBuffer();
        writePolyline(sb,layerName,boundary,false,true);
        for (int h = 0 ; h < geom.getNumInteriorRing() ; h++) {
            boundary = geom.getInteriorRingN(h);
            writePolyline(sb,layerName,boundary,false,true);
        }
		return sb.toString();
	}

}

