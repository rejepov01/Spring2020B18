package day19_Arrays;
/*
1. write a program that can return the unique characters from a string
		Ex:  "AABCC" ==> "B"

 */
public class Uniques {

    public static void main(String[] args) {

        String str ="AABCC";

        String result = ""; // "B" ,  to store the unique characters  (was at the begging after he added other characters)

        for (int j = 0; j <= str.length()-1; j++){
            char ch2 = str.charAt(j);
            int count = 0;  // to count the occurence of the character

            for (int i = 0; i <= str.length()-1; i++){
                char ch = str.charAt(i);
                if (ch == ch2){
                    count++;
                }
            }
            if (count == 1){ // if the character at index J is unique, will be concated to the result
                result += ch2;
            }

        }

        System.out.println(result);

    }
}
