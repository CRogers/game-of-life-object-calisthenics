package bowling.frames;

import bowling.Score;
import bowling.Scorer;

public interface Frame {
    Frame roll(Score pinsScored);
    void score(Scorer scorer);
}
