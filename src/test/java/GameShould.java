import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

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

    private void scoreShouldBe(int score) {
        assertThat(game.score()).isEqualTo(score);
    }
}
