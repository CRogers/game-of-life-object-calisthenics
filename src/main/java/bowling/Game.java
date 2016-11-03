package bowling;

public class Game {
    private Frames frames = Frames.empty();

    public Game() {
        FrameFactory frameFactory = new EmptyFrameFactory(frames::addFrame);
        frames.addFrame(frameFactory.get());
    }

    public void roll(int pins) {
        Score pinsScore = Score.of(pins);

        frames.roll(pinsScore);
    }

    public Score score() {
        return frames.score();
    }
}
