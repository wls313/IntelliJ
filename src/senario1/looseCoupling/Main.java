package senario1.looseCoupling;

public class Main {

    public static void main(String[] args) {

        GasEngine gasEngine = new GasEngine();
        ElectricEngine electricEngine = new ElectricEngine();

        Car car = new Car(electricEngine);
        car.drive();
    }
}
