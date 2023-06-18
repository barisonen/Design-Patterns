public class Main {
    public static void main(String[] args) {
        GeneralVehicleMechanic generalVehicleMechanic = new GeneralVehicleMechanic();
        generalVehicleMechanic.repairVehicle(VehicleType.CAR);
        generalVehicleMechanic.repairVehicle(VehicleType.SHIP);
        generalVehicleMechanic.repairVehicle(VehicleType.SUBMARINE);
    }
}
