package week4;

public class Calculator{
    private AbstractOperation abstractOperation;

    public Calculator(AbstractOperation abstractOperation){
        this.abstractOperation = abstractOperation;
    } //생성자를 abstract 추상클래스로 변경

    public void setAbstractOperation(AbstractOperation abstractOperation) {
        this.abstractOperation = abstractOperation;
    } // 다른 연산자를 사용하기 위해 setter를 사용해 클래스를 바꿔준다.

    public double calculate(int firstNumber, int secondNumber){
        return abstractOperation.operate(firstNumber, secondNumber);
        //값두개만 매개변수로 가지게 변경!
    }
}
