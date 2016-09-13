public class MyRectangle implements IShape {
    private final double length;
    private final double width;

    private MyRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public static MyRectangle createSquare(double side) {
        return new MyRectangle(side, side);
    }

    public static MyRectangle createRectangle(double length, double width) {
        return new MyRectangle(length, width);
    }

    @Override
    public double computeArea() {
        return (double) Math.round(length * width * 100) / 100;
    }

    @Override
    public double computePerimeter() {
        return (double) Math.round(2 * (length + width) * 100) / 100;
    }
}
