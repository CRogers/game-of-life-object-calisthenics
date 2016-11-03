package bowling;

import bowling.frames.EmptyFrame;
import bowling.frames.FinalEmptyFrame;
import bowling.frames.Frame;

public class EmptyFrameFactory implements FrameFactory {
    private FramesLeft framesLeft = FramesLeft.ten();
    private final FrameCreator frameCreator;

    public EmptyFrameFactory(FrameCreator frameCreator) {
        this.frameCreator = frameCreator;
    }

    @Override
    public Frame get() {
        if (framesLeft.equals(FramesLeft.one())) {
            return FinalEmptyFrame.finalEmptyFrame();
        }

        framesLeft = framesLeft.oneLess();

        return new EmptyFrame(() -> frameCreator.newFrame(get()));
    }
}
