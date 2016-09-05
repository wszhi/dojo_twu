import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class FanTest {
    String teamA = "Team A";
    String teamB = "Team B";
    Fan fanA;
    Fan fanB;

    @Before
    public void setUp() throws Exception {
        fanA = new Fan(teamA);
        fanB = new Fan(teamB);
    }

    @Test
    public void shouldNotRectWhenNoTeamGoals() throws Exception {
        assertNull(fanA.react(null));
    }

    @Test
    public void shouldFanARectPositiveToTeamAGoals() throws Exception {
        assertEquals("Hooray!", fanA.react(teamA));
    }

    @Test
    public void shouldFanARectNegativeToTeanBGoals() throws Exception {
        assertEquals("Boooo!", fanA.react(teamB));
    }

    @Test
    public void shouldFanBRectPositiveToTeamBGoals() throws Exception {
        assertEquals("Hooray!", fanB.react(teamB));
    }

    @Test
    public void shouldFanBRectNegativeToTeanAGoals() throws Exception {
        assertEquals("Boooo!", fanB.react(teamA));
    }
}
