import org.immutables.value.Value;

@Value.Immutable
public abstract class RollsLeft {
    @Value.Parameter protected abstract int rollsLeft();

    public static RollsLeft two() {
        return ImmutableRollsLeft.of(2);
    }

    public RollsLeft oneLess() {
        return ImmutableRollsLeft.of(rollsLeft() - 1);
    }

    public Score addToScoreIfRollsLeft(Score score, Score pins) {
        if (rollsLeft() >= 0) {
            return score.add(pins);
        }
        return score;
    }
}
