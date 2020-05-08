package day13_StringClass;

public class StringLiterals {

    public static void main(String[] args) {

        String str1 = "Cat";   // String Literal going to String pool
        String str2 = new String ("Cat");   //  going to Java Heap

        System.out.println(str1+" : "+str2);
        System.out.println(str1 == str2); // two different object ,

        String str3 = "Cat"; // string pool

        String str4 = new String("Cat");
        System.out.println( str2 == str3); // two independent object, false


        String s1 = " Java" ; // String pool , immutable we cannot modify it
        s1 = "JavaScript";  // new object will be written in memory

        System.out.println(s1); // Java Script

        String s2 = "Java"; // no new object will be written in the memory

        System.out.println(s1 == s2); // false
        //       "JavaScript" == "Java"


    }

}
