package bowling.frames;

import bowling.RollsLeft;
import bowling.Score;
import bowling.Scorer;

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

    public static Frame justNext() {
        return new AddNextRollsFrame(
            RollsLeft.one(),
            Score.zero()
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
    public void score(Scorer scorer) {
        scorer.score(score);
    }
}
