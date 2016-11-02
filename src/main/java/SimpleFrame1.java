public class SimpleFrame1 implements Frame {
    private final Score score;

    public SimpleFrame1(Score score) {
        this.score = score;
    }

    @Override
    public Frame roll(Score pins) {
        return new ConstantFrame(score.add(pins));
    }

    @Override
    public Score score() {
        return score;
    }
}
