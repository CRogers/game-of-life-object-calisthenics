package gameoflife;

public class DeadCell implements Cell {

    @Override
    public Liveness liveness() {
        return Liveness.DEAD;
    }

    @Override
    public Cell advance(TotalAlive totalAlive) {
        if (totalAlive.atReproductionNumber()) {
            return new AliveCell();
        }

        return new DeadCell();
    }
}
