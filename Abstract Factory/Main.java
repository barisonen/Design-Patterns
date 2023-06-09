public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = FactoryProducer.getFactory(FactoryType.VEHICLE_FACTORY);

        Vehicle vehicle1 = factory1.getVehicle(VehicleType.CAR);
        Vehicle vehicle2 = factory1.getVehicle(VehicleType.PLANE);

        AbstractFactory factory2 = FactoryProducer.getFactory(FactoryType.UNDERWATER_VEHICLE_FACTORY);

        Vehicle vehicle3 = factory2.getVehicle(VehicleType.SUBMARINE);
        Vehicle vehicle4 = factory2.getVehicle(VehicleType.MANNED_SUBMERSIBLE);

        vehicle1.printType();
        vehicle2.printType();
        vehicle3.printType();
        vehicle4.printType();
    }
}
