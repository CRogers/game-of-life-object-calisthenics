package bowling.frames;

import bowling.FrameCreator;
import bowling.Score;
import bowling.Scorer;

public class FinalFrameFirstStrike implements Frame {
    private final FrameCreator frameCreator;

    public FinalFrameFirstStrike(FrameCreator frameCreator) {
        this.frameCreator = frameCreator;
    }

    @Override
    public Frame roll(Score pinsScored) {
        if (pinsScored.equals(Score.ten())) {
            frameCreator.newFrame(AddNextRollsFrame.justNext());
            return AddNextRollsFrame.strike();
        }
        return new NormalRollFrame(() -> {}, pinsScored);
    }

    @Override
    public void score(Scorer scorer) {
        scorer.score(Score.ten());
    }
}
