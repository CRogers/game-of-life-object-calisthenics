package gameoflife;

public class Coordinate {
    private final int x;
    private final int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Neighbours neighbours() {
        Neighbours neighbours = new Neighbours();

        for (int j = -1; j < 1; j++) {
            addCoordsInRow(neighbours, j);
        }

        return neighbours;
    }

    private void addCoordsInRow(Neighbours neighbours, int j) {
        for (int i = -1; i < 1; i ++) {
            neighbours.add(new Coordinate(i, j));
        }
    }
}
