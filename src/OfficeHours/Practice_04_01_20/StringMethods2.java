package OfficeHours.Practice_04_01_20;

public class StringMethods2 {

    public static void main(String[] args) {
        // isEmpty (): checks if the string is empty, returns boolean

        String str1 = "  ";

        boolean r1  =  str1.isEmpty(); // false
        boolean r2 = !str1.isEmpty(); // true

        System.out.println(r1);
        System.out.println(r2);

        // equals(str): checks if the two string of texts(only texts) are equal or not, returns boolean,

        //  ==

        String s1 = "cat";
        String s2 = new String("cat");
        String s3 = "Cat";

        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true

        System.out.println(s3.equals(s1)); // false, case sensitivity

        System.out.println(s3.equalsIgnoreCase(s1)); // true, ignores the case sensitivity




    }
}
