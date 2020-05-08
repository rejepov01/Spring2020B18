package day10_Siwtch_Scanner;

import java.util.Scanner;

public class Scanner_Practice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
                     byte num1 =input.nextByte();  // use with short also
        System.out.println("Enter your second number");
                         byte num2  = input.nextByte();

                         int total = num1 +num2;
        System.out.println("The sum of " + num1 + "and " + num2 + " is: " + total);

        System.out.println("===========================================================");

        // practice here with short


    }

}
