import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ScoreBoardTest {
    private final String teamA = "Team A";
    private final String teamB = "Team B";
    private ScoreBoard scoreBoard;

    @Before
    public void setUp() throws Exception {
        scoreBoard = new ScoreBoard(teamA,teamB);
    }

    @Test
    public void scoreBoardShouldNotReactWhenNoTeamScores() throws Exception {
        assertNull(scoreBoard.react(null));
    }

    @Test
    public void scoreBoardShouldShowOneToZeroWhenTeamAScores() throws Exception {
        assertEquals("1:0",scoreBoard.react(teamA));
    }

    @Test
    public void scoreBoardShouldShowZeroToOneWhenTeamBScores() throws Exception {
        assertEquals("0:1",scoreBoard.react(teamB));
    }

    @Test
    public void scoreBoardShouldReactTwoToZeroWhenTeamAScoresTwice() throws Exception {
        scoreBoard.react(teamA);
        TestCase.assertEquals("2:0",scoreBoard.react(teamA));
    }
    @Test
    public void scoreBoardShouldReactZeroToTwoWhenTeamBScoresTwice() throws Exception {
        scoreBoard.react(teamB);
        TestCase.assertEquals("0:2",scoreBoard.react(teamB));
    }

    @Test
    public void scoreBoardShouldReactOneToOneWhenTeamAScoresAndTeamBScores() throws Exception {
        scoreBoard.react(teamA);
        TestCase.assertEquals("1:1",scoreBoard.react(teamB));
    }
}
