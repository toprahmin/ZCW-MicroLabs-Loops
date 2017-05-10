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

        String expected = "triangle()\n*** Output ***\n*\n**\n***\n****\n*****";
        //: When
        String actual = shapes.triangle(5);
        //: Then
        Assert.assertEquals("The functions are equal", expected,actual);
    }

    @Test
    public void tableSquareTest(){
        //: Given
        String expected = "tableSquare()\n*** Output ***\n|1|2|3|4|\n|2|4|6|8|\n|3|6|9|12|\n|4|8|12|16|";
        //: When
        String actual = shapes.tableSquare();
        //: Then
        Assert.assertEquals("The functions are equal", expected, actual);
    }

    @Test
    public void tableSquaresTest(){
        //: Given
        String expected = "tableSquares()\n*** Output ***\n|1|2|3|4|5|\n|2|4|6|8|10|\n|3|6|9|12|15|\n|4|8|12|16|20|\n|5|10|15|20|25|";
        //: When
        String actual = shapes.tableSquares(5);
        //: Then
        Assert.assertEquals("The functions are equal", expected, actual);
    }
}
