package day12_JavaRecap;

import java.util.Scanner;

 public class salaryReport {
    /*
        ask the user enter salaray
        ask the user enter full name
        ask the user to enter company name
        ask the user to enter SSN
        ask the user to enter JobTitle
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();

        scan.nextLine(); // enter

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        System.out.println("Enter Company Name: ");
        String companyName = scan.nextLine();

        System.out.println("Enter your SSN: ");
        long SSN = scan.nextLong();

        scan.nextLine();

        System.out.println("Enter Job Title: ");
        String jobTitle = scan.nextLine();

        System.out.println("Full name is: "+fullName);
        System.out.println("Job Title is: "+jobTitle);
        System.out.println("Company Name: "+companyName);
        System.out.println("SSN: "+SSN);
        System.out.println("Salary is: $"+salary);



    }

}
