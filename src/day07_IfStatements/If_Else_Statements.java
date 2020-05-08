package day07_IfStatements;

public class If_Else_Statements {

    public static void main(String[] args) {

        int number = 0;

        if(number >= 0){
            System.out.println(number + " is positive"); // first give if posibility it's the rule of if - else
        }
        if(number < 0){
            System.out.println(number + " is negative"); //  else block executes when if  block is false
        }

        int a = 100;
         /*
        if (a % 2 ==0){
            System.out.println(a + " is even number");
        }
        if (a % 2 != 0){
            System.out.println(a + " is odd number");
        }
         */

        if (a % 2 ==0){
            System.out.println(a + " is even number");
        }
        else {
            System.out.println(a+" is odd number");
        }

        int age = 30;

        if( age >= 21){
            System.out.println("Here is your vodka");
        }
        else {
            System.out.println("Here is your chocolate");
        }

        boolean testedPositiveForCorona = false;

        if(testedPositiveForCorona){
            System.out.println("Buy more TP and stay at home");
        }
        else{
            System.out.println("Do more coding");
        }



    }
}