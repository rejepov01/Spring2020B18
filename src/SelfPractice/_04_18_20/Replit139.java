package SelfPractice._04_18_20;

import java.util.Scanner;

public class Replit139 {

    public static void main(String[] args) {
        plus();

    }

    public static void plus (){

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = num1+num2;
        System.out.println("result: "+result);
    }

}
