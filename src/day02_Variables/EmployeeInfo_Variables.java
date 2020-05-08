package day02_Variables;

public class EmployeeInfo_Variables {

    public static void main(String[] args) {

        /*
           create a class called EmployeeInfo_Variables:
           print:
                your company's name
                your name
                your EmployeeId
                your JobTitle
                your Salary

         */

          String employeename = "Andrea";
          String companyname = "Oracle";
          int employeeId = 9;
          String jobTitle = "QA";
          double salary = 100000.5;
          int ssn = 234563736;
          // Employee Name:  Andrea

        System.out.println("Employee Name: " + employeename);
        System.out.println("Company Name: " + companyname);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
        System.out.println("Social Security Number: " + ssn);

/*
        System.out.println("Employee Name: " + employeename + "\nCompany Name: " +
                companyname + "\nEmployee ID: " + employeeId + "\nJob Tile: " +
                jobTitle + "\nSalary: " + salary + "\nSocial Security Number: " + ssn );

 */

        System.out.println("=============================================================");


        String firstName = "Hunar";
        String lastName = "Muhammad";

        // Full Name: Zeynep Dere

        System.out.println("Full Name: " +firstName + "  " +lastName);


        System.out.println(11 + 10 ); // 21 addition
        System.out.println("11" + "10 "); // 1110 concatenation



    }

}
