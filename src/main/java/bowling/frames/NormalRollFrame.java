package bowling.frames;

import bowling.FrameCreator;
import bowling.Score;

public class NormalRollFrame implements Frame {
    private final FrameCreator frameCreator;
    private final Score score;

    public NormalRollFrame(FrameCreator frameCreator, Score score) {
        this.frameCreator = frameCreator;
        this.score = score;
    }

    @Override
    public Frame roll(Score pins) {
        frameCreator.newFrame();

        Score newScore = score.add(pins);
        if (newScore.equals(Score.ten())) {
            return AddNextRollsFrame.spare();
        }

        return new ConstantFrame(score.add(pins));
    }

    @Override
    public Score score() {
        return score;
    }
}
