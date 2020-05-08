package day16_ForLoop;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "abab";
        //            0123

        String result = "";  // "ab" we store the expected result in this variable

        for (int i = 0; i <= 3; i++) { // 0, 1, 2, 3
          /*
            if (!result.contains(""+str.charAt(i) )){
                result += str.charAt(i);
            }

           */                                // i is the index number
            if (result.contains("" + str.charAt(i))) {  // if the string result does not contains str.ChartAt(I), then we concate it to the result, if it does we will not add
                continue;
            }
            result += str.charAt(i);   // only gets executed if str.charAt(i) is not contained in the result
        }

        System.out.println(result);
    }

}
