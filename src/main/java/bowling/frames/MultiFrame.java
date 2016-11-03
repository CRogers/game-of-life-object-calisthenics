package bowling.frames;

import bowling.Frames;
import bowling.Score;

public class MultiFrame implements Frame {
    private final Frames frames = Frames.empty();

    public void addFrame(Frame frame) {
        frames.addFrame(frame);
    }

    @Override
    public Frame roll(Score pinsScored) {
        frames.roll(pinsScored);
        return this;
    }

    @Override
    public Score score() {
        return frames.score();
    }
}
