package com.albertfiati;

import java.util.List;
import java.util.Map;

public class City {
    private List<Intersection> cityMap;

    public void addIntersection(Intersection intersection){
        cityMap.add(intersection);
    }
}
