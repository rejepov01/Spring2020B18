package day19_Arrays;

import java.util.Scanner;

public class Arrays_Practice2 {

    public static void main(String[] args) {

        int [] arr = {10, 20, 30};

        System.out.println(arr.length);  // 3

        int [] arr2 = new  int[5]; // five data have in this array  or size of five
                  //   index  4  have in this variable
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);

        String [] Testers = new String[3];  // {"Ayna, "Mesud" , "Leyla"}
                   // index:   0, 1, 2,

        Testers [0] = "Ayna";
        Testers [2] = "Leyla";
        Testers [1] = "Mesud";

        System.out.println(Testers[0]);  // Ayna
        System.out.println(Testers[1]);  // Mesud
        System.out.println(Testers[2]);  // Leyla

        System.out.println(Testers.length); // 3


        System.out.println("======================================================");


        // write a program that asks "enter a name" 10 times, and store each of the names in the array students

        Scanner input = new Scanner(System.in);
        String [] student = new String[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Enter a name");
            student [i]= input.next();
        }

        System.out.print(student[5]);



    }
}

