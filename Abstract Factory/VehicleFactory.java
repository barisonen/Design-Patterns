public class VehicleFactory extends AbstractFactory {

    public Vehicle getVehicle(VehicleType vehicleType) {
        if (VehicleType.CAR.equals(vehicleType)) {
            return new Car();
        }
        else if (VehicleType.PLANE.equals(vehicleType)) {
            return new Plane();
        }
        else {
            return null;
        }
    }
}
