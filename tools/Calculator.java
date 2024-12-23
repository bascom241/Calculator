package tools;

import errors.*;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    Operators operator = new Operators();
    String[] actions = operator.getS();
    Scanner scanner;
    int value1;
    String userOperator;
    int value2;

    public Calculator(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getValue1() {
        try {
            while (!scanner.hasNext()) {
                throw new CustomException("Value must be an interger");
            }
            value1 = scanner.nextInt();
            System.out.println("You entered " + value1);
            // Get the users Operator and validate //

        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        return value1;
    }

    public void validateOperator() {

        try {
            userOperator = scanner.nextLine();
            if (!Arrays.asList(actions).contains(userOperator)) {
               throw new Exception ("Invalid Operator" );
            }
            System.out.println("You entered this" + userOperator + "Operator");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    



    public void calculateResult() {

    }

}