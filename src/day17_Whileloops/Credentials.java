package day17_Whileloops;

import java.util.Scanner;

public class Credentials {
    /*
    Write a program that asks user to enter his/her username and password until user enters correctly.
    user: cybertek
    password: cybertek123
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter User name");
        String username = input.next();

        System.out.println("Enter Password");
        String password = input.next();

        boolean valid = (username.equals("cybertek") &&   password.equals("cybertek123") );  // false
                    //  validating the first username and password

         int count = 1;

        while (! valid ){  // already have three attempts and credentials are still incorrect
            // true
            System.out.println("Please re enter your credetentions");
            System.out.println("Enter User name");
             username = input.next();

            System.out.println("Enter Password");
             password = input.next();

             valid = (username.equals("cybertek") &&   password.equals("cybertek123") ) ;
             //  validating a new username and password

            count++;

            if (count == 3 && !valid ){
                System.out.println("Your account is locked");
                break;
            }


        }

        if (valid){  // if credentials are correct
            System.out.println("Logged in");
        }


    }
}
