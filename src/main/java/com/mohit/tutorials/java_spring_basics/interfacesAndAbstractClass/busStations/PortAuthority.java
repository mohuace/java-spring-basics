package com.mohit.tutorials.java_spring_basics.interfacesAndAbstractClass.busStations;

public class PortAuthority extends BusStation {
    //Port authority is a bus station

    Integer numberOfSubways;

    Integer numberOfFloors;

    @Override
    public String buyTickets() {
        return "PABT tickets";
    }
}
