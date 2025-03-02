package com.mohit.tutorials.java_spring_basics.interfacesAndAbstractClass.trainStations;

import java.util.List;

public class PennStation extends TrainStation {

    List<String> restaurants;

    @Override
    public String buyTickets() {
        return "Penn stn tickets";
    }
}
