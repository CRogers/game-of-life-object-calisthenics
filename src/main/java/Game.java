public class Game {
    private Frames frames = Frames.empty();

    public void roll(int pins) {
        Score pinsScore = Score.of(pins);

        frames.roll(pinsScore);
    }

    public Score score() {
        return frames.score();
    }
}
