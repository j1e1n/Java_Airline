public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public double getPassengerBaggageAllowance() {
        double totalWeight = flight.getPlane().getPlaneType().getTotalWeightKg();
        int capacity = flight.getPlane().getPlaneType().getCapacity();
        return Math.round((totalWeight / 2) / capacity);
    }
}
