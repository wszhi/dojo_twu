package rover;


public class Position {
    private  int Y ;
    private  int X;

    public Position(int x, int y) {
        X = x;
        Y = y;
    }

    public int getY() {
        return Y;
    }

    public int getX() {
        return X;
    }

    public void setY(int y) {
        Y = y;
    }

    public void setX(int x) {
        X = x;
    }

    @Override
    public String toString() {
        return getX() + " " + getY() + " ";
    }
}
