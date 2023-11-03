package com.zerofiltre.parkingbot.services;

import com.zerofiltre.parkingbot.models.Ticket;
import com.zerofiltre.parkingbot.models.Vehicle;

import java.util.Date;

public class ParkingService {
    public Ticket processIncomingVehicle(Vehicle vehicle){
        Ticket ticket = new Ticket();
        Date now = new Date();
        ticket.setEnteringTime(now);
        ticket.setVehicle(vehicle);
        return ticket;
    }
}
