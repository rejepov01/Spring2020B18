package day19_Arrays;
/*
	2. write a program that can return the frequency of the characters in a string
		Ex: "AABCBCA" ==> "A3B2C2"

 */
public class Frequency {

    public static void main(String[] args) {

        String str = "AABCC";  // "A2B1C2"

        String result = "";

        String nonDuplicates ="";    // ABC

        for (int i = 0; i <=str.length()-1; i++){

            if (!nonDuplicates.contains(""+str.charAt(i)) ){
                nonDuplicates += str.charAt(i);
            }
        }

   //      System.out.println(nonDuplicates);

   //     nonDuplicates = "ABC";       str = "AABCC";   ==> result = "A2B1C2"

        for(int j = 0 ; j <= nonDuplicates.length()-1; j++ ) {
            char ch = nonDuplicates.charAt(j);


            int count = 0;   // count the total number of occurence of each character from str

            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == 'A') {
                    count++;
                }

            }

            result += "" + 'A' + count;
        }

        System.out.println(result);
    }
}
