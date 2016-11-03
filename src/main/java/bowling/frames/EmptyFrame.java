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
            frameCreator.newEmptyFrame();
            return AddNextRollsFrame.strike();
        }

        return new NormalRollFrame(frameCreator, pins);
    }
    // X.
    // 1/
    // 11

    // XXX
    // XX1
    // X1/
    // X11
    // 111
    // 1/X
    // 1/1

    @Override
    public Score score() {
        return Score.zero();
    }
}
