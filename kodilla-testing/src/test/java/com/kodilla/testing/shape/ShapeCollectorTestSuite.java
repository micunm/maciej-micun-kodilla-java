package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure () {
        //given
        Shape testTriangle=new Triangle(12, 6);
        ShapeCollector testShapeCollector=new ShapeCollector();
        //when
        testShapeCollector.addFigure(testTriangle);
        //then
        Assert.assertEquals("Triangle", testShapeCollector.getFigure(0).getShapeName());
    }
    @Test
    public void testRemoveFigure () {
        //given
        Shape testTriangle=new Triangle(12, 6);
        ShapeCollector testShapeCollector=new ShapeCollector();
        testShapeCollector.addFigure(testTriangle);
        //when
        boolean result=testShapeCollector.removeFigure(testTriangle);
        //then
        Assert.assertTrue(result);
        Assert.assertEquals(null, testShapeCollector.getFigure(0));
    }
    @Test
    public void testGetFigure () {
        //given
        Shape testTriangle=new Triangle(12, 6);
        ShapeCollector testShapeCollector=new ShapeCollector();
        testShapeCollector.addFigure(testTriangle);
        //when
        Shape resultFigure=testShapeCollector.getFigure(0);
        //then
        Assert.assertEquals(testTriangle, testShapeCollector.getFigure(0));
    }
    @Test
    public void testGetShapeName () {
        //given
        Shape testTriangle=new Triangle(12, 6);
        ShapeCollector testShapeCollector=new ShapeCollector();
        testShapeCollector.addFigure(testTriangle);
        //when
        String figureName=testShapeCollector.getFigure(0).getShapeName();
        //then
        Assert.assertEquals("Triangle", figureName);
    }
    @Test
    public void testGetField () {
        //given
        Shape testTriangle=new Triangle(12, 6);
        ShapeCollector testShapeCollector=new ShapeCollector();
        testShapeCollector.addFigure(testTriangle);
        //when
        double shapeField=testShapeCollector.getFigure(0).getField();
        //then
        Assert.assertEquals(0.5*12*6, shapeField, 0.000001);
    }
}
