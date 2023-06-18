public class ShipMechanic implements SeaVehicleMechanic {

    @Override
    public void repairShip() {
        System.out.println("repaired ship | Mechanic: " + this.getClass().getName());
    }

    @Override
    public void repairSubmarine() {

    }
}
