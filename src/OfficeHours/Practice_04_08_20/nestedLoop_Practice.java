package OfficeHours.Practice_04_08_20;

public class nestedLoop_Practice {

    public static void main(String[] args) {
        /*

          nested loop: loop inside another loop
                        inner loop & outer loop

                nested loop: we only need them when we need to repeat a loop

            +++ outer loop repeats the inner loop

         */



        int j = 1;
        while (j < 6) {

            for (int i = 10; i <= 50; i += 10) {
                System.out.print(i + " ");
            }
            System.out.println();


            j++;
        }


        System.out.println("=================================================");
        /*
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         */




        for (int l = 0; l < 8; l++){

            for (int k = 0; k < 9; k++ ){
                System.out.print("* ");
            }
            System.out.println();

        }


        System.out.println("============================================");
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *

         */

        for (int k = 1; k < 8; k++){ // k ==> 1 , 2, 3, 4, 5, 6, 7

            for (int l = 1; l < k; l++ ){ // l==> 1, 2, 3, 4, 5, 6, 7
                System.out.print("*");
            }

            System.out.println("*");
        }

        for (int a = 7; a >0; a--){

            for (int b = 0; b < a; b++){
                System.out.print("*");
            }
            System.out.println("*");
        }





    }
}
