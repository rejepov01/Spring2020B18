package SelfPractice._04_20_20;
import java.util.Arrays;
public class returnMethods_SelfPractice {

    public static void main(String[] args) {

       /*
        1)  create a function that can print the maximum number from any given array
        */

        int [] arr = {9,8,7,100,200,50,40};
        int max = MaxNumber(arr);
        System.out.println(max);
        int min = MinNumber(arr);
        System.out.println(min);

    }


    public static int MaxNumber (int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static int MinNumber(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

}
