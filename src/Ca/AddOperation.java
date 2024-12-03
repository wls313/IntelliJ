package Ca;

public class AddOperation extends AbstractOperation {
    @Override
    public double operate(int firstNumber, int secondNumber){
        int result = firstNumber + secondNumber;
        return result;
    }
}