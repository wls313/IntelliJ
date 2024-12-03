package Ca;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws BadInputException{
        // 구현 1.
        if(!Pattern.matches(NUMBER_REG, firstInput)){
            //pattern클래스를 이용해 숫자인지 확인하는 string과 입력받은 input을 비교
            throw new BadInputException("정수");
            //false일때는 해당 Exception은 throw하여 타입이 잘못됐다고 알림.
        }
        calculator.setFirstNumber(Integer.parseInt(firstInput));
        System.out.println(firstInput);

        return this;
    }

    public Parser parseSecondNum(String secondInput) throws BadInputException{
        // 구현 1.
        if(!Pattern.matches(NUMBER_REG, secondInput)){
            //pattern클래스를 이용해 숫자인지 확인하는 string과 입력받은 input을 비교
            throw new BadInputException("정수");
            //false일때는 해당 Exception은 throw하여 타입이 잘못됐다고 알림.
        }
        calculator.setFirstNumber(Integer.parseInt(secondInput));
        System.out.println(secondInput);
        return this;
    }

    public Parser parseOperator(String operationInput) throws BadInputException{
        // 구현 1.
        if(!Pattern.matches(OPERATION_REG, operationInput)){
            throw new BadInputException("연산자");
        }
        switch (operationInput){
            case "+":
                calculator.setOperation(new AddOperation());
                break;
            case "-":
                calculator.setOperation(new SubstractOperation());
                break;
            case "*":
                calculator.setOperation(new MultiplyOperation());
                break;
            case "/":
                calculator.setOperation(new DivideOperation());
                break;
        }
        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}