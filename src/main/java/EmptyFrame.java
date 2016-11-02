public class EmptyFrame implements ImmutableFrame {
    private final FrameCreator frameCreator;

    public EmptyFrame(FrameCreator frameCreator) {
        this.frameCreator = frameCreator;
    }

    @Override
    public ImmutableFrame roll(Score pins) {
        boolean isStrike = pins.equals(Score.ten());
        if (isStrike) {
            frameCreator.newFrame();
            return AddNextRollsFrame.strike();
        }

        return new NormalRoleFrame(frameCreator, pins);
    }

    @Override
    public Score score() {
        return Score.zero();
    }
}
