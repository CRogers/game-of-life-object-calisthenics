package bowling.frames;

import bowling.Score;
import bowling.Scorer;
import org.junit.After;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

public class FinalEmptyFrameShould {
    private final Frame finalFrame = FinalEmptyFrame.finalEmptyFrame();
    private final Scorer scorer = mock(Scorer.class);

    @After
    public void after() {
        verifyNoMoreInteractions(scorer);
    }

    @Test
    public void three_strikes_is_30() {
        finalFrame.roll(Score.ten());
        finalFrame.roll(Score.ten());
        finalFrame.roll(Score.ten());

        finalFrame.score(scorer);
        verify(scorer).score(Score.of(30));
    }

    @Test
    public void a_strike_then_a_4_is_18() {
        finalFrame.roll(Score.ten());
        finalFrame.roll(Score.of(4));

        finalFrame.score(scorer);
        verify(scorer).score(Score.of(18));
    }

    @Test
    public void a_4_then_a_2_is_6() {
        finalFrame.roll(Score.of(4));
        finalFrame.roll(Score.of(2));

        finalFrame.score(scorer);
        verify(scorer).score(Score.of(6));
    }

    @Test
    public void a_strike_then_a_spare_is_30() {
        finalFrame.roll(Score.of(10));
        finalFrame.roll(Score.of(5));
        finalFrame.roll(Score.of(5));

        finalFrame.score(scorer);
        verify(scorer).score(Score.of(30));
    }
}