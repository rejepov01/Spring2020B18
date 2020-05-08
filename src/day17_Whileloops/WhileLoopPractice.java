package day17_Whileloops;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Yes or No");
        String word = input.next();

        if (word.equalsIgnoreCase("Yes")){
            System.out.println("Entered Yes");
        }

        if (word.equalsIgnoreCase("No")){
            System.out.println("Entered No");
        }

    }
}
