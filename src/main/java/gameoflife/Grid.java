package gameoflife;

import java.util.HashMap;
import java.util.Map;

public class Grid {
    private Map<Coordinate, Cell> cells = new HashMap<>();

    public void advance() {
        Map<Coordinate, Cell> nextCells = new HashMap<>();

        for (Map.Entry<Coordinate, Cell> entry : cells.entrySet()) {
            Coordinate coordinate = entry.getKey();
            Cell cell = entry.getValue();

            TotalAlive totalAlive = aliveNeighboursFor(coordinate);
            Cell nextCell = cell.advance(totalAlive);
            nextCells.put(coordinate, nextCell);
        }

        cells = nextCells;
    }

    private TotalAlive aliveNeighboursFor(Coordinate coordinate) {
        Neighbours neighbours = coordinate.neighbours();
        TotalAlive totalAlive = TotalAlive.none();

        for (Coordinate possibleNeighbour : cells.keySet()) {
            totalAlive = incrementTotalCountIsAliveNeighbour(totalAlive, neighbours, possibleNeighbour);
        }

        return totalAlive;
    }

    private TotalAlive incrementTotalCountIsAliveNeighbour(
        TotalAlive totalAlive,
        Neighbours neighbours,
        Coordinate possibleNeighbour) {

        Cell possibleNeighbourCell = cells.get(possibleNeighbour);
        boolean isAlive = possibleNeighbourCell.liveness().equals(Liveness.ALIVE);

        if (neighbours.contains(possibleNeighbour) && isAlive) {
            totalAlive = totalAlive.increment();
        }
        return totalAlive;
    }
}
