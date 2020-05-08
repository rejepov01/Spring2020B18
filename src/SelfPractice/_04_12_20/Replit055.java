package SelfPractice._04_12_20;

import java.util.Scanner;

public class Replit055 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = input.nextInt();
        String result = "";

        switch (num){
            case 1:
                result = "Monday";
                break;
            case 2:
                result="Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result="Saturday";
                break;
            case 7:
                result= "Sunday";
                break;
            default:
                result = "Invalid Entry";
                break;
        }

        System.out.println(result);
    }

}
