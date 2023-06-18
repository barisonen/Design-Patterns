public class GeneralVehicleMechanic implements VehicleMechanic {

    private VehicleAdapter vehicleAdapter;

    @Override
    public void repairVehicle(VehicleType type) {
        if (VehicleType.CAR.equals(type)) {
            System.out.println("repaired car | Mechanic: " + this.getClass().getName());
        }
        else if (VehicleType.SHIP.equals(type) || VehicleType.SUBMARINE.equals(type)) {
            vehicleAdapter = new VehicleAdapter(type);
            vehicleAdapter.repairVehicle(type);
        }
        else {
            System.out.println("mechanic doesnt know this vehicle type. | Mechanic: " + this.getClass().getName());
        }
    }
}
