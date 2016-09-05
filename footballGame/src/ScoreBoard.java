
public class ScoreBoard implements Spectator {
    private String teamA;
    private String teamB;
    private int teamAScore;
    private int teamBScore;

    public ScoreBoard(String teamA, String teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
        teamAScore = 0;
        teamBScore = 0;
    }

    @Override
    public String react(String teamName) {
        if (teamName == null) {
            return null;
        } else if (teamName.equals(teamA)) {
            teamAScore++;
        } else if (teamName.equals(teamB)) {
            teamBScore++;
        }
        return teamAScore+":"+teamBScore;
    }
}
