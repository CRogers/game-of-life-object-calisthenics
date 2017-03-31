package gameoflife;

public class AliveCell implements Cell {
    @Override
    public Liveness liveness() {
        return Liveness.ALIVE;
    }

    @Override
    public Cell advance(TotalAlive totalAlive) {
        if (totalAlive.underpopulated() || totalAlive.overpopulated()) {
            return new DeadCell();
        }

        return this;
    }
}
