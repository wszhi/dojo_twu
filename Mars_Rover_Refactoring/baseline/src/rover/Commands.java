package rover;

public enum Commands {
    L{
        public void chooseCommands(MarsRover marsRover){
            marsRover.turnLeft();
        }
    },
    R{
        public void chooseCommands(MarsRover marsRover){
            marsRover.turnRight();
        }
    },
    M{
        public void chooseCommands(MarsRover marsRover){
            marsRover.move();
        }
    };

    public abstract void chooseCommands(MarsRover marsRover);

}
