package day21_MultiDimensionalArrays;
/*
1. write a program that can return the average number from an array of integers
        ex:
        [1,2,3]
        average: 2
        [10, 15, 5, 6]
        average: 9
        [4, 5, 6, 7, 8, 10, 20, 30, 0]
        average: 10

 */

public class AverageNumber {

    public static void main(String[] args) {

        int [] arr = {10,20,30,40,50}; // 5,10

    //    int avarage = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];  instead of writing like this we use loop which is repeated action

  //      System.out.println(avarage);

        // average : sum of all number / length

        int length = arr.length;  // total number of the elements
        int sum = 0;

        for (int i = 0; i < length; i++){
            int eachNum = arr[i];
            sum += eachNum;
        }

        System.out.println(sum);

        double total =( double) sum/length;  // we can use in this format if we want to find decimals

        System.out.println(total);
    }

}
