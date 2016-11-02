public class Game {
    private Score score = Score.zero();

    public void roll(int pins) {
        score = score.add(Score.of(pins));
    }

    public Score score() {
        return score;
    }
}
