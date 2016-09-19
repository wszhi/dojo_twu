package rover;

public enum Directions {
    N {
        public Position changePostion(Position position) {
            position.setY(position.getY() + 1);
            return position;
        }

        public Directions turnRight() {
            return Directions.E;
        }

        public Directions turnLeft() {
            return Directions.W;
        }
    },
    E {
        public Position changePostion(Position position) {
            position.setX(position.getX() + 1);
            return position;
        }

        public Directions turnRight() {
            return Directions.S;
        }

        public Directions turnLeft() {
            return Directions.N;
        }
    },
    S {
        public Position changePostion(Position position) {
            position.setY(position.getY() - 1);
            return position;
        }

        public Directions turnRight() {
            return Directions.W;
        }

        public Directions turnLeft() {
            return Directions.E;
        }
    },
    W {
        public Position changePostion(Position position) {
            position.setX(position.getX() - 1);
            return position;
        }

        public Directions turnRight() {
            return Directions.N;
        }

        public Directions turnLeft() {
            return Directions.S;
        }
    };

    public abstract Position changePostion(Position coordinates);

    public abstract Directions turnRight();

    public abstract Directions turnLeft();
}
