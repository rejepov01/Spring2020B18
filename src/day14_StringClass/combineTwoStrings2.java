package day14_StringClass;
/*
2. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana


 */


import java.util.Scanner;

public class combineTwoStrings2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first word");
        String word1 = input.next();   // apple
        word1 = word1.substring(1); // pple

        System.out.println("Enter your second word");
        String word2 = input.next();   // banana
        word2 = word2.substring(1); // anana

        String result = word1.concat(word2);

        System.out.println(result);


    }

}
