package day20_ArraysContinue;
/*
1. write a program that can find the maximum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVEN'T COVERED IN THE CLASS

    2. write a program that can find the minimum number from any given int array

                NOTE: DO NOT USE ANYTHING THAT WE HAVEN'T COVERED IN THE
 */
public class Max_Min {

    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8,9};
        int lastIndex = arr.length-1;
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i <= lastIndex-1; i++){

            if (arr[i] >= max){  // array's index are compared with each other and whichever is greater will be assigned to the max
                max = arr[i];
            }


            if(arr[i] < min){ // array's index are compared with each other and whichever is smaller will be assigned to the min
                min = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
