
public class Reporter implements Spectator {

    public String startGame() {
        return "Welcome to the football game!";
    }

    @Override
    public String react(String teamName) {
        if (teamName == null)
            return null;
        return "Goooooal! "+teamName;
    }
}
