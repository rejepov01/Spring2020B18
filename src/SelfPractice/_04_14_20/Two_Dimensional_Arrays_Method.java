package SelfPractice._04_14_20;

public class Two_Dimensional_Arrays_Method {

    public static void main(String[] args) {
                   //       0  1   0 1    0 1
        int [][] array = { {1,2 },{3,4},{5,6} };
         //                  0      1     2


        //   array [0][0] ==> 1; array [0][1] ==> 2
        //   array [1][0] ==> 3;  array [1][1] ==> 4;
        //   array [2][0] ==> 5;  array [2][1] ==> 6


        for (int j = 0; j < array.length; j++){
            for (int i = 0; i < array[j].length; i++){
                System.out.print(array[j][i] +" ");
            }
        }
        System.out.println();

       for (int j = 0; j <array.length; j++){
           int sum = 0;
           sum += array [j][0];
           System.out.print(sum+" ");
       }

         System.out.println();
        int[][] arrays = new int[5][6];
        int[] x = {1, 2};
        arrays[0] = x;  // {1,2}
        System.out.println("array[0][1] is " + arrays[0][1]); // 2
    }

}
