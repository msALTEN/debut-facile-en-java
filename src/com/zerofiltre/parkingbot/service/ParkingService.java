package com.zerofiltre.parkingbot.service;

import com.zerofiltre.parkingbot.model.Ticket;
import com.zerofiltre.parkingbot.model.Vehicle;
import java.util.Date;

public class ParkingService {

  public Ticket processIncomingVehicle(Vehicle vehicle) {
    Ticket ticket = new Ticket();
    Date now = new Date();
    ticket.setEnteringTime(now);
    ticket.setVehicle(vehicle);

    return ticket;
  }

  public Ticket processExitingVehicle(Ticket ticket){
    ticket.setExitTime(new Date(new Date().getTime() + 1000 * 60 * 60));

    long durationInMunit = (ticket.getExitTime().getTime() - ticket.getEnteringTime().getTime()) / (60 * 1_000);

    /*if ("CITADINE".equals(ticket.getVehicle().getCategory())){
      ticket.setAmount(durationInMunit * 0.08);
    } else if ("2 ROUES".equals(ticket.getVehicle().getCategory())){
      ticket.setAmount(durationInMunit * 0.02);
    }else {
      ticket.setAmount(durationInMunit * 0.05);
    }*/

    switch (ticket.getVehicle().getCategory()) {
      case CITADINE:
        ticket.setAmount(durationInMunit * 0.08);
        break;
      case DEUXROUES:
        ticket.setAmount(durationInMunit * 0.02);
        break;
      default:
        ticket.setAmount(durationInMunit * 0.05);
    }

    return ticket;
  }

}
