package day24_Methods;

import java.util.Arrays;

public class returnMethods_Practice {

    /*
   1)  create a function that can print the maximum number from any given array
     */

    public static void main(String[] args) {
        int [] arr = {9,8,7,100,200,50,40};

        int max = MaxNumber(arr);

        System.out.println(max);

        int min = minNumber(arr);

        System.out.println(min);



    }


    public static int MaxNumber(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static int minNumber(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

}
