import com.flightExplorer.*;

import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Flight[] flightsArray = {
            new Flight("New York", 101, "Boeing 737", "10:00", new String[]{"Monday", "Wednesday", "Friday"}),
            new Flight("London", 202, "Airbus A320", "12:30", new String[]{"Tuesday", "Thursday", "Saturday"}),
            new Flight("Paris", 303, "Boeing 747", "14:00", new String[]{"Sunday"}),
            new Flight("New York", 404, "Boeing 586", "15:00", new String[]{"Tuesday", "Wednesday", "Saturday"}),

        };


        FlightService flightService = new FlightService(Arrays.asList(flightsArray));


        String destination = "New York";
        List<Flight> flightsToDestination = flightService.getFlightsByDestination(destination);
        System.out.println("Flights to " + destination + ":");
        for (Flight flight : flightsToDestination) {
            System.out.println(flight);
        }

        String dayOfWeek = "Tuesday";
        List<Flight> flightsOnDay = flightService.getFlightsByDayOfWeek(dayOfWeek);
        System.out.println("\nFlights on " + dayOfWeek + ":");
        for (Flight flight : flightsOnDay) {
            System.out.println(flight);
        }


        String dayOfWeekForTimeCheck = "Sunday";
        String departureTime = "11:00";
        List<Flight> flightsOnDayAfterTime = flightService.getFlightsByDayAndTime(dayOfWeekForTimeCheck, departureTime);
        System.out.println("\nFlights on " + dayOfWeekForTimeCheck + " after " + departureTime + ":");
        for (Flight flight : flightsOnDayAfterTime) {
            System.out.println(flight);
        }
    }
}
