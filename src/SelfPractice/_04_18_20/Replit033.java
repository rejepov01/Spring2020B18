package SelfPractice._04_18_20;

import java.util.Scanner;

public class Replit033 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter number of milligrams in drink:");
        int caffeineInDrink = input.nextInt();
        int oneGramInMg =1000;
        int lethalGram = 10;
        int overdose = (lethalGram*oneGramInMg)/caffeineInDrink;

            System.out.println("It would take about "+overdose+" drinks for a lethal overdose");


    }
}
