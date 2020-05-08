package SelfPractice._04_02_20;

import java.util.Scanner;

public class Replit32 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int seconds = input.nextInt();

       int hour = (seconds/60)/60;  // hour = (seconds / minutes ) /
       int minutes = (seconds/60)%60;
       int second = (seconds%60);

        System.out.println(hour +" hours, "+minutes+" minutes, and "+second + " seconds");



    }
}
