import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    @Test
    public void should_calculate_area_of_square_as_1() {
        MyRectangle square = MyRectangle.createSquare(1);
        Assert.assertEquals(1, square.computeArea(), 0.0);
    }

    @Test
    public void should_calculate_area_of_square_as_four() {
        MyRectangle square = MyRectangle.createSquare(2);
        Assert.assertEquals(4, square.computeArea(), 0.0);
    }

    @Test
    public void should_calculate_area_when_side_is_double() {
        MyRectangle square = MyRectangle.createSquare(1.1);
        Assert.assertEquals(1.21, square.computeArea(), 0.0);
    }

    @Test
    public void should_calculate_perimeter_when_side_is_four() {
        MyRectangle square = MyRectangle.createSquare(4);
        Assert.assertEquals(16, square.computePerimeter(), 0.0);
    }

    @Test
    public void should_calculate_perimeter_when_side_is_double() {
        MyRectangle square = MyRectangle.createSquare(1.1);
        Assert.assertEquals(4.4, square.computePerimeter(), 0.0);
    }

}
