package bester;

import org.junit.Test;

import static junit.framework.Assert.*;

public class RectangleTest {
    @Test
    public void areaShouldBeEqualToLengthyMultipliedByBreadth() throws Exception {
        assertEquals(6.0, new Rectangle(2, 3).area());
        assertEquals(0.0, new Rectangle(0, 1).area());
        assertEquals(3.75, new Rectangle(1.5, 2.5).area());
    }

    @Test
    public void shouldReturnTrueWhenRectangle1IsBetterThanRectangle2() throws Exception {
        Rectangle rectangle2 = new Rectangle(1, 2);
        Rectangle rectangle1 = new Rectangle(2, 3);
        assertTrue(rectangle1.isBetterThan(rectangle2));
    }

    @Test
    public void shouldReturnFalseWhenRectangle1IsNotBetterThanRectangle2() throws Exception {
        Rectangle rectangle1 = new Rectangle(1, 2);
        Rectangle rectangle2 = new Rectangle(2, 3);
        assertFalse(rectangle1.isBetterThan(rectangle2));
    }


}
