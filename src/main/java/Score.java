import org.immutables.value.Value;

@Value.Immutable
public abstract class Score {
    @Value.Parameter protected abstract int score();

    public Score add(Score other) {
        return of(score() + other.score());
    }
    public static Score of(int score) {
        return ImmutableScore.of(score);
    }

    public static Score zero() {
        return of(0);
    }

    public ImmutableFrame toFrame(FrameCreator frameCreator) {
        if (score() == 10) {
            frameCreator.newFrame();
            return StrikeFrame.strike();
        }

        return new SimpleFrame1(frameCreator, this);
    }

    public static Score ten() {
        return of(10);
    }
}
