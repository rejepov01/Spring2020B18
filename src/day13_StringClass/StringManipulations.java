package day13_StringClass;

public class StringManipulations {

    public static void main(String[] args) {

        String str = "Cybertek";  // now located in Java pool
        //            01234567

        char ch1 = str.charAt(5); // 't'
        System.out.println(ch1=='A');
        //                 't' == 'A'  ==> false

        System.out.println(ch1=='T');
        //                 't' == 'T' ==> false

        int totalLength = str.length();
        System.out.println(totalLength);

        System.out.println(totalLength>250); // false

        String str2 = "Today is great day, Java is Fun";
                    // 0123455...
        int maxIndexNum = str2.length() - 1;
        System.out.println(maxIndexNum);  // Max Index number is 30 , Maximum character number 31

        String s1 = "Cybertek";
                s1 =s1.concat(" School"); //  Cybertek School

        System.out.println(s1); // s1 = Cybertek School

        String s2 = "Java";
        System.out.println( s2.concat(" is a programming language") ); // "Java is a programming langauge"
        System.out.println(s2); // Java

        s2 = s2.concat(" is a programming language");
        System.out.println(s2);

        String r1 = "Java is fun";
               r1 = r1.concat(", and it's easy");  // concat to second word

        System.out.println(r1);

        String name1 = "CYBERTEK";
           name1 = name1.toLowerCase(); // convert to lower case

        System.out.println(name1);

        String name2 = "cybertek school";
               name2  = name2.toUpperCase();  // convert to upper case

        System.out.println(name2);

        String A1 = "         Today    is   a   great   day   ";
                A1  = A1.trim();  // trim the space without words
        System.out.println(A1);



    }
}
