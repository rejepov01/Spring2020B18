package day04_JavaRecap;

public class ArithmeticOperators {

    public static void main(String[] args) {

        // 10/3 = 3.33333
        int a = 10 / 3 ; // 3
        System.out.println(a); // 3

         // 10 / 4  ==> 2.5
        System.out.println( 10 / 4 ); // 2

         double d = 10/4 ;
           // double d = 2 ;
         //  d ==> 2.0
        System.out.println(d); // 2.0

        System.out.println( 10.0 / 4); // 2.5

        System.out.println( 10 / 4.0 ); // 2.5

        // 10 / 4 = 2.5
        float f = 10 / 4f ;  // without f the output will be 2 , with f it will give 2.5
         // float f1 = 2;
        System.out.println(f);  // 2.0 this is without f


        boolean evenNumber = 25 % 2 == 0;
         //                  1 == 0 ==> false
        // if 25 / 2  has a reminder of zero, then it's even number

        System.out.println( evenNumber ); // false
        System.out.println( 25 % 2 ); // 1

        boolean oddNumber = 22 % 2 != 0 ;  // odd number

                    //   0 != 0 ==> false

        System.out.println(oddNumber);

        System.out.println( 10 % 2 == 0 ); // 10 is even number

        System.out.println( 11 % 2 != 0 );  // 11 is even number

        System.out.println( "10 is even number: " + ( 10 % 2 == 0 ) );
        System.out.println( "11 is even number: " + ( 11 % 2 == 0 ) );

        System.out.println("25 is odd number: " + ( 25 % 2 != 0 ) );

        System.out.println("25 is even number: " + ( 25 % 2 == 0 ));
        System.out.println("25 is even number: "+ !(25 % 2 != 0) );










    }

}
