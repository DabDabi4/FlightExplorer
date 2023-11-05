package com.flightExplorer;

import java.util.ArrayList;
import java.util.List;

public class FlightService {
    private final List<Flight> flights;

    public FlightService(List<Flight> flights) {
        this.flights = new ArrayList<>(flights);
    }

    public List<Flight> getFlightsByDestination(String destination) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getDestination().equalsIgnoreCase(destination)) {
                result.add(flight);
            }
        }
        return result;
    }

    public List<Flight> getFlightsByDayOfWeek(String dayOfWeek) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : flights) {
            for (String day : flight.getDaysOfWeek()) {
                if (day.equalsIgnoreCase(dayOfWeek)) {
                    result.add(flight);
                    break;
                }
            }
        }
        return result;
    }

    public List<Flight> getFlightsByDayAndTime(String dayOfWeek, String time) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : flights) {
            for (String day : flight.getDaysOfWeek()) {
                if (day.equalsIgnoreCase(dayOfWeek) && flight.getDepartureTime().compareTo(time) > 0) {
                    result.add(flight);
                    break;
                }
            }
        }
        return result;
    }
}

