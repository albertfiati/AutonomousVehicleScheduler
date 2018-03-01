package com.albertfiati;

public class Ride {
    private Position location, destination;
    private Vehicle vehicle;

    public Ride(Position location, Position destination, Vehicle vehicle){
        this.location = location;
        this.destination = destination;
        this.vehicle = vehicle;
    }

    public void assignVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle(){
        return this.vehicle;
    }

    public Position getLocation(){
        return this.location;
    }

    public Position getDestination(){
        return this.destination;
    }
}
