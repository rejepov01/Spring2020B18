package SelfPractice._03_28_20;

import java.util.Scanner;

public class numbers_Scanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = input.nextInt();

        int max = ( num1>=num2 && num1 >= num3 )? num1 : (num2 >= num1 && num2 >=num3) ?  num2 : num3;

        int min = (num1 <= num2 && num1 <= num3) ? num1 : (num2 <= num1 && num2 <= num3 )? num2 : num3;

        System.out.println("Max number is: " + max);

        System.out.println("Minimum number is: " +min);

    }
}
