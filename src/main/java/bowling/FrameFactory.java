package bowling;

import bowling.frames.Frame;

import java.util.function.Supplier;

public interface FrameFactory extends Supplier<Frame> {}
