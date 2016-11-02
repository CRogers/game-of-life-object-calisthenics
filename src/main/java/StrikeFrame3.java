public class StrikeFrame3 implements Frame {
    private final Score score;

    public StrikeFrame3(Score score) {
        this.score = score;
    }

    @Override
    public Frame roll(Score pins) {
        return new ConstantFrame(score().add(pins));
    }

    @Override
    public Score score() {
        return score;
    }
}
