import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class GameShould {
    private static final int STRIKE = 10;

    private final Game game = new Game();

    private final List<Integer> rolls;
    private final int finalScore;

    @Parameterized.Parameters(name = "rolling {0} scores {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { rolls(), 0 },
            { rolls(1), 1 },
            { rolls(2, 5), 7 },
            { rolls(STRIKE), 10 },
            { rolls(STRIKE, 1), 12 },
        });
    }

    public GameShould(List<Integer> rolls, int finalScore) {
        this.rolls = rolls;
        this.finalScore = finalScore;
    }

    @Test
    public void test_that_() {
        rolls.forEach(game::roll);
        assertThat(game.score()).isEqualTo(finalScore);
    }

    private static List<Integer> rolls(Integer... rolls) {
        return Arrays.asList(rolls);
    }

}
