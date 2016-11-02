package bowling.frames;

import bowling.Score;

public interface Frame {
    Frame roll(Score pinsScored);
    Score score();
}
