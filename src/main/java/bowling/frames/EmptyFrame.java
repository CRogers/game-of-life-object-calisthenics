package bowling.frames;

import bowling.EmptyFrameCreator;
import bowling.Score;

public class EmptyFrame implements Frame {
    private final EmptyFrameCreator emptyFrameCreator;

    public EmptyFrame(EmptyFrameCreator emptyFrameCreator) {
        this.emptyFrameCreator = emptyFrameCreator;
    }

    @Override
    public Frame roll(Score pins) {
        boolean isStrike = pins.equals(Score.ten());
        if (isStrike) {
            emptyFrameCreator.newEmptyFrame();
            return AddNextRollsFrame.strike();
        }

        return new NormalRollFrame(emptyFrameCreator, pins);
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
