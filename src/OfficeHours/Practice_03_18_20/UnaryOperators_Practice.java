package OfficeHours.Practice_03_18_20;

public class UnaryOperators_Practice {

    public static void main(String[] args) {
        // post
        int a = 20;
        System.out.println(a++);
        System.out.println(a);


        int b = 30;
        int c = b--;
        System.out.println(b);
        System.out.println(c);

        int d = 40;
        int e = d++;
        System.out.println(d);
        System.out.println(e);

        // pre

        int x = 200;
        System.out.println(++x);
        System.out.println(x);

        int z = 100; // 101 ==> 100 ==> 99 ==>
        z = z++ + -- z - z -- + ++z;
        //  100 + 100  - 100 + 100
        System.out.println(z); // 200

        int u = 900; // 901 , 902 , 902 ==> u = 903
        int r = - ++u + ++u + -u++;
        //    - 901 + 902 + -902 ==> -901
        System.out.println(r);
        System.out.println(u);



    }
}
