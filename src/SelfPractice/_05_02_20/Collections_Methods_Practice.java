package SelfPractice._05_02_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Methods_Practice {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        int max = Collections.max(list);
        System.out.println(max);

        int min = Collections.min(list);
        System.out.println(min);

        /*
            1. write a program that can return the second maximum number from Arraylist
                    Ex: {1,2,3,4,5,6,7,8,8};
                            output: 7
            2. write a program that can return the second minimum number from Arraylist
                Ex: {1,1,2,3,4,5,6,7,8,8};
                   output: 2
         */

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,8));

        Integer maxNum = Collections.max(list1);
         list1.removeAll(Arrays.asList(maxNum));
        System.out.println(list1);

        int maxNum2 = Collections.max(list1);
        System.out.println(maxNum2);

        System.out.println("=============================================================");

        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,7,8,8));

        Integer minNum = Collections.min(number); // 1
        number.removeAll(Arrays.asList(minNum));
        System.out.println(number);

        int minNum2 = Collections.min(number);
        System.out.println(minNum2);
    }
}
