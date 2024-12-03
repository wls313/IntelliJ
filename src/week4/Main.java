package week4;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AddOperation());
        System.out.println(calculator.calculate(4,5));

    }
}