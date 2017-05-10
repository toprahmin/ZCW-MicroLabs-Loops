package io.zipcoder.microlabs.mastering_loops;


import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {

    Shapes shapes;

    @Before
    public void setUp(){
        shapes = new Shapes();
    }

    @Test
    public void triangleTest(){
        //: Given

        String expected = "***";
        //: When
        String actual = shapes.triangle(3);
        //: Then
        Assert.assertEquals("The functions are equal", expected,actual);
    }

    @Test
    public void tableSquareTest(){
        //: Given

        //: When

        //: Then
    }
}
