package com.mohit.tutorials.java_spring_basics.interfacesAndAbstractClass.busStations;

import com.mohit.tutorials.java_spring_basics.interfacesAndAbstractClass.common.TicketBooking;

import java.util.ArrayList;
import java.util.List;

//Properties and functions that are common within a hierarchy
public abstract class BusStation implements TicketBooking {

    String schedule;
    String busRouteInfo;
    List<Integer> busNumbers = new ArrayList<>();
}
