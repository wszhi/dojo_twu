public class MyCircle implements IShape{
    public static final double PI = 3.14;
    private double radius;

    public MyCircle(double radius) {

        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return (double) (PI * radius * radius * 100) / 100;
    }

    @Override
    public double computePerimeter() {
        return (double) (PI * 2 * radius * 100) / 100;
    }
}
