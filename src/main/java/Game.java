public class Game {
    private int score = 0;
    private boolean struck;

    public void roll(int pins) {
        if (pins == 10) {
            struck = true;
        } else if (struck) {
            score += pins;
            struck = false;
        }

        score += pins;
    }

    public int score() {
        return score;
    }
}
