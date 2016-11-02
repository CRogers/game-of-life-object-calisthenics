import one.util.streamex.StreamEx;
import org.immutables.value.Value;

import java.util.List;
import java.util.stream.Collectors;

@Value.Immutable
public abstract class Frames {
    @Value.Parameter protected abstract List<Frame> frames();

    public static Frames empty() {
        return ImmutableFrames.builder()
            .addFrames(new EmptyFrame())
            .build();
    }

    public Frames roll(Score pinsScored) {
        List<Frame> newFrames = frames().stream()
            .map(frame -> frame.roll(pinsScored))
            .collect(Collectors.toList());

        return ImmutableFrames.of(newFrames);
    }

    public Score score() {
        return StreamEx.of(frames())
            .foldLeft(Score.zero(), (score, frame) -> score.add(frame.score()));
    }

    public Frames addEmptyFrame() {
        return ImmutableFrames.builder()
            .from(this)
            .addFrames(new EmptyFrame())
            .build();
    }
}
