package day20_ArraysContinue;

public class Array_Size {

    public static void main(String[] args) {

        int [] arr1 = {1,2,3};  // {0, 0}  0 ~ 1
             //        0 1 2

  //      System.out.println(arr1[100]);  //  array's size is fixed

        int [] num = new  int[2];  // {0,0}
        num [0] = 10; // {10 , 0}
        num [1] = 20; // {10 , 20}
       //  num [2] = 30;  array's size is fixed

        System.out.println(num[0]); // 10
        System.out.println(num[1]); // 20

        num = new int[3];  // Reset  {0, 0, 0}

        System.out.println(num[0]); // 0
        System.out.println(num[1]);  // 0
        System.out.println(num[2]);  // 0


    }
}
