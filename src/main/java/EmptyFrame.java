public class EmptyFrame implements Frame {
    private final FrameCreator frameCreator;

    public EmptyFrame(FrameCreator frameCreator) {
        this.frameCreator = frameCreator;
    }

    @Override
    public Frame roll(Score pins) {
        return pins.toFrame(frameCreator);
    }

    @Override
    public Score score() {
        return Score.zero();
    }
}
