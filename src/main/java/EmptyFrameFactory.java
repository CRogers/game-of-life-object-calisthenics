public class EmptyFrameFactory implements FrameFactory {
    private int framesLeft = 10;
    private final FrameCreator frameCreator;

    public EmptyFrameFactory(FrameCreator frameCreator) {
        this.frameCreator = frameCreator;
    }

    @Override
    public Frame get() {
        if (framesLeft <= 0) {
            return new MutableFrame(new ConstantFrame(Score.zero()));
        }

        return new MutableFrame(new EmptyFrame(frameCreator));
    }
}