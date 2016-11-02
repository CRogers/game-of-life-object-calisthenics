public class Game {
    private Frame frame = new EmptyFrame();

    public void roll(int pins) {
        Score pinsScore = Score.of(pins);

        frame = frame.nextRoll(pinsScore);
    }

    public Score score() {
        return frame.score();
    }
}
