import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.JUMBO800);
        flight = new Flight(plane, "JA1234", "SVO", "GLA", "06:00");
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


}
