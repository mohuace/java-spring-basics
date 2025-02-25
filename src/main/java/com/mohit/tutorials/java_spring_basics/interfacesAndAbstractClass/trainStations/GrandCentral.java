package com.mohit.tutorials.java_spring_basics.interfacesAndAbstractClass.trainStations;

import java.util.ArrayList;
import java.util.List;

public class GrandCentral extends TrainStation {

    List<String> ameneties = new ArrayList<>();

    boolean hasLounge;

    @Override
    public String buyTickets() {
        return "Grand central ticket bought";
    }
}
