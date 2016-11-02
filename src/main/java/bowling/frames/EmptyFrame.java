package bowling.frames;

import bowling.FrameCreator;
import bowling.Score;

public class EmptyFrame implements Frame {
    private final FrameCreator frameCreator;

    public EmptyFrame(FrameCreator frameCreator) {
        this.frameCreator = frameCreator;
    }

    @Override
    public Frame roll(Score pins) {
        boolean isStrike = pins.equals(Score.ten());
        if (isStrike) {
            frameCreator.newFrame();
            return AddNextRollsFrame.strike();
        }

        return new NormalRollFrame(frameCreator, pins);
    }

    @Override
    public Score score() {
        return Score.zero();
    }
}
