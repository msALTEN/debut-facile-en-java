package com.zerofiltre.parkingbot;

import com.zerofiltre.parkingbot.models.Ticket;
import com.zerofiltre.parkingbot.models.Vehicle;
import com.zerofiltre.parkingbot.services.ParkingService;

public class ParkingBot {


  /**
   * Ceci est la méthode Main
   *
   * @param args : Tableau de données entrées lors du lancement de l'application
   */
  public static void main(String[] args) {
    processIncomiing();
  }

  private static void processIncomiing() {
    Vehicle vehicle = new Vehicle();
    vehicle.setRegistrationNumber("LS-88976-PM");
    vehicle.setCategory("Clio 4");

    ParkingService parkingService = new ParkingService();
    Ticket ticket = parkingService.processIncomingVehicle(vehicle);

    System.out.println(ticket);
  }


}
