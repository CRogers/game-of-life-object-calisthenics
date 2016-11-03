package bowling;

import bowling.frames.EmptyFrame;
import bowling.frames.FinalEmptyFrame;
import bowling.frames.Frame;

public class EmptyFrameFactory implements FrameFactory {
    private int framesLeft = 10;
    private final FrameCreator frameCreator;

    public EmptyFrameFactory(FrameCreator frameCreator) {
        this.frameCreator = frameCreator;
    }

    @Override
    public Frame get() {
        if (framesLeft <= 1) {
            return FinalEmptyFrame.finalEmptyFrame();
        }

        framesLeft--;

        return new EmptyFrame(() -> frameCreator.newFrame(get()));
    }
}
