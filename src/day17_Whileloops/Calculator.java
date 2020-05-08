package day17_Whileloops;
/*
4.	write a program that can calculate the two numbers based on the user provided operators, the program will ask:
						1. enter first number
						2. enter the second number
						3. enter the math operators
								(assume that only the +, -, *, /, and % will be entered)
						then the system will give the result based on the operator
						at the end it will ask if the user want's to calculate another numbers, if user
						entered "NO" or "no", the program will stop execution, otherwise it repeats all the previous steps
								(you will need a lop that has true condition without the iterator)
 */

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        for (int i = 0; true; ) {  // // infinite loop , opening curly brace of loop

            Scanner input = new Scanner(System.in);

            System.out.println("Enter first number");
            int num1 = input.nextInt();

            System.out.println("Enter second number");
            int num2 = input.nextInt();

            System.out.println("Math operator: ");
            String operator = input.next();  // +, -, * , /, %

            if (operator.equals("+")) {
                System.out.println("Addition is: " + (num1 + num2));
            } else if (operator.equals("-")) {
                System.out.println("Subtraction is: " + (num1 - num2));
            } else if (operator.equals("*")) {
                System.out.println("Multiplication is: " + (num1 * num2));
            } else if (operator.equals("/")) {
                System.out.println("Division is: " + (num1 / num2));
            } else if (operator.equals("%")) {
                System.out.println("Remainder is: " + (num1 % num2));
            } else {
                System.out.println("Invalid Operator");
            }

            System.out.println("Do you want to continue");
            String answer = input.next();

            if (answer.equalsIgnoreCase("no")) { // // only exits the loop if the answer is NO
                System.out.println("Thank you for using the calculator");
                break;
            }
        }  // closing curly brace of loop
    }

}
