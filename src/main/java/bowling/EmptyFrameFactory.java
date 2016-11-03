package bowling;

import bowling.frames.EmptyFrame;
import bowling.frames.FinalEmptyFrame;
import bowling.frames.Frame;

public class EmptyFrameFactory implements FrameFactory {
    private int framesLeft = 10;
    private final FrameBlah frameBlah;

    public EmptyFrameFactory(FrameBlah frameBlah) {
        this.frameBlah = frameBlah;
    }

    @Override
    public Frame get() {
        if (framesLeft <= 1) {
            return FinalEmptyFrame.finalEmptyFrame();
        }

        framesLeft--;

        return new EmptyFrame(() -> frameBlah.newFrame(get()));
    }
}
