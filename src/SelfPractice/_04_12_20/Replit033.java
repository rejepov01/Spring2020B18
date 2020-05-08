package SelfPractice._04_12_20;

import java.util.Scanner;

public class Replit033 {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("Enter current count for SeniorCitizens and nonSeniorCitizens:");
        int seniorCitizens = input.nextInt();
        int nonSeniorCitizens = input.nextInt();
        System.out.println("What is new citizen's age?");
        int age = input.nextInt();
        if (age >= 65){
            System.out.println("Senior Citizen " );
            seniorCitizens++;
        }else {
            System.out.println("NonSeniorCitizen ");
            nonSeniorCitizens++;
        }
        System.out.println("New seniorCitizens Count " +seniorCitizens );
        System.out.println("New nonSeniorCitizens Count " +nonSeniorCitizens);

    }


}
