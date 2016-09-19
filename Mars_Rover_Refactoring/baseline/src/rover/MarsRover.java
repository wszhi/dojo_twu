package rover;

public class MarsRover {
    private Directions direction;
    private Position position;

    public MarsRover(int startingX, int startingY, String direction) {
        this.position = new Position(startingX, startingY);
        this.direction = Directions.valueOf(direction);
    }

    public String run(String input) {
        String[] commands = input.split("(?!^)");

        for (String command : commands) {
            validateCommands(command,input);
            Commands.valueOf(command).chooseCommands(this);
        }

        return asString();
    }

    private void validateCommands(String command,String input) {
        if(Commands.valueOf(command) == null){
            throw new IllegalArgumentException("Invalid command sequence: " + input);
        }
    }

    private String asString() {
        return position.toString()+ direction;
    }

    public void move() {
        position = direction.changePostion(position);
    }

    public void turnRight(){
        direction = direction.turnRight();
    }

    public void turnLeft(){
        direction = direction.turnLeft();
    }
}
