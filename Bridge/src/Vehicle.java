public abstract class Vehicle {
    protected VehicleBridge bridge;

    protected Vehicle(VehicleBridge bridge) {
        this.bridge = bridge;
    }

    public abstract void printVehicleInfo();
}
