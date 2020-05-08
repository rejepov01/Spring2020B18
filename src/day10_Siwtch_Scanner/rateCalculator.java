package day10_Siwtch_Scanner;
/*
write a program for the rate calculator: rateCalculator
                        1. asks the user to enter salary (as integer)
                        2. asks the user how many hours does she/he works in a week
                        3. print the hourly rate

 */

import java.util.Scanner;

public class rateCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter your salary ");
             int salary  = input.nextInt();

             System.out.println(" How many hours do you work per week ");
             byte weeklyHours = input.nextByte();

             System.out.println("How many weeks are you working in a year ");
             byte numberOfWeeks = input.nextByte();
             // hourlyRate = ( salary / numberofweeks) / weeklyHour

         int hourlyRate = ( salary / numberOfWeeks) / weeklyHours;
        System.out.println("Your hourly rate is: $"+hourlyRate);







    }

}
