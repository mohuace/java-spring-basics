package com.mohit.tutorials.java_spring_basics.interfacesAndAbstractClass.common;

//THis is a contract, the class that implements it has to override the buyTickets()
//And provide an implementation.
//Ticket booking is common ACROSS hierarchies, airlines, trains, buses, etc.
//That is why we use Intefaces
public interface TicketBooking {
    String buyTickets();
}
