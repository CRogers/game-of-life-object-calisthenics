import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import one.util.streamex.StreamEx;

import java.util.List;

public class Frames {
    private List<Frame> frames = Lists.newArrayList();

    public static Frames empty() {
        return new Frames();
    }

    public void roll(Score pinsScored) {
        ImmutableList.copyOf(frames)
            .forEach(frame -> frame.roll(pinsScored));
    }

    public Score score() {
        return StreamEx.of(frames)
            .foldLeft(Score.zero(), (score, frame) -> score.add(frame.score()));
    }

    public void addFrame(Frame frame) {
        frames.add(frame);
    }
}
