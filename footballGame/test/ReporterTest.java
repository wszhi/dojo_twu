import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ReporterTest {
    @Test
    public void shouldNotRectWhenNoTeamScores() throws Exception {
        assertNull(new Reporter().react(null));
    }

    @Test
    public void shouldShowWelcomeMessageWhenTheGameStart() throws Exception {
        Reporter reporter = new Reporter();
        assertEquals("Welcome to the football game!",reporter.startGame());

    }

    @Test
    public void shouldAnnounceTeamAGoalWhenTeamAScores() throws Exception {
        Reporter reporter = new Reporter();
        assertEquals("Goooooal! Team A",reporter.react("Team A"));

    }

    @Test
    public void shouldAnnounceTeamBGoalWhenTeamBScores() throws Exception {
        Reporter reporter = new Reporter();
        assertEquals("Goooooal! Team B",reporter.react("Team B"));
    }
}
