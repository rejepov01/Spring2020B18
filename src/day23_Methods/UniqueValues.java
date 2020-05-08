package day23_Methods;

public class UniqueValues {
    /*
    warmup task:
	1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
     */

    public static void main(String[] args) {

        String [] arr = {"A","B","A","C","B"};  // I added one more value its "B"

        for ( int j = 0; j < arr.length; j++){  // you can use for each loop also
            int count2 = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[j])){
                    count2++;
                }
            }

            if (count2 ==1){
                System.out.println(arr[j]);
            }
        }

        // "A"



        System.out.println("==============================================================");

        // solution2:
        for ( String each2 :  arr) { // 4 times will be executed so starts with  A, and B, go A,and end with C

            int count = 0;
            for ( String each : arr ){
                if (each.equals(each2)){
                    count++;
                }
            }
            if (count ==1){ // if the character is unique
                System.out.println(each2);
            }
        }


    }


}
