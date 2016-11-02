public class AddNextRollsFrame implements ImmutableFrame {
    private final RollsLeft rollsLeft;
    private final Score score;

    private AddNextRollsFrame(RollsLeft rollsLeft, Score score) {
        this.rollsLeft = rollsLeft;
        this.score = score;
    }

    public static ImmutableFrame strike() {
        return new AddNextRollsFrame(
            RollsLeft.two(),
            Score.ten()
        );
    }

    public static ImmutableFrame spare() {
        return new AddNextRollsFrame(
            RollsLeft.one(),
            Score.ten()
        );
    }

    @Override
    public ImmutableFrame roll(Score pins) {
        return new AddNextRollsFrame(
            rollsLeft.oneLess(),
            rollsLeft.addToScoreIfRollsLeft(score, pins)
        );
    }

    @Override
    public Score score() {
        return score;
    }
}
