package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Reverse {
    /*
    write a program that can print out the unique elements from an int array
		   HINT: store all the unique elements of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 6; i++){
            list.add(i);
        }

        System.out.println(list);

        ArrayList<Integer> reverseList = new ArrayList<>();
        for (int i = list.size()-1; i >= 0; i--){
             int eachNum = list.get(i);  // unboxing
            reverseList.add(eachNum);

        }
        System.out.print(reverseList);
    }
}
