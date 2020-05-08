package SelfPractice._04_01_20;

import java.util.Scanner;

public class Replit60 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String txt = word.substring(word.length()-1);

        System.out.println(txt);

    }
}
