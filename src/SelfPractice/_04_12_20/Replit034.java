package SelfPractice._04_12_20;

import java.util.Scanner;

public class Replit034 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupon = input.nextInt();
        int candyBar = (coupon / 10);
        int gumballs = (coupon % 10) / 3;

        if (coupon >=3){

            System.out.println("Number of Candies: "+candyBar);
            System.out.println("Number of Gumballs: "+gumballs);
        }else {
            System.out.println("Not enough coupons");
        }

    }

}
