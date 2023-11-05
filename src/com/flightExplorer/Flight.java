package com.flightExplorer;


import java.util.Arrays;
public class Flight {
    private String destination;
    private int flightNumber;
    private String aircraftType;
    private String departureTime;
    private String[] daysOfWeek;

    public Flight(String destination, int flightNumber, String aircraftType, String departureTime, String[] daysOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.daysOfWeek = daysOfWeek.clone();
    }

    public String getDestination() {
        return destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String[] getDaysOfWeek() {
        return daysOfWeek.clone();
    }

    @Override
    public String toString() {
        return "Flight{" +
            "destination='" + destination + '\'' +
            ", flightNumber=" + flightNumber +
            ", aircraftType='" + aircraftType + '\'' +
            ", departureTime='" + departureTime + '\'' +
            ", daysOfWeek=" + Arrays.toString(daysOfWeek) +
            '}';
    }
}

