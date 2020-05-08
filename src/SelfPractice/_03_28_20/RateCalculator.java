package SelfPractice._03_28_20;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RateCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        int salary = input.nextInt();

        System.out.println("How many hours are you working per week: ");
        int hoursPerWeek = input.nextInt();

        System.out.println("How many weeks are working in a year: ");
        byte numberOfWeeks = input.nextByte();

        int hourlyRate = (salary /numberOfWeeks ) / hoursPerWeek;

        System.out.println("Your hourly rate is: $"+hourlyRate);

    }

}
