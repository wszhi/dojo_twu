
public class Game {
    final Reporter reporter;
    Fan fanA;
    Fan fanB;
    final String teamA;
    final String teamB;
    final ScoreBoard scoreBoard;


    public Game(Reporter reporter, String teamA, String teamB, Fan fanA, Fan fanB, ScoreBoard scoreBoard) {
        this.reporter = reporter;
        this.teamA = teamA;
        this.teamB = teamB;
        this.fanA = fanA;
        this.fanB = fanB;
        this.scoreBoard = scoreBoard;
    }


    public void goalIsScored(String teamName) {
        reporter.react(teamName);
        fanA.react(teamName);
        fanB.react(teamName);
        scoreBoard.react(teamName);
    }
}
