package SelfPractice._04_25_20;

public class Practice_StringManipulations {

    public static void main(String[] args) {

        String str = "Macbook Air";
                //    012345678910
         char ch = str.charAt(8);
       String ch1 = ""+str.charAt(4) + str.charAt(0);

        System.out.println(ch == 'k');
        System.out.println(ch1);

        int totalLength = str.length();

        System.out.println(totalLength); // total number of characters is 11

        int totalIndexNumber = str.length()-1;

        System.out.println(totalIndexNumber);

        String str1 = "substring(beginning index, ending index): creates substring of the string value from the beginning index till the ending index (ending index is EXCLUDED)";

        int totalLength1 = str1.length();

        System.out.println(totalLength1);

        int totalIndexNumber1 = str1.length()-1;

        System.out.println(totalIndexNumber1);

        String s1 = "Sceptre";

        String s3 = s1.concat(", "+ str);

        System.out.println(s3);

        System.out.println();

        String s2 = str.concat(" "+s1);

        System.out.println(s2);

        String name1 = str.toLowerCase();

        System.out.println(name1);

        String name2 = str.toUpperCase().concat(", "+str.toLowerCase()).concat(", "+str.concat(", "+s1));

        System.out.println(name2);

        String nam1 = str1.toUpperCase();

        System.out.println(nam1);


    }

}
