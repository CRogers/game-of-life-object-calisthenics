package bowling.frames;

import bowling.Score;

public class FinalFrameFirstStrike implements Frame {
    @Override
    public Frame roll(Score pinsScored) {
        if (pinsScored.equals(Score.ten())) {
            return new FinalFrameSecondStrike();
        }
        return null;
    }

    @Override
    public Score score() {
        return null;
    }
}
