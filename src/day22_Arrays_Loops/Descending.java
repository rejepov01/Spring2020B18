package day22_Arrays_Loops;

import java.util.Arrays;

public class Descending {

    //  2. write a program that sort the array in descending order

    public static void main(String[] args) {
        // 1. Sort the array in ascending
        // 2. reverse the array that's sorted in ascending  ==> descending

        int[] arr = {10, 78, 2, -1, 500, 70};
        Arrays.sort(arr); // sort in ascending

        System.out.println(Arrays.toString(arr));  // just to see the values in order

        int [] RevArr = new int[arr.length];

        int j = arr.length-1;  // we assigned j because to pair arr values to j
        for (int i = 0; i < arr.length; i++){  // i assigned to Rev
            RevArr [i] = arr[j];
            j--;
        }

        System.out.println(Arrays.toString(RevArr));

    }

}
