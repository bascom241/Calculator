package tools;

import errors.CustomException;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator{
    Operators operator = new Operators();
    String [] actions = operator.getS();
    int value1;
    String userOperator;

    public Calculator(Scanner scanner){
        try{
            while(!scanner.hasNext() ){
                throw new CustomException("Value must be an interger" );
            }
            userOperator=scanner.nextLine();
            if(Arrays.asList(actions).contains(userOperator)){

            }
           value1 = scanner.nextInt();
            System.out.println("You entered " + value1);

        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }

    public int getValue1(){
        return value1;
    }

    public void calculateResult(){

    }



}