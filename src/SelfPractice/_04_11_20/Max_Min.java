package SelfPractice._04_11_20;

public class Max_Min {

    public static void main(String[] args) {

        int [] arr = {2,5,6,4,7,12,36,5,41,0};
        int lastIndex = arr.length-1;
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i <= lastIndex; i++){

            if (arr[i] > max){
                max = arr[i];
            }

            if (arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }

}
