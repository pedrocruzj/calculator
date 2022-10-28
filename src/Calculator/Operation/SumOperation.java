package Calculator.Operation;

public class SumOperation implements OperationInterface
{

    @Override
    public float resolve(float num1, float num2) {
        return num1 + num2;
    }
}
