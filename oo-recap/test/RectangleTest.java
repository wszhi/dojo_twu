import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void should_get_area_successfully() {
        MyRectangle rectangle = MyRectangle.createRectangle(1, 2);
        assertEquals(2, rectangle.computeArea(), 0.0);
    }

    @Test
    public void should_get_area_as_six() {
        MyRectangle rectangle = MyRectangle.createRectangle(2, 3);
        assertEquals(6, rectangle.computeArea(), 0.0);
    }

    @Test
    public void should_get_area_when_length_is_double() {
        MyRectangle rectangle = MyRectangle.createRectangle(1.5, 5);
        assertEquals(7.5, rectangle.computeArea(), 0.0);
    }

    @Test
    public void should_get_perimeter_successfully() {
        MyRectangle rectangle = MyRectangle.createRectangle(1, 2);
        assertEquals(6, rectangle.computePerimeter(), 0.0);
    }

}
