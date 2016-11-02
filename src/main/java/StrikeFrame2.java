public class StrikeFrame2 implements ImmutableFrame {
    private final Score score;

    public StrikeFrame2(Score score) {
        this.score = score;
    }

    @Override
    public ImmutableFrame roll(Score pins) {
        return new StrikeFrame3(score().add(pins));
    }

    @Override
    public Score score() {
        return score;
    }
}
