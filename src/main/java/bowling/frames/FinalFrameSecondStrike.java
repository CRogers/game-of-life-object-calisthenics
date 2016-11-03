package bowling.frames;

import bowling.Score;

public class FinalFrameSecondStrike implements Frame {
    @Override
    public Frame roll(Score pinsScored) {
        return new ConstantFrame(Score.ten().add(pinsScored));
    }

    @Override
    public Score score() {
        return Score.ten();
    }
}
