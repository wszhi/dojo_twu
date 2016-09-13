import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {
    @Test
    public void should_calculate_area_of_circle_successfully() {
        MyCircle circle = new MyCircle(3);
        assertEquals(28.26, circle.computeArea(), 0.00);
    }

    @Test
    public void should_calculate_perimeter_of_circle_successfully() {
        MyCircle circle = new MyCircle(3);
        assertEquals(18.84, circle.computePerimeter(), 0.00);
    }
}
