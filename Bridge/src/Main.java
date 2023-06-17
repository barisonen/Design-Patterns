public class Main {
    public static void main(String[] args) {
        Vehicle redCar = new Car(new RedCar());
        Vehicle blackCar = new Car(new BlackCar());

        redCar.printVehicleInfo();
        blackCar.printVehicleInfo();
    }
}
