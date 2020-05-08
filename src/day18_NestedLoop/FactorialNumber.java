package day18_NestedLoop;

import java.util.Scanner;

public class FactorialNumber {
    /*
    2. write a program that can return the factorial number of any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scan.nextInt(); // entered 5 so  5,4,3,2,1

        int result = 1;  // 5*1 =5 , 5*4=20; 20*3= 60; 60*2 = 120; 120*1 = 120;
        while (num >= 1) {
            result *= num;
            num--;
        }
        System.out.println(result);

    }

}
