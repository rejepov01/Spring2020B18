package SelfPractice._04_15_20;

import java.util.Scanner;

public class Replit110 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] num = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int countEven =0;
        for ( int each : num ){
            if (each % 2 == 0){
                countEven++;
            }

        }

        System.out.println(countEven);


    }
}
