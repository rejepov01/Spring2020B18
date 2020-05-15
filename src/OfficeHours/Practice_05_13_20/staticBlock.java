package OfficeHours.Practice_05_13_20;

public class staticBlock {

    static String str ;
       //    str = str.toUpperCase(); error cant initialize


    static {

        str = "Cybertek";
        str = "Harvard";
        str = "MIT";
    }

    public static void main(String[] args) {
        str = "Cybertek";
        System.out.println( str);
    }
}


class staticBlockTest{

    public static void main(String[] args) {
        System.out.println( staticBlock.str );
    }
}
