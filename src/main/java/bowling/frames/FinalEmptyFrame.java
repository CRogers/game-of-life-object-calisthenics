package bowling.frames;

import bowling.FrameBlah;
import bowling.Score;

public class FinalEmptyFrame implements Frame {
    private final FrameBlah frameBlah;

    private FinalEmptyFrame(FrameBlah frameBlah) {
        this.frameBlah = frameBlah;
    }

    public static Frame finalEmptyFrame() {
        MultiFrame finalFrames = new MultiFrame();
        finalFrames.addFrame(new FinalEmptyFrame(finalFrames::addFrame));
        return new MaxScoreFrame(Score.of(30), finalFrames);
    }

    @Override
    public Frame roll(Score pinsScored) {
        if (pinsScored.equals(Score.ten())) {
            frameBlah.newFrame(new FinalFrameFirstStrike(frameBlah));
            return AddNextRollsFrame.strike();
        }
        return new NormalRollFrame(() -> frameBlah.newFrame(AddNextRollsFrame.justNext()), pinsScored);
    }

    @Override
    public Score score() {
        return Score.zero();
    }
}
