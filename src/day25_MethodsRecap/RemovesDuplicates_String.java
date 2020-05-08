package day25_MethodsRecap;

public class RemovesDuplicates_String {

    /*
    warmup task:
	1.  write a return method that accepts a String and removes duplicate values from the String
		Ex:
				RemoveDuplicate("aaabbbccc");  ==> "abc"

     */

    public static void main(String[] args) {
        String str = "ABABABABBA";

        String result = "";       // AB

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i); // A
            if ( !result.contains(""+ch) ){
                result += ch;
            }
        }

        System.out.println(result);

        String str2 = "ABCABCABC";

        String result2 = RemoveDuplicates(str2);

        System.out.println(result2);
    }

    public static String RemoveDuplicates(String str){
        String result = "";       // AB

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i); // A
            if ( !result.contains(""+ch) ){
                result += ch;
            }
        }
        return result;
    }





}
