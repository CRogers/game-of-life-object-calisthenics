public class EmptyFrame implements Frame {
    @Override
    public Frame nextRoll(Score pins) {
        return new SimpleFrame1(pins);
    }

    @Override
    public Score score() {
        return Score.zero();
    }
}
