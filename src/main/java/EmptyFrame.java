public class EmptyFrame implements Frame {
    @Override
    public Frame roll(Score pins) {
        return pins.toFrame();
    }

    @Override
    public Score score() {
        return Score.zero();
    }
}
