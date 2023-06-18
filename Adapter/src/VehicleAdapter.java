public class VehicleAdapter implements VehicleMechanic {

    private final SeaVehicleMechanic seaVehicleMechanic;

    public VehicleAdapter(VehicleType type) {
        if (VehicleType.SHIP.equals(type)) {
            seaVehicleMechanic = new ShipMechanic();
        }
        else if (VehicleType.SUBMARINE.equals(type)) {
            seaVehicleMechanic = new SubmarineMechanic();
        }
        else {
            seaVehicleMechanic = null;
        }
    }

    @Override
    public void repairVehicle(VehicleType type) {
        if (VehicleType.SHIP.equals(type)) {
            seaVehicleMechanic.repairShip();
        }
        else if (VehicleType.SUBMARINE.equals(type)) {
            seaVehicleMechanic.repairSubmarine();
        }
    }
}
