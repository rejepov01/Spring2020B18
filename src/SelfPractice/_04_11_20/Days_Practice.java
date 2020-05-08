package SelfPractice._04_11_20;

import java.util.Scanner;

public class Days_Practice {

    public static void main(String[] args) {

        String [] days = {"Monday","Tuesday", "Wednesday","Thursday","Friday","Saturday","Sunday"};

        Scanner input = new Scanner(System.in);

        int attempts = 1;

        for (int i = 0; i <7; i++){
            System.out.println("Enter a number from 0 to 6");
            int num = input.nextInt();

            attempts++;

            if (attempts > 3){
                System.out.println("Sorry, this was the last entry");
                System.exit(0);
            }

            String result = days[num];
            System.out.println("Today is " + result);

        }


    }

}
