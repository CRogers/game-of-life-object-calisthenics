package bowling;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Score {
    @Value.Parameter protected abstract int score();

    public Score add(Score other) {
        return of(score() + other.score());
    }
    public static Score of(int score) {
        return ImmutableScore.of(score);
    }

    public static Score zero() {
        return of(0);
    }

    public static Score ten() {
        return of(10);
    }

    public Score limitedBy(Score maxScore) {
        return of(Math.min(score(), maxScore.score()));
    }
}
