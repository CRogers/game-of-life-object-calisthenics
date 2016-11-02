public class StrikeFrame1 implements ImmutableFrame {
    private final FrameCreator frameCreator;

    public StrikeFrame1(FrameCreator frameCreator) {
        this.frameCreator = frameCreator;
    }

    @Override
    public ImmutableFrame roll(Score pins) {
        frameCreator.newFrame();
        return new StrikeFrame2(Score.ten()
            .add(pins));
    }

    @Override
    public Score score() {
        return Score.ten();
    }
}
