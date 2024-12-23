import tools.Calculator;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println("Welcome to My Calculator Project");
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator( scanner);
        int input1 = calculator.getValue1();
        System.out.println(input1);
    }

  
}