
public class Fan implements Spectator{

    private String teamSupport;

    public Fan(String teamSupport) {

        this.teamSupport = teamSupport;
    }

    @Override
    public String react(String teamName) {
        if (teamName == null){
            return null;
        }
        if(teamName.equals(teamSupport)) {
            return "Hooray!";
        }
        else {
            return "Boooo!";
        }
    }
}
