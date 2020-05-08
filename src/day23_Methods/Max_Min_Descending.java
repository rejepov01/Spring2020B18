package day23_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Max_Min_Descending {

    /*
    4. create a function that can print the maximum number from any given array
	5. create a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]

     */

    public static void main(String[] args) {

       int [] numbers = {2,3,6,55,4,12,6,88};
       MaxNumberArray(numbers);
       MinNumberArray(numbers);
       Descending(numbers);

    }

    public static void MaxNumberArray(int[] num){
        int max = num [0];
        for (int i = 0; i <= num.length-1; i++ ){

            if (num[i] >= max){
                max = num[i];
            }
        }
        System.out.println(max);

    }

    public static void MinNumberArray (int [] num1){
        int min = num1[0];
        for (int i = 0; i <= num1.length-1; i++){
            if (num1[i] <= min){
                min = num1[i];
            }
        }
        System.out.println(min);
    }

    public static void Descending (int [] num2){
        Arrays.sort(num2);
        int[] Rev = new int[num2.length];
        int j = num2.length-1;
        for (int i = 0; i < num2.length; i++){
            Rev[i] = num2[j];
            j--;
        }

        System.out.println(Arrays.toString(Rev));
    }




}
