public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle vehicle1 = vehicleFactory.getVehicle(VehicleType.CAR);
        vehicle1.printType();

        Vehicle vehicle2 = vehicleFactory.getVehicle(VehicleType.PLANE);
        vehicle2.printType();
    }
}
