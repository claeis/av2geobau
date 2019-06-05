package org.interlis2.av2geobau.impl;

import ch.interlis.iom.IomObject;
import ch.interlis.iox_j.jts.Iox2jts;
import ch.interlis.iox_j.jts.Iox2jtsException;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Polygon;


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

	private String layerName = "DEFAULT";
	public String getLayerName() {return layerName;}

	public void setLayerName(String layerName) {
		this.layerName = layerName;
	}

	public DxfWriter(String layerName) {
		this.layerName = layerName;
	}

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
		Coordinate[] coords = Iox2jts.polyline2JTS(feature.getattrobj(IOM_ATTR_GEOM, 0),false,0.0).toCoordinateArray();
		StringBuffer sb = new StringBuffer(DxfUtil.toString(0, "POLYLINE"));

		sb.append(DxfUtil.toString(8, layerName));
		
		sb.append(DxfUtil.toString(66, 1));
		sb.append(DxfUtil.toString(10, "0.0"));
		sb.append(DxfUtil.toString(20, "0.0"));
		sb.append(DxfUtil.toString(30, "0.0"));
		sb.append(DxfUtil.toString(70, 8));

		for (int i = 0 ; i < coords.length ; i++) {
			sb.append(DxfUtil.toString(0, "VERTEX"));
			sb.append(DxfUtil.toString(8, layerName));
			sb.append(DxfUtil.toString(10, coords[i].x, precision));
			sb.append(DxfUtil.toString(20, coords[i].y, precision));
			if (!Double.isNaN(coords[i].z)) {
			    sb.append(DxfUtil.toString(30, coords[i].z, precision));
			}else {
	            sb.append(DxfUtil.toString(30, 0.0,precision));
			}
			sb.append(DxfUtil.toString(70, 1));
		}
		sb.append(DxfUtil.toString(0, "SEQEND"));
		return sb.toString();
	}

	public static String polygon2Dxf(IomObject feature) {
        String layerName=feature.getattrvalue(IOM_ATTR_LAYERNAME);
		Polygon geom;
        try {
            geom = Iox2jts.surface2JTS(feature.getattrobj(IOM_ATTR_GEOM, 0),0.0);
        } catch (Iox2jtsException e) {
            throw new IllegalArgumentException(e);
        }
		Coordinate[] coords = geom.getExteriorRing().getCoordinates();
		StringBuffer sb = new StringBuffer(DxfUtil.toString(0, "POLYLINE"));
		sb.append(DxfUtil.toString(8, layerName));
		sb.append(DxfUtil.toString(66, 1));
		sb.append(DxfUtil.toString(10, "0.0"));
		sb.append(DxfUtil.toString(20, "0.0"));
		sb.append(DxfUtil.toString(30, "0.0"));
		if (!Double.isNaN(coords[0].z)) {
		    sb.append(DxfUtil.toString(30, "0.0"));
		}
		sb.append(DxfUtil.toString(70, 1));
		for (int i = 0 ; i < coords.length ; i++) {
			sb.append(DxfUtil.toString(0, "VERTEX"));
			sb.append(DxfUtil.toString(8, layerName));
			sb.append(DxfUtil.toString(10, coords[i].x, precision));
			sb.append(DxfUtil.toString(20, coords[i].y, precision));
			sb.append(DxfUtil.toString(30, 0.0, precision));
			sb.append(DxfUtil.toString(70, 1));
		}
		sb.append(DxfUtil.toString(0, "SEQEND"));
		for (int h = 0 ; h < geom.getNumInteriorRing() ; h++) {
			//System.out.println("polygon2Dxf (hole)" + suffix);
			sb.append(DxfUtil.toString(0, "POLYLINE"));
			sb.append(DxfUtil.toString(8, layerName));
			sb.append(DxfUtil.toString(66, 1));
			sb.append(DxfUtil.toString(10, "0.0"));
			sb.append(DxfUtil.toString(20, "0.0"));
			sb.append(DxfUtil.toString(30, "0.0"));			
			sb.append(DxfUtil.toString(70, 1));
			coords = geom.getInteriorRingN(h).getCoordinates();
			for (int i = 0 ; i < coords.length ; i++) {
				sb.append(DxfUtil.toString(0, "VERTEX"));
				sb.append(DxfUtil.toString(8, layerName));
				sb.append(DxfUtil.toString(10, coords[i].x, precision));
				sb.append(DxfUtil.toString(20, coords[i].y, precision));
				sb.append(DxfUtil.toString(30, 0.0, precision));				
				sb.append(DxfUtil.toString(70, 1));
			}
			sb.append(DxfUtil.toString(0, "SEQEND"));
		}
		return sb.toString();
	}

}

