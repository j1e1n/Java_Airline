import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Flight flight;
    private Plane plane;
    private Passenger passenger;

    @Before
    public void before(){
        plane = new Plane(PlaneType.MEGA999);
        passenger = new Passenger("John Smith", 2);
        flight = new Flight(plane, "JA1234", "SVO", "GLA", "06:00");
        flightManager = new FlightManager(flight);
        flightManager.getFlight().bookPassenger(passenger);
    }


    @Test
    public void canCalculateReservedBaggageWeightPerPassenger(){
        assertEquals(42.0, flightManager.getPassengerBaggageAllowance(), 0.0);
    }

}
