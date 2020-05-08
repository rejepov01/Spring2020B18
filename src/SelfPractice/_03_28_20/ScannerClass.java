package SelfPractice._03_28_20;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        byte num1 = input.nextByte();

        System.out.println("Enter second number: ");
        byte num2 =input.nextByte();

        byte sum = (byte) (num1+num2);

        System.out.println("Sum of the two numbers is : " +sum);


    }

}
