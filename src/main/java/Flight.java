import java.sql.SQLOutput;
import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengerList;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.passengerList = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }


    public int passengerCount(){
        return this.passengerList.size();
    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getNumberOfAvailableSeats() {
        int planeCapacity = plane.getPlaneType().getCapacity();
        int numberOfPassengers = passengerCount();
        return planeCapacity - numberOfPassengers;
    }

    public boolean getSeatAvailability() {
        int planeCapacity = plane.getPlaneType().getCapacity();
        if(getNumberOfAvailableSeats() <= planeCapacity){
            return true;
        } else {
            return false;
        }
    }
}


