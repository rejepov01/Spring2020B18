package day30_ArrayList;

import java.util.ArrayList;

public class Uniques {
    /*
    write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
    		ex: list==> {1,1,2,3,3,4,5}
    			uniques ==> {2,4,5}

     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // {1,2,1}
                            list.add(1);
                            list.add(2);
                            list.add(1);
                            list.add(3); // we added one
                            list.add(4); // we added one just for check loop is working or not

        ArrayList<Integer> uniques = new ArrayList<>();

        for(int i = 0; i  < list.size(); i++){
            // list.get(0) ==> 1
            int count = 0;
            for (Integer each : list){
                if(each == list.get(i)){  // 0 1 2
                    count ++;
                }
            }
            if(count == 1){
                uniques.add(list.get(i));  // 0 1 2
            }
        }

        System.out.println(uniques);
    }
}
