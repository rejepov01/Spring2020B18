package day14_StringClass;
/*
Ask user to enter a word. Print true is the first and last characters of the string are same characters,
 print false otherwise.
            Input:
                abba
            Output:
                true

 */


import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.Scanner;

public class EnterWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.next();

        if (word.charAt(0)==word.charAt(word.length()-1)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


        System.out.println("================================================");

        System.out.println("Enter your word");
        String enterWord = input.next();

        if (enterWord.endsWith("ly")){
            System.out.println("really");
        }else {
            System.out.println("never mind");
        }



    }

}
