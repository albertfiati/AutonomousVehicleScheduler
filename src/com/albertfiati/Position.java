package com.albertfiati;

public class Position {
    private int row, col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public int distanceFfrom(Position nextPosition) {
        return Math.abs(this.row - nextPosition.getRow()) + Math.abs(this.col - nextPosition.getCol());
    }
}
