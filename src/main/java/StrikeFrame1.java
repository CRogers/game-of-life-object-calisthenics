public class StrikeFrame1 implements Frame {
    @Override
    public Frame roll(Score pins) {
        return new StrikeFrame2(Score.ten().add(pins));
    }

    @Override
    public Score score() {
        return Score.ten();
    }
}
