package org.interlis2.av2geobau.impl;

import org.junit.Assert;
import org.junit.Test;

import com.vividsolutions.jts.geom.Coordinate;

import ch.interlis.iom_j.itf.impl.jtsext.geom.ArcSegment;

public class BulgeTest {
    
    private static final double EPSILON = 0.0000001d;

    @Test
    public void testSmallArcCW()
    {
        Coordinate startPoint=new Coordinate(-4.0,3.0);
        Coordinate midPoint=new Coordinate(0.0,5.0);
        Coordinate endPoint=new Coordinate(4.0,3.0);
        ArcSegment arc=new ArcSegment(startPoint,midPoint,endPoint);
        System.out.println("Radius "+arc.getRadius());
        double bulge=DxfWriter.calcBulge(arc);
        Assert.assertEquals(-0.5, bulge,EPSILON);
        
    }
    @Test
    public void testSmallArcCCW()
    {
        Coordinate startPoint=new Coordinate(-4.0,-3.0);
        Coordinate midPoint=new Coordinate(0.0,-5.0);
        Coordinate endPoint=new Coordinate(4.0,-3.0);
        ArcSegment arc=new ArcSegment(startPoint,midPoint,endPoint);
        System.out.println("Radius "+arc.getRadius());
        double bulge=DxfWriter.calcBulge(arc);
        Assert.assertEquals(0.5, bulge,EPSILON);
        
    }
    @Test
    public void testBigArcCW()
    {
        Coordinate startPoint=new Coordinate(-4.0,-3.0);
        Coordinate midPoint=new Coordinate(0.0,5.0);
        Coordinate endPoint=new Coordinate(4.0,-3.0);
        ArcSegment arc=new ArcSegment(startPoint,midPoint,endPoint);
        System.out.println("Radius "+arc.getRadius());
        double bulge=DxfWriter.calcBulge(arc);
        Assert.assertEquals(-2.0, bulge,EPSILON);
        
    }
    @Test
    public void testBigArcCCW()
    {
        Coordinate startPoint=new Coordinate(-4.0,3.0);
        Coordinate midPoint=new Coordinate(0.0,-5.0);
        Coordinate endPoint=new Coordinate(4.0,3.0);
        ArcSegment arc=new ArcSegment(startPoint,midPoint,endPoint);
        System.out.println("Radius "+arc.getRadius());
        double bulge=DxfWriter.calcBulge(arc);
        Assert.assertEquals(2.0, bulge,EPSILON);
        
    }
    @Test
    public void testHalfCircleCW()
    {
        Coordinate startPoint=new Coordinate(-5.0,0.0);
        Coordinate midPoint=new Coordinate(0.0,5.0);
        Coordinate endPoint=new Coordinate(5.0,0.0);
        ArcSegment arc=new ArcSegment(startPoint,midPoint,endPoint);
        System.out.println("Radius "+arc.getRadius());
        double bulge=DxfWriter.calcBulge(arc);
        Assert.assertEquals(-1.0, bulge,EPSILON);
        
    }
    @Test
    public void testHalfCircleCCW()
    {
        Coordinate startPoint=new Coordinate(-5.0,0.0);
        Coordinate midPoint=new Coordinate(0.0,-5.0);
        Coordinate endPoint=new Coordinate(5.0,0.0);
        ArcSegment arc=new ArcSegment(startPoint,midPoint,endPoint);
        System.out.println("Radius "+arc.getRadius());
        double bulge=DxfWriter.calcBulge(arc);
        Assert.assertEquals(1.0, bulge,EPSILON);
        
    }

}
