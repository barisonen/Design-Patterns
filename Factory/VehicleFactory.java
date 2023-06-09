public class VehicleFactory {

    public Vehicle getVehicle(VehicleType vehicleType) {
        if (VehicleType.CAR.equals(vehicleType)) {
            return new Car();
        }
        else {
            return new Plane();
        }
    }
}
