package bowling;

import org.immutables.value.Value;

@Value.Immutable
public abstract class FramesLeft {
    @Value.Parameter protected abstract int framesLeft();

    public static FramesLeft ten() {
        return ImmutableFramesLeft.of(10);
    }

    public static FramesLeft one() {
        return ImmutableFramesLeft.of(1);
    }

    public FramesLeft oneLess() {
        return ImmutableFramesLeft.of(framesLeft() - 1);
    }
}
