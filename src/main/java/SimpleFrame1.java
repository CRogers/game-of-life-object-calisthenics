public class SimpleFrame1 implements ImmutableFrame {
    private final FrameCreator frameCreator;
    private final Score score;

    public SimpleFrame1(FrameCreator frameCreator, Score score) {
        this.frameCreator = frameCreator;
        this.score = score;
    }

    @Override
    public ImmutableFrame roll(Score pins) {
        return new SimpleFrame2(frameCreator, score.add(pins));
    }

    @Override
    public Score score() {
        return score;
    }
}
