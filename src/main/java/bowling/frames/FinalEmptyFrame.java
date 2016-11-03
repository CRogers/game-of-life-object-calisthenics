package bowling.frames;

import bowling.FrameCreator;
import bowling.Score;

public class FinalEmptyFrame implements Frame {
    private final FrameCreator frameCreator;

    private FinalEmptyFrame(FrameCreator frameCreator) {
        this.frameCreator = frameCreator;
    }

    public static Frame finalEmptyFrame() {
        MultiFrame finalFrames = new MultiFrame();
        finalFrames.addFrame(new FinalEmptyFrame(finalFrames::addFrame));
        return new MaxScoreFrame(Score.of(30), finalFrames);
    }

    @Override
    public Frame roll(Score pinsScored) {
        if (pinsScored.equals(Score.ten())) {
            frameCreator.newFrame(new FinalFrameFirstStrike(frameCreator));
            return AddNextRollsFrame.strike();
        }
        return new NormalRollFrame(() -> frameCreator.newFrame(AddNextRollsFrame.justNext()), pinsScored);
    }

    @Override
    public Score score() {
        return Score.zero();
    }
}
