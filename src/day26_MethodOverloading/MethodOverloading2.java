package day26_MethodOverloading;

import java.util.Arrays;

public class MethodOverloading2 {
    /*
    first method: print the sum of two int numbers
    second method: print the sum of three int numbers
    third method: print the sum four int number
     */

    public static void main(String[] args) {
        // 10,5
        sumOf2Numbers(10,5);

        // 10,5,5
        sumOf3Numbers(10,5,5);

        // 10,20,30,5
        sumOf4Numbers(10,20,30,5);

        System.out.println("=======================================================");

        // 10,5
        sum(10,5);

        // 10,5,5
        sum(10,5,5);

        // 10,20,30,5
        sum(10,20,30,5);

        int [] arr1 = {3,2,1};

        char[] arr2 = {'z','s','a'};

        double[] arr3 = {7.4,6,5,20.4};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3); // same method name, different parameter



    }


    public static void sumOf2Numbers (int a, int b){
        System.out.println(a+b);
    }

    public static void sumOf3Numbers(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void sumOf4Numbers(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }

   // =========================================================================================

    public static void sum(int a,int b){
        System.out.println(a+b);
    }

    public static void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void sum(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }



}
