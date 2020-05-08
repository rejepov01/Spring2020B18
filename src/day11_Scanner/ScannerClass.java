package day11_Scanner;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
           // int a = 99999999999;
        System.out.println("Enter a long number: ");

        long a = input.nextLong();

        System.out.println("You have entered: " +a);

        System.out.println("Enter a decimal: ");
        double b = input.nextFloat();   // float can be assigned to double
        // long b = (long) input.nextFloat();  just for see how is it work

        System.out.println("You have entered: "+b);


        System.out.println("Enter a decimal number: ");
        double f =input.nextDouble();

        System.out.println("You have entered: "+f);

        System.out.println("Enter True or False: ");
        boolean bool = input.nextBoolean();

        System.out.println(bool);

        System.out.println("Enter you sentence: ");
        String str = input.next();

        System.out.println("You have entered : " +str);




    }


}
