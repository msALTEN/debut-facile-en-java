package com.zerofiltre.parkingbot;

import com.zerofiltre.parkingbot.model.Bicycle;
import com.zerofiltre.parkingbot.model.Car;
import com.zerofiltre.parkingbot.model.Ticket;
import com.zerofiltre.parkingbot.model.Vehicle;
import com.zerofiltre.parkingbot.service.ParkingService;


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
    vehicle.setRegistrationNumber("A1-34425-DC");
    Ticket vehicleTicket = parkingService.processIncomingVehicle(vehicle);

    Vehicle bicycle = new Bicycle();
    vehicle.setRegistrationNumber("B1-234-RK");
    Ticket bicycleTicket = parkingService.processIncomingVehicle(bicycle);

    Vehicle car = new Car();
    vehicle.setRegistrationNumber("C1-24315-XW");
    Ticket carTicket = parkingService.processIncomingVehicle(car);

    System.out.println(vehicleTicket);
    System.out.println(bicycleTicket);
    System.out.println(carTicket);

  }

}
