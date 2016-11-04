package bowling;

import bowling.frames.Frame;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

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
        SummingScorer summingScorer = new SummingScorer();
        frames.forEach(frame -> frame.score(summingScorer));
        return summingScorer.totalScore();
    }

    public void addFrame(Frame frame) {
        frames.add(frame);
    }
}
