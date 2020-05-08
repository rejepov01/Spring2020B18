package day20_ArraysContinue;

import java.util.Arrays;

public class ArraysUtilities {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        String r = Arrays.toString(arr); // applying for print out on console
        System.out.println(r);

        System.out.println(Arrays.toString(arr)); // Array MUST be converted to string before we print

        String names [] = {"Sha","Mesud","Leyla"};

        System.out.println(Arrays.toString(names));

        double number [] ={ 10, 20, 30, 40, 50};  //  if we want to print out, apply ==> Arrays.toString(number);

        System.out.println(number);

        System.out.println(number[0]);



    }

}
