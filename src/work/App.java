package work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("계산을 하시겠습니까? (Y/N)");
            String exit = scanner.next();
            if (exit.equalsIgnoreCase("N")) {
                break; //
            }

            // 사용자로부터 num1, num2, operator 입력 받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("연산자를 입력하세요 (+, -, *, /): ");
            String operator = scanner.next();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();


            // 계산 수행
            double result = calculator.calculate(num1, num2, operator);


            // 결과 리스트 출력
            System.out.println("결과: " + calculator.getResults());

            calculator.removeResult();

        }
        //s
        scanner.close();
        System.out.println("계산을 종료합니다");
    }
}
