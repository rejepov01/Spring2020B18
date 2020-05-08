package SelfPractice._04_02_20;

import com.sun.media.jfxmediaimpl.HostUtils;

import java.util.Scanner;

public class Replit61 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        //WRITE YOUR CODE HERE

        int length1 = word1.length();
        int length2 = word2.length();

        String result = (length1 > length2 )? word1 : word2;

        System.out.println(result);



    }

}
