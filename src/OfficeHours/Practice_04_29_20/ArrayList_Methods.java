package OfficeHours.Practice_04_29_20;

import java.util.ArrayList;

public class ArrayList_Methods {
    /*
          # ArrayList: does not support any primitives so we uses wrappers
         #  size is dynamic, size is auto-adjusted
         #  Has Index numbers
              add(), get(), size(), set(), remove(), clear(), indexOf(), lastIndexOf()

              add(): inserting
              set(): replacing

              remove(int)
              remove(object)
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
                           list.add(10);
                           list.add(20);  // {10, 20}
                           list.add(1,30); // adds the element at the given index
                            //     {10, 30, 20 }

        System.out.println(list);
        System.out.println(list.size());

        // [10, 30, 20 ]
        //  0   1    2

          int num1 = list.get(2);  // Integer 20,

        byte a = 100;
        // Integer b = a;

        Byte a2 = 100;
        int b2 = a2; // unboxing

        ArrayList<String > list2 = new ArrayList<>();
                            list2.add("A");
                            list2.add("B");
                            list2.add("C");
                            list2.add("D");

                            // {A, B, C, D};
                            list2.add(2,"E"); // {A, B, E, C, D }

        System.out.println(list2);

        for (int i = 0; i < list2.size(); i++){  // i: 0,1,2,3,4
            String str = list2.get(i);
            System.out.println(str);
        }

        System.out.println("====================================================");
        for ( String each : list2  ) { // each represents the elements on this loop
            System.out.println(each);
        }


        // list2:  {A, B, E, C, D} ; , replace C with F
        //          0  1  2  3  4

        list2.set(3,"F");

        System.out.println(list2);

        // list2:  {A,B,E,F,D}
        //   0 1 2 3 4
        list2.remove(3); // {A,B,E,D}

        System.out.println(list2);

        // list2: /{A,B,E,D}

        boolean r1 = list2.remove("A"); // {B,E,D}
        System.out.println(list2);

        System.out.println(r1);

        boolean r2 = list2.remove("Z");
        System.out.println(r2);

        list2.clear(); // 0
        System.out.println(list2.size());

        System.out.println(list2);



    }
}
