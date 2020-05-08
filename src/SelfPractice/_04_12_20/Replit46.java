package SelfPractice._04_12_20;


import java.util.Scanner;

public class Replit46 {

    public static void main(String[] args) {

        int num, digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num1 = input.nextInt();

        int d1 = num1/10000;
        System.out.println(d1);

        int d2 =(num1 % 10000) / 1000 ;
        System.out.println(d2);

        int d3 = ((num1 % 10000) %1000) / 100;
        System.out.println(d3);

        int d4 = (((num1 % 10000) % 1000) % 100) / 10;
        System.out.println(d4);

        int d5 = num1 % 10;
        System.out.println(d5);








    }

}
