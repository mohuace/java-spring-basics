package com.mohit.tutorials.java_spring_basics.interfacesAndAbstractClass.trainStations;

import com.mohit.tutorials.java_spring_basics.interfacesAndAbstractClass.common.TicketBooking;

import java.util.List;

public abstract class TrainStation implements TicketBooking {

    String location;
    String trainRoutes;
    List<String> trains;
}
