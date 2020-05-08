package day10_Siwtch_Scanner;

public class SwitchStatement_Practice3 {

    public static void main(String[] args) {

        char ch = 'a';
        String result = " ";   // We can use either sout or String

        switch (ch) {
            case 'A':
               // System.out.println("A");
                result = "A";
                break;
            case  'B':
               // System.out.println("B");
                result = "B";
                break;
            case 'C':
                // System.out.println("C");
                result ="C";
                break;
            case 'D':
               // System.out.println("D");
                result = "D";
                break;
            default:
               // System.out.println("Invalid");
                result = "Invalid";

        }

        System.out.println(result);  // If there is not break between cases compiler will run all of them

    }

}
