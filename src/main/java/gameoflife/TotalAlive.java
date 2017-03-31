package gameoflife;

import org.immutables.value.Value;

@Value.Immutable
public abstract class TotalAlive {
    protected abstract int totalAlive();

    private static TotalAlive ofSize(int i) {
        return ImmutableTotalAlive.builder()
            .totalAlive(i)
            .build();
    }

    public static TotalAlive none() {
        return ofSize(0);
    }

    public TotalAlive increment() {
        return ofSize(totalAlive() + 1);
    }

    public boolean underpopulated() {
        return totalAlive() < 2;
    }

    public boolean overpopulated() {
        return totalAlive() > 3;
    }

    public boolean atReproductionNumber() {
        return totalAlive() == 3;
    }
}
