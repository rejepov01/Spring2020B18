package SelfPractice._04_25_20;

public class Practice_StringManipulations2 {

    public static void main(String[] args) {

        String str = "String represents the sequences of characters";

        int totalCharacters = str.length();
        System.out.println("total number of characters: "+totalCharacters);

        int totalNumberOfIndex= str.length()-1;
        System.out.println("total number of index is: "+totalNumberOfIndex);

        String str1 = str.substring(0,30);
        System.out.println(str1);

        String letters =str.charAt(25)+" "+ str.charAt(18)+" "+str.charAt(39);
        System.out.println(letters);

        String a = str.replace("the","a");
        System.out.println(a);

        a =str.replaceFirst("a","the");
        System.out.println(a);

        int z = str.indexOf("seq");
        System.out.println(z);

        int x = str.indexOf("characters");
        System.out.println(x);

        String v = str.substring(35,44);
        System.out.println(v);



    }

}
