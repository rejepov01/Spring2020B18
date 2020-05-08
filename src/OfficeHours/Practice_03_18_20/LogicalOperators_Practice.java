package OfficeHours.Practice_03_18_20;

public class LogicalOperators_Practice {

    public static void main(String[] args) {

        // || , && , !

        boolean r = "Muhtar" == "Bad guy"; // false

        System.out.println(r);

        boolean r1 = "Muhtar" != "Good Guy";

        System.out.println(r1);

        boolean r2 = 10>=9; // true
        System.out.println(r2);

        boolean r3 = !false == !true; // false
        //            true == false
        System.out.println(r3);

        // ||  or Logic as long as one condition is true it will return true

        boolean result1 = 9 != 8 || 9 == 8; // true
        //                 true   || false
        System.out.println(result1);

        boolean result2 = 9 != 8 && 9 == 8; // false
        System.out.println(result2);

        boolean result3 = 'a' == 'A' || 'A' == 'b';
        ///                false   ||    false ==> false
        System.out.println(result3);

        boolean result4 = 6 > 5 && 6 < 4;
        //                true  && false ==> false
        System.out.println(result4);

        boolean result5 = !false != false && !true == false;
        //                 true  !=   false &&  false == false
        //                   true   && true ==> true
        System.out.println(result5);


    }
}
