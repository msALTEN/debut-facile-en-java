package com.zerofiltre.parkingbot;

import com.zerofiltre.parkingbot.model.Bicycle;
import com.zerofiltre.parkingbot.model.Car;
import com.zerofiltre.parkingbot.model.Ticket;
import com.zerofiltre.parkingbot.model.Vehicle;
import com.zerofiltre.parkingbot.service.ParkingService;

import java.util.*;

public class ParkingBot {

  static ParkingService parkingService = new ParkingService();

  /**
   * Ceci est la méthode Main
   *
   * @param args : Tableau de données entrées lors du lancement de l'application
   */
  public static void main(String[] args) {
    processVehicles();
  }

  private static void processVehicles() {

    Vehicle vehicle = new Vehicle();
    vehicle.setRegistrationNumber("LS-324-PM");
    Ticket vehicleTicket = parkingService.processIncomingVehicle(vehicle);
    System.out.println(vehicleTicket);

    Vehicle bicycle = new Bicycle();
    bicycle.setRegistrationNumber("PM-254-OP");
    Ticket bicycleTicket = parkingService.processIncomingVehicle(bicycle);
    System.out.println(bicycleTicket);

    Vehicle car = new Car();
    bicycle.setRegistrationNumber("BX-256-QX");
    Ticket carTicket = parkingService.processIncomingVehicle(car);
    System.out.println(carTicket);

    System.out.println("Traitement des sorties par lot");


   /* Ticket[] tickets = new Ticket[3];
    tickets[0] = vehicleTicket;
    tickets[1] = bicycleTicket;
    tickets[2] = carTicket;

    for (int i = 0; i < tickets.length; i++) {
      System.out.println(parkingService.processExitingVehicle(tickets[i]));
    }*/

    List<Ticket> tickets = new ArrayList<>();
    tickets.add(vehicleTicket);
    tickets.add(bicycleTicket);
    tickets.add(carTicket);

/*    Set<Ticket> tickets = new HashSet<>();
    tickets.add(vehicleTicket);
    tickets.add(carTicket);
    tickets.add(bicycleTicket);

    for (Ticket ticket: tickets) {
      System.out.println(parkingService.processExitingVehicle(ticket));
    }*/

    Map<Integer, Ticket> ticketMap = new HashMap<>();

    int position = 0;

    for (Ticket ticket: tickets){
      ticketMap.put(position,parkingService.processExitingVehicle(ticket));
      System.out.println(ticketMap.get(position));
      position++;

    }

    Set<Integer> keySet = ticketMap.keySet();
    System.out.println(keySet);
    System.out.println(ticketMap);

  }


}
