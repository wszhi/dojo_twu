package ball.model;

import ball.ui.BallWorld;

public class Slide extends Behavior{
    public static final int MOVEMENT_SPEED = 12;

    static final int RIGHT = 1;
    static final int LEFT = -1;

    private int x;
    private int y;
    private int direction;
    private int radius;

    public Slide(int x, int y, int direction, int radius) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.radius = radius;
    }

    @Override
    public void action(BallImpl ball) {
        this.direction = reverseDirectionIfNecessary();
        this.x = move();
        ball.x = this.x;
    }

    private int reverseDirectionIfNecessary() {
        if (movingTooLeft() || movingTooRight()) {
            return switchDirection();
        }

        return this.direction;
    }

    private boolean movingTooRight() {
        return x + radius >= BallWorld.BOX_HEIGHT && movingRight();
    }

    private boolean movingTooLeft() {
        return x - radius <= 0 && movingLeft();
    }

    private int switchDirection() {
        return movingRight() ? LEFT : RIGHT;
    }

    private int move() {
        return x + (MOVEMENT_SPEED * direction);
    }

    private boolean movingRight() {
        return direction == RIGHT;
    }

    private boolean movingLeft() {
        return direction == LEFT;
    }



}
