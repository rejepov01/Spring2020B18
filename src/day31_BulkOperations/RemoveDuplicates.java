package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3));

        ArrayList<Integer> result = new ArrayList<>();
                         // expected result: [1,2,3]

        // System.out.println(result); result is empty as of now

        for (Integer each : list){  // each: 1,1,2,2,3,3
            if (!result.contains(each)){
                result.add(each);
            }
        }

        System.out.println(result);

        /*
        write a program that can remove duplicates from an array of integer
        do not use for each loop
         */

        Integer[] arr1 = {1,1,2,2,3,3};

        ArrayList<Integer> nonDuplicates = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++){
            if (!nonDuplicates.contains(arr1[i])){
                nonDuplicates.add(arr1[i]);
            }
        }


        /*
        review below at your own 
            +,
            []
            +=
         */

        System.out.println(nonDuplicates);

    }
}
