package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethod {

    public static void main(String[] args) {
        // find the maximum number in the ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

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

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,2,3,4,4));
        //  second max: 3

        Integer maxNum = Collections.max(numbers); // 4
        numbers.removeAll(Arrays.asList(maxNum)); // in BULK-ALL method in brackets: you should show collections type
        System.out.println(numbers);

        int secondMax = Collections.max(numbers);

        System.out.println(secondMax);

        System.out.println("===================================================");

        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,7,8,8));
         // second min : 2

         Integer minNum = Collections.min(numbers2); // 1
        numbers2.removeAll( Arrays.asList(minNum)); // in bracket it takes only collections type only, removes all minimum numbers
        System.out.println(numbers2);

        int secondMin = Collections.min(numbers2);
        System.out.println(secondMin);

        System.out.println("============================================================");
        //  switch numbers between 5 and 1
        ArrayList<Integer> list3 = new ArrayList<>();
                  list3.addAll(Arrays.asList(1,2,3,4,5)); // {1,2,3,4,5}
                              //             0       4
        System.out.println(list3); // [1, 2, 3, 4, 5]

        Collections.swap(list3,0,4); // {5,2,3,4,1}

        System.out.println(list3);

        System.out.println("======================================================");
     // removes names from ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Omer","Omer","Mary","Sha","Fatih","Omer")); // Irina

       /*
        names.set(0,"Irana");
        names.set(1,"Irina");
        names.set(5,"Irina");

        */

        Collections.replaceAll(names,"Omer","Irina");
        System.out.println(names);




    }
}
