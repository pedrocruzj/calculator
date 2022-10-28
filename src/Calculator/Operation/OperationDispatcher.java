package Calculator.Operation;

import Calculator.*;

import java.lang.reflect.*;
import java.util.*;
import java.lang.*;

public class OperationDispatcher {

    public static Float dispatch(CalculatorArguments args) throws Exception {
       OperationInterface operationClass;

       switch (args.operator) {
           case "+":
               operationClass = new SumOperation();
               break;
           case "*":
               operationClass = new MultiplicationOperation();
               break;
           case "-":
               operationClass = new SubtractionOperation();
               break;
           case "/":
               operationClass = new DivisionOperation();
               break;
           default:
               operationClass = new SumOperation();
       }

       return operationClass.resolve(args.num1, args.num2);
    }



}
