import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GameShould {
    private Game game = new Game();

    @Test
    public void start_off_with_a_score_of_0() {
        scoreShouldBe(0);
    }

    @Test
    public void have_a_score_of_1_after_rolling_a_1() {
        game.roll(1);
        scoreShouldBe(1);
    }

    @Test
    public void have_a_score_of_2_after_rolling_a_2() {
        game.roll(2);
        scoreShouldBe(2);
    }

    private void scoreShouldBe(int score) {
        assertThat(game.score(), is(score));
    }
}
