package OfficeHours.Practice_04_15_20;

import java.util.Arrays;

public class Multi_DimensionalArrays {

    public static void main(String[] args) {

        int [] arr1D = {1, 2, 3};

        int [] [] arr2D = { {1, 2, 3}, {4, 5, 6, 7} };
        //                      0            1


        System.out.println(arr2D[1]);
        System.out.println(Arrays.toString(arr2D[1]));

        // 7
        System.out.println(arr2D[1][3]);

        // 3
        System.out.println(arr2D[0][2]);

        System.out.println(Arrays.deepToString(arr2D));

    }

}
