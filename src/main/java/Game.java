public class Game {
    private int score = 0;

    public void roll(int pins) {
        if (score == 10) {
            score += pins;
        }
        score += pins;
    }

    public int score() {
        return score;
    }
}
