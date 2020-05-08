package day14_StringClass;

import java.util.Scanner;

public class credentials {
/*

username: cybertek
password: cybertekschool

 */
    public static void main(String[] args) {

        String validUserName = "cybertek";
        String ValidPassword = "cebertekschool";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");

        String inputUserName = input.next();

        System.out.println("Enter your password");

        String inputPassword = input.next();

        if (inputUserName.equals(validUserName) && inputPassword.equals(ValidPassword)) {
            System.out.println("Log in successfully");
        }else {
            System.out.println("Log in Invalid");
        }



    }

}
