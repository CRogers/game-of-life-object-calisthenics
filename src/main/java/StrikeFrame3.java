public class StrikeFrame3 implements ImmutableFrame {
    private final Score score;

    public StrikeFrame3(Score score) {
        this.score = score;
    }

    @Override
    public ImmutableFrame roll(Score pins) {
        return new ConstantFrame(score().add(pins));
    }

    @Override
    public Score score() {
        return score;
    }
}
