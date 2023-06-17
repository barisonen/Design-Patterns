public class Car extends Vehicle {

    public Car(VehicleBridge bridge) {
        super(bridge);
    }

    @Override
    public void printVehicleInfo() {
        bridge.printColoredVehicleInfo();
    }
}
