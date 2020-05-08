package day06_Shorthnd_LogicalOperators;

public class ShorthandOperators {

    public static void main(String[] args) {

        int x = 20;
            x += 10; // x = x + 10 = 30

        System.out.println( x );

        x+= 60; // x = x + 60 = 90

        System.out.println( x );

        String schoolName = " CyberTek ";
           schoolName += 12345; // schoolName = schoolName + 12345

        System.out.println(schoolName);

        System.out.println( 'a' + 'b');
        //                   97 + 98 = 195

        char ch1 = 'a'; // 97
             ch1 += 'b'; // 98
        System.out.println(ch1); // character

        int num = 'z'; // num = 122
            num += 'x'; // num = 122 + 120 = 242

        System.out.println(num);

        int A = 100;
            A-= 90;

        System.out.println(A);

        int B = 200;
            B -= A; // B = 200 - 10

        System.out.println(B);

        int a = 2;
            a *= 3;
        System.out.println(a);

        int b = a*=10;
          // b = a = a*10
        System.out.println(b); // 60
        System.out.println(a); //

        int num2 = 400;
        num2 /= 20 + 10;  // num2 = num2 / 30
        // num2 = 400 / 30    13.123
        // num2 = 13

        System.out.println(num2);


        int num3 = 300;
        num3  %= 10 + 20;  // num3 %=  30
        // num3  = num % 30
        // num3 = 300 % 30  ==> 0

        System.out.println(num3);


        int n1 = 400;
        n1 %= 3*5 ;  //  n1 %=  15
        // n1 = n1%15
        // n1 = 400 % 15

        // 400 / 15 = 26.66666
        // remainder: 400 - ( 15 * 26) = 10

        System.out.println(n1);






    }

}
