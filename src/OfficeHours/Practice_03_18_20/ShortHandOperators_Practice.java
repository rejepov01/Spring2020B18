package OfficeHours.Practice_03_18_20;

public class ShortHandOperators_Practice {

    public static void main(String[] args) {

        // += addition assigment

        int a = 100;
        a += 200;
        // a = a + 200
        // a + 100 + 200 = 300

        System.out.println(a);

        a += 200 * 3; // 900
        System.out.println(a);

 // -= subtraction
        a-= 400;
        System.out.println(a); // 500

        int b = 300;
         b -= 3*40;
        System.out.println(b);

        // *= multiplication

        int x = 5;
        x*= 3;
        System.out.println(x); // 15

        x *= 2+1;

        System.out.println(x); // 45

        // /= division

        int n = 900;
        // n = n / 3
        n /= 3; // instead of doing above step just using shorthand will be quickly

        System.out.println(n); // 300

        n /= 3*5; // n = n / 15 ==> 300 / 15 ==> n = 20

        System.out.println(n); // 20

        // %= remainder assignment

        int m = 10;
        m %= 3;

        System.out.println(m); // 1

        int y = 300;

        y %= 3*5;

        System.out.println(y); // 0

    }
}
