package Calculator.Operation;

public class SubtractionOperation implements OperationInterface{


    @Override
    public float resolve(float num1, float num2) {
        return num1 - num2;
    }
}
