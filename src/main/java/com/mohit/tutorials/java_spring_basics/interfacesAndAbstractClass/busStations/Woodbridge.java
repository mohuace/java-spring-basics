package com.mohit.tutorials.java_spring_basics.interfacesAndAbstractClass.busStations;

//Woodbridge is a bus station
//Inherits the properties of BusStation and will have its own
public class Woodbridge extends BusStation {

    boolean hasParking;

    @Override
    public String buyTickets() {
        return "Woodbridge tickets";
    }
}
