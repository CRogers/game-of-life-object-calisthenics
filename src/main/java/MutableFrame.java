public class MutableFrame implements Frame {
    private ImmutableFrame frame;

    public MutableFrame(ImmutableFrame frame) {
        this.frame = frame;
    }

    @Override
    public void roll(Score pins) {
        frame = frame.roll(pins);
    }

    @Override
    public Score score() {
        return frame.score();
    }
}
