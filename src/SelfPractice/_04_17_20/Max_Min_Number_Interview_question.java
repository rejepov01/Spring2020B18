package SelfPractice._04_17_20;

public class Max_Min_Number_Interview_question {
    /*
    1. write a methods that can return the maximum number between two numbers
			Ex: Max(10, 20) ==> 20
     */

    public static void MaxNumber (int num1,int num2){
        if (num1>num2){
            System.out.println("Maximum number is :"+num1);
        }else {
            System.out.println("Maximum number is: "+num2);
        }

    }

    public static void MinNumber(int num1,int num2){
        if (num1<num2){
            System.out.println("Minimum number is: "+num1);
        }else {
            System.out.println("Minimum number is: "+num2);
        }
    }

    public static void main(String [] args){
        int a = 5;
        int b = 7;

        MaxNumber(a,b);
        MinNumber(a,b);

    }

}
