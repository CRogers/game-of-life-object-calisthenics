import com.google.common.collect.ImmutableList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class GameShould {
    private static final int STRIKE = 10;
    private static final List<Integer> SPARE = ImmutableList.of(5, 5);

    private final Game game = new Game();

    private final List<Integer> rolls;
    private final int finalScore;

    @Parameterized.Parameters(name = "rolling {0} scores {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { rolls(), 0 },
            { rolls(1), 1 },
            { rolls(2, 5), 7 },
            { rolls(2, 4, 7), 13 },
            { rolls(2, 4, 7, 2), 15 },
            { rolls(STRIKE), 10 },
            { rolls(STRIKE, 1), 12 },
            { rolls(STRIKE, 1, 3), 18 },
            { rolls(SPARE), 10 },
            { rolls(SPARE, 2), 14 },
            { rolls(SPARE, 2, 3), 17 },
            { rolls(Stream.generate(() -> STRIKE).limit(12).collect(toList())), 300 },

        });
    }

    public GameShould(List<Integer> rolls, int finalScore) {
        this.rolls = rolls;
        this.finalScore = finalScore;
    }

    @Test
    public void test_that_() {
        rolls.forEach(game::roll);
        assertThat(game.score()).isEqualTo(Score.of(finalScore));
    }

    private static List<Integer> rolls(Object... rolls) {
        return Arrays.asList(rolls).stream()
            .flatMap(obj -> {
                if (obj instanceof List) {
                    return ((List<Integer>) obj).stream();
                }
                return Stream.of((Integer) obj);
            }).collect(toList());
    }

}
