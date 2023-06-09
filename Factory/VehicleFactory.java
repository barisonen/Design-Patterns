public class VehicleFactory {

    public Vehicle getVehicle(VehicleType vehicleType) {
        if (vehicleType == null) {
            return null;
        }
        else if (vehicleType.equals(VehicleType.CAR)) {
            return new Car();
        }
        else if (vehicleType.equals(VehicleType.PLANE)) {
            return new Plane();
        }
        else {
            return null;
        }
    }
}
