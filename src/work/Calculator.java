package work;

import java.util.ArrayList;
import java.util.List;

class Calculator {
    // 결과를 저장할 리스트
    private List<Double> results;

    // 생성자
    public Calculator() {
        // 결과 리스트 초기화
        this.results = new ArrayList<>();
    }

    // 사칙연산 메서드
    public double calculate(int num1, int num2, String operator) {
        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = (double) num1 / num2;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;
            default:
                System.out.println("유효하지 않은 연산자입니다.");
        }

        results.add(result);
        return result;
    }

    // 결과 리스트를 반환하는 메서드
    public List<Double> getResults() {
        return results;
    }

    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }
}