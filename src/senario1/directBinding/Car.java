package senario1.directBinding;

public class Car {

    // 속성
    private GasEngine engine;
    private ElectricEngine electricEngine; // 수정


    // 생성자
    public Car() {
        this.engine = new GasEngine();
        this.electricEngine = new ElectricEngine(); // 수정
    }

//    public Car(GasEngine gasEngine) {
//        this.engine = gasEngine;
//    }

    public void drive() {
        System.out.println("자동차가 주행됩니다.");
        this.engine.run();
    }

    public void driveWithElectricEngine() { // 수정
        System.out.println("자동차가 주행됩니다.");
        this.electricEngine.run();
    }
}
