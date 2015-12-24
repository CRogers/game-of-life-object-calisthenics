import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GameShould {
    @Test
    public void start_off_with_a_score_of_0() {
        Game game = new Game();
        assertThat(game.score(), is(0));
    }
}
