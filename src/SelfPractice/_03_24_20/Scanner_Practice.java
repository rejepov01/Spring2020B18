package SelfPractice._03_24_20;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner_Practice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number ");
              int num1 = input.nextInt();

        System.out.println("Enter your second number ");
              int num2 = input.nextInt();

        System.out.println("Enter your third number ");
                      int num3 = input.nextInt();

         int total = num1 + num2 + num3;

        System.out.println("The sum of " + num1 + " and " + num2 + " and " + num3 + " is " + total );

    }
}
