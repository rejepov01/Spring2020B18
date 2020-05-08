package SelfPractice._04_15_20;

import java.util.Arrays;
import java.util.Scanner;

public class Replit115 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String [] words = new String[5];

        for (int i = 0; i < 5; i++ ){
            words [i] = input.nextLine();
        }
            String str ="";
        for ( String eachLongest : words){
            if (eachLongest.length() > str.length() ){
                str =eachLongest;
            }
        }

        System.out.println(str);

    }

}
