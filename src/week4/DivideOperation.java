package week4;

public class DivideOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber){
        return (double) firstNumber / secondNumber;
        // 나누기는 소수점이 나올 수 있으므로 double로 캐스팅하여
        // 강제형변환을 시켰다.
    }
}