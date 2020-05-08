package day09_NestedIf_Ternary;

public class Ternary_Practice {

    public static void main(String[] args) {

      //  char ch1 = '+';
        // System.out.println(ch1);

       int num = 100;
       char ch1 = ' ';

       if ( num > 0){
           ch1 = '+';
       }else if (num < 0){
           ch1 = '-';
       }else {
           ch1 = '0';
       }

       char ch2 = (num > 0) ? '+' : (num < 0) ? '-' : '0';

        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println("==========================================");

        byte score = 90;
        String grade = " ";
        if (score >= 90 && score <= 100){
            grade = "A";
        }else if (score >= 80 && score <= 90){
            grade = "B";
        }else if (score >= 70 && score <= 80){
            grade = "C";
        }else if (score >= 60 && score <= 70){
            grade = "D";
        }else if (score < 60 && score > 0){
            grade = "F";
        }else {
            grade = "Invalid";
        }
        System.out.println(grade);

        String grade2 = (score >= 90 && score <= 100)? "A" : (score >= 80 && score <= 90) ? "B"
                : (score >= 70 && score <= 80) ? "C" : (score >= 60 && score <= 70) ? "D"
                : (score < 60 && score > 0)? "F" : "Invalid";

        System.out.println(grade2);

        System.out.println("==========================================================");

        int num1 =1000;

        if(num1 %2 ==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }

        //   (num1 %2 ==0) ? System.out.println("Even number") : System.out.println("Odd number");

        // WE CAN ONLY APPLY TERNARY: if the if statement' body is only returning value and assigning it to variable then we can apply ternary




    }
}
