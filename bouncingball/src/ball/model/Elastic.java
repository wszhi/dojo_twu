package ball.model;

import ball.Ball;

public class Elastic extends Behavior {
    public static final int GROWTH_RATE = 2;

    static final int GROW = 1;
    static final int SHRINK = -1;

    private int growthDirection;
    private int radius;

    public Elastic(int growthDirection, int radius) {
        this.growthDirection = growthDirection;
        this.radius = radius;
    }

    @Override
    public void action(BallImpl ball) {
        this.growthDirection = reverseGrowthDirectionIfNecessary();
        this.radius = next();
        ball.radius = this.radius;
    }

    /***********************************************************************************
     *
     * Do not change Elastic ALGORITHM below.
     *
     ***********************************************************************************/

    private int reverseGrowthDirectionIfNecessary() {
        if (growingTooBig() || shrinkingTooSmall()) {
            return switchDirection();
        }

        return this.growthDirection;
    }

    private boolean shrinkingTooSmall() {
        return radius <= 0 && shrinking();
    }

    private boolean growingTooBig() {
        return radius >= Ball.DEFAULT_RADIUS && growing();
    }

    private int switchDirection() {
        return growing() ? SHRINK : GROW;
    }

    private int next() {
        return radius + (GROWTH_RATE * growthDirection);
    }

    private boolean shrinking() {
        return growthDirection == SHRINK;
    }

    private boolean growing() {
        return growthDirection == GROW;
    }
}
