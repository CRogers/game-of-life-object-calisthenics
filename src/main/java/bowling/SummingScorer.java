package bowling;

public class SummingScorer implements Scorer {
    private Score score = Score.zero();

    @Override
    public void score(Score newScore) {
        this.score = this.score.add(newScore);
    }

    public Score totalScore() {
        return score;
    }
}
