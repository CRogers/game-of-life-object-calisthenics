package bowling;

import bowling.frames.ConstantFrame;
import bowling.frames.EmptyFrame;
import bowling.frames.Frame;

public class EmptyFrameFactory implements FrameFactory {
    private int framesLeft = 10;
    private final FrameCreator frameCreator;

    public EmptyFrameFactory(FrameCreator frameCreator) {
        this.frameCreator = frameCreator;
    }

    @Override
    public Frame get() {
        if (framesLeft <= 0) {
            return new ConstantFrame(Score.zero());
        }

        return new EmptyFrame(frameCreator);
    }
}
