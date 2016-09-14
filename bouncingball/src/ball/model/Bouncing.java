package ball.model;

import ball.ui.BallWorld;

public class Bouncing extends Behavior {

    public static final int MOVEMENT_SPEED = 12;

    static final int DOWN = 1;
    static final int UP = -1;

    private int x;
    private int y;
    private int direction;
    private int radius;

    public Bouncing(int x, int y, int direction, int radius) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.radius = radius;
    }

    @Override
    public void action(BallImpl ball) {
        this.direction = reverseDirectionIfNecessary();
        this.y = move();
        ball.y = this.y;
    }


    /***********************************************************************************
     *
     * Do not change Bouncing ALGORITHM below.
     *
     ***********************************************************************************/

    private int reverseDirectionIfNecessary() {
        if (movingTooHigh() || movingTooLow()) {
            return switchDirection();
        }

        return this.direction;
    }

    private boolean movingTooLow() {
        return y + radius >= BallWorld.BOX_HEIGHT && movingDown();
    }

    private boolean movingTooHigh() {
        return y - radius <= 0 && movingUp();
    }

    private int switchDirection() {
        return movingDown() ? UP : DOWN;
    }

    private int move() {
        return y + (MOVEMENT_SPEED * direction);
    }

    private boolean movingDown() {
        return direction == DOWN;
    }

    private boolean movingUp() {
        return direction == UP;
    }



}
