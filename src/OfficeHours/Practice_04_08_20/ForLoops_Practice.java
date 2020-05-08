package OfficeHours.Practice_04_08_20;

public class ForLoops_Practice {

    public static void main(String[] args) {
          /*
          +++ loop using for repeating the actions

                   for( initialization, Condition; iterator ) {
                           statement;
                   }

                   iterator : co-related to you condition

                   execution order:
                   1) initialization
                   2) condition
                         if true:
                         statements
                         then Iterator

                         if false:
                         stops loop
          */

        for (int i = 0; i <= 5; i++ ) { // if we use ==> i++: 0, 1, 2, 3, 4, 5
                                  // i += 2 : 0, 2, 4
            System.out.println("Hello World "+i);

        }

    }

}
