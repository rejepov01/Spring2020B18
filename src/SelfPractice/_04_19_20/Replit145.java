package SelfPractice._04_19_20;

import java.util.Scanner;

public class Replit145 {

    public static void plus_minus(int [] arr){

        int i = 0;
        int positive =0;
        int negative =0;
        int zero = 0;
        if (arr [i] > 0){
            positive++;
        } else if (arr[i] < 0) {
            negative++;
        }else if (arr[i]== 0){
            zero++;
        }else {
            System.out.println("invalid");
        }

        System.out.println("positives:"+positive +", negatives:"+negative +", zeros:"+zero);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=input.nextInt();
        }
        plus_minus(arr);
    }
}
