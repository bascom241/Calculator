package tools;

import errors.*;

import java.util.Arrays;
import java.util.InputMismatchException;
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
                System.out.println("Value must be an integer.");
                scanner.next();
            }
            value1 = scanner.nextInt();
            System.out.println("You entered " + value1);
            scanner.nextLine();
            return value2;
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.nextLine();
        }

        return 0;
    }

    public void validateOperator() {

        try {
            System.out.println("Please enter an operator");
            userOperator = scanner.nextLine();
            if (!Arrays.asList(actions).contains(userOperator)) {
                throw new Exception("Invalid Operator");
            }
            System.out.println("You entered this" + userOperator + "Operator");
        } catch (Exception e) {
            System.out.println(e);

        }

    }

    public String getOperator() {
        validateOperator();
        return userOperator;
    }

    public int getValue2() {
        System.out.println("Please enter secont dumber");
        try {
            while (!scanner.hasNext()) {
                throw new InputMismatchException("Value can only be an Integer");
            }
            value2 = scanner.nextInt();
            System.out.println("You entered " + value2);
            return value2;
        } catch (InputMismatchException e) {

        }
        return 0;
    }

    int result;

    public void calculateResult() {
        switch (userOperator) {
            case "+" -> {
                result = value1 + value2;
                System.out.println("Your Result is " + result);
            }
            case "-" -> {
                result = value1 - value2;
                System.out.println("Your Result is " + result);
            }
            case "/" -> {
                if (value2 != 0) {
                    result = value1 + value2;
                    System.out.println("Your Result is " + result);
                } else {
                    System.out.println("Error! Cannot Divide by zero");

                }
            }
            case "*" -> {
                result = value1 * value2;
                System.out.println("Your Result is " + result);
            }
            default -> System.out.println("Invalid Operrator");
        }
        scanner.close();
    }

}