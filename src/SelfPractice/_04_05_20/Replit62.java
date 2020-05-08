package SelfPractice._04_05_20;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Replit62 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String result = " ";
        result = word.substring(0,1)+word.substring(word.length()-1);

        System.out.println(result);

    }


}
