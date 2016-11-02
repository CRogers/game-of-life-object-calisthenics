import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import one.util.streamex.StreamEx;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Frames {
    private List<Frame> frames = Lists.newArrayList();

    public static Frames empty() {
        return new Frames();
    }

    public void roll(Score pinsScored) {
        int numberOfFrames = frames.size();

        List<Frame> newFrames = ImmutableList.copyOf(frames)
            .stream()
            .map(frame -> frame.roll(pinsScored))
            .collect(toList());

        Stream<Frame> recentlyAddedFrames = frames.stream()
            .skip(numberOfFrames);

        frames = Stream.concat(
            newFrames.stream(),
            recentlyAddedFrames
        ).collect(toList());
    }

    public Score score() {
        return StreamEx.of(frames)
            .foldLeft(Score.zero(), (score, frame) -> score.add(frame.score()));
    }

    public void addFrame(Frame frame) {
        frames.add(frame);
    }
}
