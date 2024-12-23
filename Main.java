import tools.Calculator;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println("Welcome to My Calculator Project");
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator( scanner);
        int input1 = calculator.getValue1();
        System.out.println(input1);
        String opp = calculator.getOperator();
        System.out.println(opp);
        int input2 = calculator.getValue2();
        System.out.println(input2);
        calculator.calculateResult();
    }

  
}