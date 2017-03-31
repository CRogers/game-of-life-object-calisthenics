package gameoflife;

import java.util.HashSet;
import java.util.Set;

public class Neighbours {
    private final Set<Coordinate> coordinates = new HashSet<>();

    public boolean contains(Coordinate coordinate) {
        return coordinates.contains(coordinate);
    }

    public void add(Coordinate coordinate) {
        coordinates.add(coordinate);
    }
}
