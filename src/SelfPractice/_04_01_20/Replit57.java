package SelfPractice._04_01_20;

import java.util.Scanner;

public class Replit57 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter full name:");
        String fullName = input.nextLine();

        boolean name = fullName.equalsIgnoreCase("Max Payne") || fullName.equalsIgnoreCase("Alan Wake");

        String result = " ";

        if (name == true){
            result= ("User found!");
        }else {
            result= ("User not found!");
        }

        System.out.println(result);

    }
}
