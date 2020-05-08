package day22_Arrays_Loops;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Multi_DArrays {

    public static void main(String[] args) {

     int [] arr = {1,2,3};
               //  0 1 2
     // n dimensional array contains (n-1) dimensional array


        // 2D array:  [index num of 1d array] [index num of elements]

        int [][] arr2D = { {1,2,3} , {1,2,3} };
               //             0         1

        int[] arr1D = arr2D[0];  // {1,2,3}

        System.out.println(Arrays.toString(arr1D));

        System.out.println(Arrays.toString(arr2D[0]));  // single dimensional array from arr2D

        System.out.println( arr2D[0][2] );  // 3

        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(Arrays.toString(arr2D [1]) );

        for ( int eachElement  : arr2D [0]  ){
            System.out.print(eachElement+" ");
        }

        for (int i = 0 ; i < arr2D [0].length; i++){
             int num  =  arr2D[0][i];
            System.out.print(num + " ");
        }

    }
}
