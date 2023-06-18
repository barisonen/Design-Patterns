public class VehicleFacade {

    private final Car car;
    private final Plane plane;
    private final Ship ship;


    public VehicleFacade() {
        car = new Car();
        plane = new Plane();
        ship = new Ship();
    }

    public void printCarInfo() {
        car.printVehicleInfo();
    }

    public void printPlaneInfo() {
        plane.printVehicleInfo();
    }

    public void printShipInfo() {
        ship.printVehicleInfo();
    }
}
