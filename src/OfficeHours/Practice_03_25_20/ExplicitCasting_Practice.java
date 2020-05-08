package OfficeHours.Practice_03_25_20;

public class ExplicitCasting_Practice {

    public static void main(String[] args) {

        byte bnum = 100;

        short snum = bnum ; // it calls implicite casting // smaller primitive types can Always be assigned
                              // to large primitive types

        int Inum = 200;

        short sNum = (short) Inum; // explicite casting, doing manually , bigger primitive types

        float fnum = (float) 0.5;
        System.out.println(fnum);

        float Fnum = (long)0.5;
        System.out.println(Fnum); // 0.0

        // long int short byte ==> only accepts whole numbers
        long Lnum =(long) 4.5;
        System.out.println(Lnum); // 4

        System.out.println( 9/2);
        System.out.println(9/ (float)2);

        System.out.println( 10.0 / 3);


    }

}
