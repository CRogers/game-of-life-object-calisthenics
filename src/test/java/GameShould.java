import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameShould {
    private Game game = new Game();

    @Test
    public void start_off_with_a_score_of_0() {
        scoreShouldBe(0);
    }

    private void scoreShouldBe(int score) {
        assertThat(game.score()).isEqualTo(score);
    }
}
