public class StrikeFrame implements ImmutableFrame {
    private final RollsLeft rollsLeft;
    private final Score score;

    private StrikeFrame(RollsLeft rollsLeft, Score score) {
        this.rollsLeft = rollsLeft;
        this.score = score;
    }

    public static ImmutableFrame strike() {
        return new StrikeFrame(
            RollsLeft.two(),
            Score.ten()
        );
    }

    @Override
    public ImmutableFrame roll(Score pins) {
        return new StrikeFrame(
            rollsLeft.oneLess(),
            rollsLeft.addToScoreIfRollsLeft(score, pins)
        );
    }

    @Override
    public Score score() {
        return score;
    }
}
