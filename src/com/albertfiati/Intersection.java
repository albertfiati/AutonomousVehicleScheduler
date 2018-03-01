package com.albertfiati;

import java.util.List;

public class Intersection {
    private Position position;
    private List<Position> neighbourhood;

    public Intersection(Position position, List<Position> neighbourhood ){
        this.position = position;
        this.neighbourhood = neighbourhood;
    }
}
