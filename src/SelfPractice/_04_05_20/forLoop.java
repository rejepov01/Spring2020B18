package SelfPractice._04_05_20;

import java.util.Scanner;

public class forLoop {

 /*
    2. write a program that can return the factorial number of any given number by user
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
     */
 public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

     System.out.println("Enter a number");
     int num = input.nextInt();

     int factorial =1;

     for (int i =num; i >0 ; i--){
         factorial= factorial*i;
     }

     System.out.print("Total is: " +factorial);

 }

}
