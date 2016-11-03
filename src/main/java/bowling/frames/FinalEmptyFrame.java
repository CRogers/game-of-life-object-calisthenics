package bowling.frames;

import bowling.FrameCreator;
import bowling.Score;

public class FinalEmptyFrame implements Frame {
    private final FrameCreator frameCreator;

    public FinalEmptyFrame(FrameCreator frameCreator) {
        this.frameCreator = frameCreator;
    }

    @Override
    public Frame roll(Score pinsScored) {
        if (pinsScored.equals(Score.ten())) {
            frameCreator.newEmptyFrame();
            return AddNextRollsFrame.strike();
        }
        return new ConstantFrame(Score.zero());
    }

    @Override
    public Score score() {
        return Score.zero();
    }
}
