package SelfPractice._04_21_20;

public class MethodOverloading_1 {
    /*
            first method: can find the sum of two int numbers
            second method: can find the sum of two double numbers
     */

    public static void main(String[] args) {
        //  10, 65
        int num1=  sum(10,65);
        System.out.println(num1);

        // 25.4 , 24.6
        sum(29.4,24.6);

        double num = sum(22.8,27.2);
        System.out.println(num);

    }


    public static int sum(int a, int b){
        return a+b;
    }
    public static double sum(double a, double b){
        return a+b;

    }

}
