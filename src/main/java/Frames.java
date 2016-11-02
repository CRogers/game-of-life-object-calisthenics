import com.google.common.collect.Lists;
import one.util.streamex.StreamEx;

import java.util.List;
import java.util.stream.Collectors;

public class Frames {
    private List<Frame> frames = Lists.newArrayList();

    private Frames() {
        frames.add(new EmptyFrame(this::addEmptyFrame));
    }

    public static Frames empty() {
        return new Frames();
    }

    public void roll(Score pinsScored) {
        frames = frames.stream()
            .map(frame -> {
                System.out.println(frame);return frame.roll(pinsScored); })
            .collect(Collectors.toList());
    }

    public Score score() {
        return StreamEx.of(frames)
            .foldLeft(Score.zero(), (score, frame) -> score.add(frame.score()));
    }

    public void addEmptyFrame() {
        frames.add(new EmptyFrame(this::addEmptyFrame));
    }
}
