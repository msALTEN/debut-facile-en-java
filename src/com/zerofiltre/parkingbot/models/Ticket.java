package com.zerofiltre.parkingbot.models;

import java.util.Date;

public class Ticket {
    private String amount;

    private Vehicle vehicle;
    private Date enteringTime;
    private Date exitTime;
    public Ticket() {}

    public Ticket(String amount, Vehicle vehicle, Date enteringTime, Date exitTime) {
        this.amount = amount;
        this.vehicle = vehicle;
        this.enteringTime = enteringTime;
        this.exitTime = exitTime;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getEnteringTime() {
        return enteringTime;
    }

    public void setEnteringTime(Date enteringTime) {
        this.enteringTime = enteringTime;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "amount='" + amount + '\'' +
                ", vehicle=" + vehicle +
                ", enteringTime=" + enteringTime +
                ", exitTime=" + exitTime +
                '}';
    }
}
