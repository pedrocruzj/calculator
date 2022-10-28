package Calculator;

public class CalculatorArguments {
    public float num1;
    public float num2;
    public String operator;

    CalculatorArguments(float num1, float num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public static CalculatorArguments getArgsFromExpression(String str) {
        final String[] chunks = str.split(" ");
        float num1 = Float.parseFloat(chunks[0]);
        String operation = chunks[1];
        float num2 = Float.parseFloat(chunks[2]);

        return new CalculatorArguments(num1, num2, operation);
    }
}
