package ball.model;

import ball.Ball;

import java.util.ArrayList;
import java.util.List;

public class BallFactory {

    public static Ball[] all() {
        return new Ball[]{
                bouncingBall(75, 50, Bouncing.DOWN),
                elasticBall(250, 100, Ball.DEFAULT_RADIUS, Elastic.SHRINK),
                bouncingElasticBall(300, 100, Ball.DEFAULT_RADIUS, Elastic.SHRINK),
                bouncingElasticSlideBall(450,100,Ball.DEFAULT_RADIUS,Slide.RIGHT)
                // bouncingElasticBall() --> Let's make a new ball!
        };
    }

    public static Ball bouncingBall(int centerX, int centerY, int direction) {
        Behavior behavior = new Bouncing(centerX, centerY, direction, Ball.DEFAULT_RADIUS);
        List<Behavior> behaviorList = new ArrayList<Behavior>();
        behaviorList.add(behavior);
        return new BallImpl(centerX, centerY, behaviorList);
    }

    public static Ball elasticBall(int centerX, int centerY, int radius, int direction) {
        Behavior behavior = new Elastic(direction, radius);
        List<Behavior> behaviorList = new ArrayList<Behavior>();
        behaviorList.add(behavior);
        return new BallImpl(centerX, centerY, radius, behaviorList);
    }

    public static Ball bouncingElasticBall(int centerX, int centerY, int radius, int direction){
        Behavior bouncing = new Bouncing(centerX, centerY, direction, Ball.DEFAULT_RADIUS);
        Behavior elastic = new Elastic(direction, radius);

        List<Behavior> behaviorList = new ArrayList<Behavior>();
        behaviorList.add(bouncing);
        behaviorList.add(elastic);
        return new BallImpl(centerX, centerY, radius, behaviorList);

    }

    public static Ball bouncingElasticSlideBall(int centerX, int centerY, int radius, int direction){
        Behavior bouncing = new Bouncing(centerX, centerY, direction, Ball.DEFAULT_RADIUS);
        Behavior slide = new Slide(centerX,centerY,direction,Ball.DEFAULT_RADIUS);
        Behavior elastic = new Elastic(direction, radius);

        List<Behavior> behaviorList = new ArrayList<Behavior>();
        behaviorList.add(bouncing);
        behaviorList.add(slide);
        behaviorList.add(elastic);
        return new BallImpl(centerX, centerY, radius, behaviorList);

    }
}
