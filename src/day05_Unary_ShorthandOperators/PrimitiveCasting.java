package day05_Unary_ShorthandOperators;

public class PrimitiveCasting {


    public static void main(String[] args) {

          // implicite casting done automatically
        int a = 10;
        long b = a;  // implicit casting is done automatically
               // b = 10L;


        // int c = b; // b is still long datatype

        int a1 = 100;
        long b1 =  (long) a; // manually doing implicit casting

        // int c1 = b1

        // Explicite casting

         int Inum = 100;
         byte Bnum = (byte)Inum;

         short Snum = (byte)Inum;

         double Dnum = 5.5;

         float Fnum = (float)Dnum; // 5.5

        System.out.println(Fnum + 1); // when we add 1
        System.out.println(Fnum);

        float f = (int)Dnum; // 5.0
        System.out.println(f);
         // Fnum = (int) 5.5
        //  Fnum = 5 ;
        //  Fnum = 5.0

        double d1 = 10.5;
        long L1= (int) d1;
        System.out.println(L1); // 10

        float F1 = 60.5f;
        int I1 = (int) F1; // preferred
        System.out.println(I1);

        long largeNum = 9999999999999L;

        int intNum = (int) largeNum;
        System.out.println(intNum);
        // it gives a different number because 99999999 is out of int range

        char ch1 = 'a';

        short sh1= (short) ch1;
        System.out.println(sh1);

        char ch2 = 23456;

        double db1 = ch2; // 23456.0

        System.out.println(db1);

        int z1 = 10;

        double t1 = z1;




















    }
}
