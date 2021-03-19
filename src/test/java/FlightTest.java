import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void before(){
        plane = new Plane(PlaneType.JUMBO800);
        flight = new Flight(plane, "JA1234", "SVO", "GLA", "06:00");
        passenger = new Passenger("John Smith", 2);
    }

    @Test
    public void flightHasPlane(){
        assertEquals(PlaneType.JUMBO800, flight.getPlane().getPlaneType());
    }

    @Test
    public void flightHasFlightNumber(){
        assertEquals("JA1234", flight.getFlightNumber());
    }

    @Test
    public void flightHasDestination(){
        assertEquals("SVO", flight.getDestination());
    }

    @Test
    public void flightHasDepartureAirport(){
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals("06:00", flight.getDepartureTime());
    }

    @Test
    public void flightHasPassengerList(){
        assertNotNull(flight.getPassengerList());
    }

    @Test
    public void passengerListStartsEmpty(){
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void canGetNumberOfAvailableSeats(){
        assertEquals(450, flight.getNumberOfAvailableSeats());
    }

    @Test
    public void canCheckIfSeatsAreAvailableTrue(){
        assertEquals(true, flight.getSeatAvailability());
    }

    @Test
    public void canAddPassengerToList(){
        flight.addPassengerToList(passenger);
        assertEquals(1, flight.passengerCount());
    }

}
