package com.albertfiati;

public class Vehicle {
    private Position location;
    private int numberOfRidesAssigned = 0;
    private int numberOfRidesCompleted = 0;

    public Vehicle(Position location) {
        this.location = location;
    }

    public void addRide() {
        this.numberOfRidesAssigned += 1;
    }

    public void addCompletedRide() {
        this.numberOfRidesCompleted += 1;
    }

    public int getNumberOfRidesAssigned(){
        return this.numberOfRidesAssigned;
    }

    public int getNumberOfRidesCompleted(){
        return this.numberOfRidesCompleted;
    }
}
