package SelfPractice._03_23_20;

public class Tenary {

    public static void main(String[] args) {

        int num = 100;
        String result = " ";

        if (num % 2 == 0){
            result = "Even Number";
        }else {
            result = "Odd Number";
        }
        String result1 = (num % 2 == 0)? "Even Number" : "Odd Number";

        System.out.println(result);
        System.out.println(result1);

        System.out.println("================================================");

        int num1 = 85;
        char ch1 = ' ';

        if (num1 > 0){
            ch1 = '+';
        }else if (num1 < 0){
            ch1 = '-';
        }else {
            ch1 = '0';
        }
        char ch2 = (num1 >0)? '+' : (num1<0)? '-' : '0';

        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println(" ========================================================");

        byte score = 75;
        String grade = " ";

        if(score >= 90 && score <= 100){
            grade = "A";
        }else if (score >= 80 && score <=90){
            grade = "B";
        }else if (score >= 70 && score <= 80){
            grade = "C";
        }else if (score >= 60 && score <=70){
            grade = "D";
        }else if (score < 60 && score >0){
            grade = "F";
        }else {
            grade = "Invalid Entry";
        }
            String grade1 = (score >= 90 && score <= 100)? "A" : (score >= 80 && score <=90)? "B"
                    : (score >= 70 && score <= 80) ? "C" : (score >= 60 && score <=70 )? "D"
                    :(score < 60 && score >0) ? "F" : "Invalid Entry";

        System.out.println(grade);
        System.out.println(grade1);

    }
}
