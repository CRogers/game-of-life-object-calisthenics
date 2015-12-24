public class Game {
    private boolean rolled = false;

    public void roll(int pins) {
        rolled = true;
    }

    public int score() {
        if (rolled) {
            return 1;
        }
        return 0;
    }
}
