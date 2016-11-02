public class ConstantFrame implements Frame {
    private final Score score;

    public ConstantFrame(Score score) {
        this.score = score;
    }

    @Override
    public Frame nextRoll(Score pins) {
        return this;
    }

    @Override
    public Score score() {
        return score;
    }
}