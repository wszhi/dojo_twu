package bester;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BestRectangleTest {
    BestRectangle bestRectangle;
    @Before
    public void setUp() throws Exception {
        bestRectangle = new BestRectangle();
    }

    @Test
    public void shouldReturnRectangleWhenSingleRectangle() throws Exception {
        Rectangle rectangle = new Rectangle(2,3);
        assertEquals(rectangle, bestRectangle.findTheBest(rectangle));
    }

    @Test
    public void shouldReturnRectangle1WhenRectangle1IsBest() throws Exception {
        Rectangle rectangle1 = new Rectangle(10,13);
        Rectangle rectangle2 = new Rectangle(2,3);
        Rectangle rectangle3 = new Rectangle(3,9);
        assertEquals(rectangle1,bestRectangle.findTheBest(rectangle1,rectangle2,rectangle3));
    }

    @Test
    public void shouldReturnRectangle2WhenRectangle2IsBest() throws Exception {
        Rectangle rectangle1 = new Rectangle(10,13);
        Rectangle rectangle2 = new Rectangle(20,30);
        Rectangle rectangle3 = new Rectangle(3,9);
        assertEquals(rectangle2,bestRectangle.findTheBest(rectangle1,rectangle2,rectangle3));
    }
}
