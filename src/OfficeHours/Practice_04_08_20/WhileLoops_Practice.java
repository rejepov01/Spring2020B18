package OfficeHours.Practice_04_08_20;

public class WhileLoops_Practice {

    public static void main(String[] args) {

        /*
        while(Condition) {
              statements
        }

        repeated if statement
        execution order:
                1. condition
                    if true: executes statements
                    if false: stops the loop

         */

        for (int i =0; i < 5; i++ ){
            System.out.println("Hello World " +i);
        }

        System.out.println("==================================");

        int z = 0;
        while (z<5){
            System.out.println("Hello Cybertek " +z);
            z++;
        }

        System.out.println("==========================================");

        int a = 0;
        while (a <= 100){
            if (a % 15 ==0){
                System.out.print(a + " ");
            }
            a++;
        }

    }
}
