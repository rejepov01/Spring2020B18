package day24_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TaskFromYesterday {
    /*

    AccessModifier Specifier return-Type methodName (Parameter) {

    }

    4. create a function that can print the maximum number from any given array
	5. create a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]

     */

    public static void main(String[] args) {

        int [] arr = {1,5,6,7,8,9,4,3,10};
     //   MaxNumber( 10 );  10 , if parameter is array, the argument Must be array

        MaxNumber(arr);

        MinNumber(arr);

        Descending(arr);

    }


    public static void MaxNumber(int [] array){
        Arrays.sort(array);
        System.out.println("Maximum number is: "+array[array.length-1]);

    }

    public static void MinNumber (int [] array){
        Arrays.sort(array);
        System.out.println("Minimum number is: " +array[0]);
    }

    public static void Descending (int [] array){
        Arrays.sort(array);
        for (int i = array.length-1; i >= 0; i--){
            System.out.print(array[i]+ " ");
        }

        System.out.println();
    }



}
