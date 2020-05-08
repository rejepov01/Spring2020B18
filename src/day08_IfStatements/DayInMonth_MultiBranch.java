package day08_IfStatements;
/*
2. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)
	 		byte month =  3
			28 days: 2
			30 days: 4,6,9,11
			31 days: 1,3,5,7,8,10,12
 */

public class DayInMonth_MultiBranch {

    public static void main(String[] args) {

        byte month = 4;

        String result = " ";

        if(month == 1){
            result = "January has a 31 days";
        }
        else if (month == 2) {
            result = " February has a 28 or 29 days";
        }
        else if (month == 3){
            result = " March has a 31 days";
        }
        else if (month== 4){
            result = " April has a 30 days ";
        }
        else if (month == 5){
            result = " May has a 31 days";
        }
        else if (month == 6){
            result = " June has a 30 days";
        }
        else if (month== 7){
            result = " July has a 31 days";
        }
        else if (month == 8){
            result = " August has a 31 days";
        }
        else if (month == 9){
            result = " September has a 30 days";
        }
        else if (month ==10){
            result = " October has a 31 days";
        }
        else if (month == 11){
            result = " November has a 30 days";
        }
        else if (month == 12){
            result = " December has a 31 days";
        }
        else {
            result = " Invalid Entry";
        }

        System.out.println(result);

    }
}
