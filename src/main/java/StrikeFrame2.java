public class StrikeFrame2 implements Frame {
    private final Score score;

    public StrikeFrame2(Score score) {
        this.score = score;
    }

    @Override
    public Frame roll(Score pins) {
        return new StrikeFrame3(score().add(pins));
    }

    @Override
    public Score score() {
        return score;
    }
}
