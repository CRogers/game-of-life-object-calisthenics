public class Game {
    private Frames frames = Frames.empty();
    private final FrameFactory frameFactory = new EmptyFrameFactory(this::addEmptyFrame);

    public Game() {
        addEmptyFrame();
    }

    private void addEmptyFrame() {
        Frame newEmptyFrame = frameFactory.get();
        frames.addFrame(newEmptyFrame);
    }

    public void roll(int pins) {
        Score pinsScore = Score.of(pins);

        frames.roll(pinsScore);
    }

    public Score score() {
        return frames.score();
    }
}
