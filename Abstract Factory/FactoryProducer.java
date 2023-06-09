public class FactoryProducer {
    public static AbstractFactory getFactory(FactoryType factoryType) {
        if (FactoryType.VEHICLE_FACTORY.equals(factoryType)) {
            return new VehicleFactory();
        }
        else {
            return new UnderwaterVehicleFactory();
        }
    }
}
