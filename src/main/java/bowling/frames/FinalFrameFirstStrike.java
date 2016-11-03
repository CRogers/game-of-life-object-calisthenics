package bowling.frames;

import bowling.FrameBlah;
import bowling.Score;

public class FinalFrameFirstStrike implements Frame {
    private final FrameBlah frameBlah;

    public FinalFrameFirstStrike(FrameBlah frameBlah) {
        this.frameBlah = frameBlah;
    }

    @Override
    public Frame roll(Score pinsScored) {
        if (pinsScored.equals(Score.ten())) {
            frameBlah.newFrame(new FinalFrameSecondStrike());
            return AddNextRollsFrame.strike();
        }
        return new NormalRollFrame(() -> {}, pinsScored);
    }

    @Override
    public Score score() {
        return Score.ten();
    }
}
