package day13_StringClass;

import javax.sound.midi.Soundbank;

public class StringManipulations3 {

    public static void main(String[] args) {


        String str = "I like Java programming";
        int num1 = str.indexOf("J");

        System.out.println(num1);

        String str1 = "I like Java programming John";
        int num2 = str1.indexOf("John");

        System.out.println(num2);

        String str3 = "Cybertek school is awesome";
        int num3 = str3.indexOf("s");
        int num4 = str3.indexOf("is") +1;

        System.out.println(num3);
        System.out.println(num4);

        int maxIdexNumber =str3.length()-1;

        System.out.println(maxIdexNumber);

        String name = "Muhtar";
                 int a1 = name.indexOf("Good Guy");

        System.out.println(a1);

        String fullName = "Kuzzat Altay";
        String firstName = fullName.substring(0, fullName.indexOf(" ") );
        String lastName = fullName.substring( fullName.indexOf(" ") +1 );

        System.out.println(firstName);
        System.out.println(lastName);


    }

}
