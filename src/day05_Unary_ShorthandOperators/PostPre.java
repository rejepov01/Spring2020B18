package day05_Unary_ShorthandOperators;

public class PostPre {

    public static void main(String[] args) {

        int a = 100;
        System.out.println( ++ a); // 101
        System.out.println(a);

        int b = 100;
        System.out.println( -- b ); // 99
        System.out.println( b ); // 99

        // Post: first passes the current value, then changes variable value

        int A = 100;
        System.out.println(A++); // A is still 100
        System.out.println(A); // 99

        int B = 100;
        System.out.println(B--); // 100
        System.out.println(B ); // 99

        // post & pre examples

        int z = 10;
        int x = ++z; // 11 , is increased by 1

        System.out.println(z); // 11
        System.out.println(x); // 11

        int s = 10;
        int f = s++;
        System.out.println(f); // 10
        System.out.println(s++); // 11

        int a1 = 50;













    }

}
