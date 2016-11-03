package bowling.frames;

import bowling.Score;

public class MaxScoreFrame implements Frame {
    private final Score maxScore;
    private final Frame frame;

    public MaxScoreFrame(Score maxScore, Frame frame) {
        this.maxScore = maxScore;
        this.frame = frame;
    }

    @Override
    public Frame roll(Score pinsScored) {
        return new MaxScoreFrame(maxScore, frame.roll(pinsScored));
    }

    @Override
    public Score score() {
        return frame.score().limitedBy(maxScore);
    }
}
