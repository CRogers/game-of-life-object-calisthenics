package bowling.frames;

import bowling.Score;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FinalEmptyFrameShould {
    private final Frame finalFrame = FinalEmptyFrame.finalEmptyFrame();

    @Test
    public void three_strikes_is_30() {
        finalFrame.roll(Score.ten());
        finalFrame.roll(Score.ten());
        finalFrame.roll(Score.ten());
        assertThat(finalFrame.score()).isEqualTo(Score.of(30));
    }

    @Test
    public void a_strike_then_a_4_is_18() {
        finalFrame.roll(Score.ten());
        finalFrame.roll(Score.of(4));
        assertThat(finalFrame.score()).isEqualTo(Score.of(18));
    }

    @Test
    public void a_4_then_a_2_is_6() {
        finalFrame.roll(Score.of(4));
        finalFrame.roll(Score.of(2));
        assertThat(finalFrame.score()).isEqualTo(Score.of(6));
    }

    @Test
    public void a_strike_then_a_spare_is_30() {
        finalFrame.roll(Score.of(10));
        finalFrame.roll(Score.of(5));
        finalFrame.roll(Score.of(5));
        assertThat(finalFrame.score()).isEqualTo(Score.of(30));
    }
}