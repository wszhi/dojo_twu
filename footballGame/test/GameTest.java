import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameTest {
    @Mock
    Reporter reporter;
    @Mock
    Fan fanA;
    @Mock
    Fan fanB;
    @Mock
    ScoreBoard scoreBoard;

    Game game;
    String teamA;
    String teamB;

    @Before
    public void setUp() throws Exception {
        teamA = "Team A";
        teamB = "Team B";
        reporter = mock(Reporter.class);
        scoreBoard = mock(ScoreBoard.class);
        fanA = mock(Fan.class);
        fanB = mock(Fan.class);
        game = new Game(reporter, teamA, teamB,fanA,fanB,scoreBoard);
    }

    @Test
    public void shouldHaveTeamAFans() throws Exception {
        game.goalIsScored(teamA);
        verify(fanA).react(teamA);
        verify(reporter).react(teamA);
        verify(fanA).react(teamA);
        verify(fanB).react(teamA);
        verify(scoreBoard).react(teamA);
    }
}
