package bowling.frames;

import bowling.EmptyFrameCreator;
import bowling.Score;
import bowling.Scorer;

public class NormalRollFrame implements Frame {
    private final EmptyFrameCreator emptyFrameCreator;
    private final Score score;

    public NormalRollFrame(EmptyFrameCreator emptyFrameCreator, Score score) {
        this.emptyFrameCreator = emptyFrameCreator;
        this.score = score;
    }

    @Override
    public Frame roll(Score pins) {
        emptyFrameCreator.newEmptyFrame();

        Score newScore = score.add(pins);
        if (newScore.equals(Score.ten())) {
            return AddNextRollsFrame.spare();
        }

        return new ConstantFrame(newScore);
    }

    @Override
    public void score(Scorer scorer) {
        scorer.score(score);
    }
}
