package day18_NestedLoop;

public class NestedLoop {

    public static void main(String[] args) {


        for (int j = 0; j< 10; j++){

            for (int i = 1; i <= 5; i++){  // 1,2,3,4,5
                System.out.print(i+" ");
            }

            System.out.print(" ");
        }

        System.out.println("\n =================================================");

        /*

         ******
         ******
         ******
         ******
         ******
         ******
         ******

         */

        for (int i = 0; i <7; i++ ){   //  outer loop repeating the inner loop over and over again

            int a = 1;
            while (a <= 6){
                System.out.print("* ");
                a++;
            }
            System.out.println();

        }







    }

}
