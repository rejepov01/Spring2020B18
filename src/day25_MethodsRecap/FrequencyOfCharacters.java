package day25_MethodsRecap;

import Resources.Library;

public class FrequencyOfCharacters {
    /*
    3. Combine above two methods to write a return method that can return the frequency of characters as a string from any given string
		Ex:
			FrequencyOfChars("ABABCB"); ==> "A2B3C1";
			FrequencyOfChars("AAABCCCDD") ==> "A3B1C3D2"
     */

    public static void main(String[] args) {
        String str = "AABBCC"; // A2B2C2
        String NonDup = Library.RemoveDuplicates(str); //  ABC
        String result = "";

        for (int i = 0; i < NonDup.length(); i++){
            String ch = ""+NonDup.charAt(i); // "A"
            int num = Library.Frequency(str,ch);
            result += ch+num;
        }
        System.out.println(result);
    }

    public static String FrequencyOfChars(String str){
        String NonDup = Library.RemoveDuplicates(str); //  ABC
        String result = ""; // contains the frequency of chars

        for (int i = 0; i < NonDup.length(); i++){
            String ch = ""+NonDup.charAt(i); // "A"
            int num = Library.Frequency(str,ch);
            result += ch+num;
        }
        return  result;
    }

}
