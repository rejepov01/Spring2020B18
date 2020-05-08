package day05_Unary_ShorthandOperators;

public class LeapYear {

    public static void main(String[] args) {
/*

Warm Up tasks:
    1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020 ==> short
            LeapYear =true/false
        output:
            2020 is leap year: true

 */
        short year = 2020;

        // leapyear: year % 4 == 0
        //  if returns true ==> leapyear ,  if returns to false ==> not leapyear

        boolean leapYear = year % 4 == 0;  // if the year can be divided by 4 without remainder , then its leap year

        // System.out.println( year + " is leap year : " + leapYear);

        String result = year + " is leap year : " + leapYear;
        System.out.println(result);





    }

}
