public class AddNextRollsFrame implements Frame {
    private final RollsLeft rollsLeft;
    private final Score score;

    private AddNextRollsFrame(RollsLeft rollsLeft, Score score) {
        this.rollsLeft = rollsLeft;
        this.score = score;
    }

    public static Frame strike() {
        return new AddNextRollsFrame(
            RollsLeft.two(),
            Score.ten()
        );
    }

    public static Frame spare() {
        return new AddNextRollsFrame(
            RollsLeft.one(),
            Score.ten()
        );
    }

    @Override
    public Frame roll(Score pins) {
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
