public enum PlaneType {

    MEGA999(600, 50000.00),
    JUMBO800(450, 350000.00),
    MINI222(180, 10000.00);

    private final int capacity;
    private final double totalWeightKg;

    PlaneType(int capacity, double totalWeightKg) {
        this.capacity = capacity;
        this.totalWeightKg = totalWeightKg;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getTotalWeightKg() {
        return totalWeightKg;
    }
}
