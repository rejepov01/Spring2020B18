package day20_ArraysContinue;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String name = "Sha ";
        char [] characters  =  name.toCharArray();

        System.out.println(Arrays.toString(characters));

        String str = "Cybertek School";
        String str1 = "School Cybertek";

        char [] ch1 = str.toCharArray(); //  [C, y, b, e, r, t, e, k,  , S, c, h, o, o, l]
        char [] ch2 = str1.toCharArray();  //  [S, c, h, o, o, l,  , C, y, b, e, r, t, e, k]

        Arrays.sort(ch1); //  [ , C, S, b, c, e, e, h, k, l, o, o, r, t, y]
        Arrays.sort(ch2);  // [ , C, S, b, c, e, e, h, k, l, o, o, r, t, y]

        boolean euqlStr = Arrays.equals(ch1,ch2);

        System.out.println(euqlStr);

    }

}
