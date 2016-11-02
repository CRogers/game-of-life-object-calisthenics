public class SimpleFrame2 implements ImmutableFrame {
    private final FrameCreator frameCreator;
    private final Score score;

    public SimpleFrame2(FrameCreator frameCreator, Score score) {
        this.frameCreator = frameCreator;
        this.score = score;
    }

    @Override
    public ImmutableFrame roll(Score pins) {
        frameCreator.newFrame();
        return new ConstantFrame(score.add(pins));
    }

    @Override
    public Score score() {
        return score;
    }
}
