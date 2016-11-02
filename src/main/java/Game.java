public class Game {
    private Frames frames = Frames.empty();
    private int rolls = 0;

    public void roll(int pins) {
        Score pinsScore = Score.of(pins);

        frames = frames.roll(pinsScore);

        rolls++;

        if (rolls % 2 == 0) {
            frames = frames.addEmptyFrame();
        }
    }

    public Score score() {
        return frames.score();
    }
}
