package day20_ArraysContinue;

import java.util.Scanner;

public class Months {


    public static void main(String[] args) {

    String [] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
                 //       0      1    2     3     4
        Scanner  input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = input.nextInt();

        int attempts =1;

        while (num > 12 || num <=0){
            System.out.println("Invalid Entry");
            System.out.println("Please re-enter the number");
            num = input.nextInt();

            if (attempts == 3 && (num > 12 || num <=0) ){
                System.out.println("Invalid Entry, you already have 3 attepmts");
                System.exit(0);
            }
        }


        String result = months[num-1]; // index number

        System.out.println(result);

    }
}
