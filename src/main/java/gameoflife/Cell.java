package gameoflife;

public interface Cell {
    Liveness liveness();
    Cell advance(TotalAlive totalAlive);
}
