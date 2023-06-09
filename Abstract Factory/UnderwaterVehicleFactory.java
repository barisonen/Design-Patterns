public class UnderwaterVehicleFactory extends AbstractFactory {

    public Vehicle getVehicle(VehicleType vehicleType) {
        if (VehicleType.SUBMARINE.equals(vehicleType)) {
            return new Submarine();
        }
        else if (VehicleType.MANNED_SUBMERSIBLE.equals(vehicleType)) {
            return new MannedSubmersible();
        }
        else {
            return null;
        }
    }
}
