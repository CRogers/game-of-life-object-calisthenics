public class ConstantFrame implements ImmutableFrame {
    private final Score score;

    public ConstantFrame(Score score) {
        this.score = score;
    }

    @Override
    public ImmutableFrame roll(Score pins) {
        return this;
    }

    @Override
    public Score score() {
        return score;
    }
}
