package ball.model;

import ball.Ball;

import java.awt.*;
import java.util.Collection;

public class BallImpl implements Ball {
    protected int x;
    protected int y;
    protected int radius;
    private Collection<Behavior> behaviors;


    protected BallImpl(int x, int y, int radius, Collection<Behavior> behaviors) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.behaviors = behaviors;
    }

    protected BallImpl(int x, int y, Collection<Behavior> behaviors) {
        this(x, y, DEFAULT_RADIUS, behaviors);
    }

    // DO NOT CHANGE
    @Override
    public int radius() {
        return radius;
    }

    // DO NOT CHANGE
    @Override
    public Point center() {
        return new Point(x, y);
    }

    public void update(){
        for (Behavior behavior: behaviors ) {
            behavior.action(this);
        }
    }
}
