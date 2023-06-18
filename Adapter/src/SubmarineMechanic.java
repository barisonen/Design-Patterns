public class SubmarineMechanic implements SeaVehicleMechanic {

    @Override
    public void repairShip() {

    }

    @Override
    public void repairSubmarine() {
        System.out.println("repaired submarine | Mechanic: " + this.getClass().getName());
    }
}
