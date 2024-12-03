package Ca;

import java.util.Objects;
import java.util.Scanner;

public class CalculatorApp {

    public static boolean start() throws Exception {
        String exit = "";

        while (exit != "exit") {
            Parser parser = new Parser();
            Scanner scanner = new Scanner(System.in);


            System.out.println("첫번째 숫자를 입력해주세요!");
            String firstInput = scanner.nextLine();
            parser.parseFirstNum(firstInput);

            System.out.println("연산자를 입력해주세요!");
            String operator = scanner.nextLine();
            parser.parseOperator(operator);

            System.out.println("두번째 숫자를 입력해주세요!");
            String secondInput = scanner.nextLine();
            parser.parseSecondNum(secondInput);

            System.out.println("연산 결과 : " + parser.executeCalculator());

            System.out.println("계산을 계속하시겠습니까? exit를 입력하시면 종료됩니다.");
            exit = scanner.nextLine();

        }

        return true;

    }

}