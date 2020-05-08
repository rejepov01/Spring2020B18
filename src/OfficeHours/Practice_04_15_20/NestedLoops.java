package OfficeHours.Practice_04_15_20;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NestedLoops {

    public static void main(String[] args) {

        char [] [] arr2D = { {'A','B'}, {'C','D','E' }, {'F','J','H'} };
        //                        0           1                2


        for (int j =0; j < arr2D.length; j++){  // j: index of nums of 1D arrays or outside one
            for (int i = 0; i < arr2D[j].length; i ++){  // i : index num of elements in 1D
                System.out.print(arr2D[j][i]+" ");
            }

        }

        System.out.println();

        System.out.println("==========================================================");
        // arr2D = { {'A','B'}, {'C','D','E' }, {'F','J','H'} };
          //             0           1                  2

        for ( char[] each1DArrays  : arr2D  ){

            for ( char eachElement  : each1DArrays)
            System.out.print(eachElement + " ");
        }


    }


}
