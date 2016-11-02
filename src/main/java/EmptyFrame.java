public class EmptyFrame implements ImmutableFrame {
    private final FrameCreator frameCreator;

    public EmptyFrame(FrameCreator frameCreator) {
        this.frameCreator = frameCreator;
    }

    @Override
    public ImmutableFrame roll(Score pins) {
        return pins.toFrame(frameCreator);
    }

    @Override
    public Score score() {
        return Score.zero();
    }
}
