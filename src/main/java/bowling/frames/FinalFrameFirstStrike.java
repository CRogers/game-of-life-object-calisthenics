package bowling.frames;

import bowling.FrameCreator;
import bowling.Score;

public class FinalFrameFirstStrike implements Frame {
    private final FrameCreator frameCreator;

    public FinalFrameFirstStrike(FrameCreator frameCreator) {
        this.frameCreator = frameCreator;
    }

    @Override
    public Frame roll(Score pinsScored) {
        if (pinsScored.equals(Score.ten())) {
            frameCreator.newFrame(new FinalFrameSecondStrike());
            return AddNextRollsFrame.strike();
        }
        return new NormalRollFrame(() -> {}, pinsScored);
    }

    @Override
    public Score score() {
        return Score.ten();
    }
}
