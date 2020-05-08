package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String name = "Java"; // 'J' , 'a', 'v', 'a'

        char [] chars = name.toCharArray();

        System.out.println(chars[0]); // 'J'
        System.out.println(chars[3]); // 'a'

        //  System.out.println(chars[4]);

        String str = "I like Java";

        String [] arr  = str.split(" ");

        System.out.println(Arrays.toString(arr));


        /*
        reverse sentence: day great is today
         */

        String sentence = "Today is great day";

         String [] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        for (int i = words.length-1; i >=0; i--){
            String eachWord = words[i];
            System.out.print(eachWord+" ");
        }
        System.out.println();

        String str2 = "ABCD";
        String arr2 [] = str2.split("");  //  ["A","B","C","D"]
        char [] ch2 = str2.toCharArray(); // ['A','B','C','D']

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(ch2));

        int [] num1 = new int[3];
        int[] num2 = {1,2,3,4,5,};
        num1=num2;

        for (int i=0; i< num1.length; i++){
            System.out.print(num1);
        }

    }

}
