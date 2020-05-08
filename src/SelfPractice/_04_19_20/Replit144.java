package SelfPractice._04_19_20;

import java.util.Scanner;

public class Replit144 {

    public static void sign( int n){
        int positive = 1;
        int negative = -1;
        int zero = 0;

        if (n > 0){
            System.out.println(positive);
        }else if (n < 0){
            System.out.println(negative);
        }else {
            System.out.println(zero);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        sign(n);
    }

}
