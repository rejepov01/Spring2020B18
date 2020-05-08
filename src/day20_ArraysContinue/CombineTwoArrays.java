package day20_ArraysContinue;

import java.util.Arrays;

public class CombineTwoArrays {

    public static void main(String[] args) {

        int [] arr = {1,2,3};
        int [] arr1 = {4,5,6,7};

        int[] arr2 = new int[arr.length+arr1.length];  // can contain all the elements from array1 and array2

        for (int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }

        for (int i = 0; i < arr1.length; i++){
            arr2[arr.length+i] = arr1[i];
        }


        System.out.println(Arrays.toString(arr2));
    }

}
