package Calculator;

import Calculator.Operation.*;

public class Calculator {

    CalculatorArguments arguments;

    public Calculator(CalculatorArguments arguments) {
        this.arguments = arguments;
    }

    public float calculate() throws Exception {
        float response = 0;

        response = OperationDispatcher.dispatch(this.arguments);

        return response;
    }

}
