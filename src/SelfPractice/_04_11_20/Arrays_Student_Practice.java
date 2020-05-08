package SelfPractice._04_11_20;

import java.util.Scanner;

public class Arrays_Student_Practice {

    public static void main(String[] args) {

        // write a program that asks "enter a name" 10 times, and store each of the names in the array students




        Scanner input = new Scanner(System.in);
        String [] students = new String [10];



        for (int i = 0; i < 10; i++){
            System.out.println("Enter a name");
            String name = input.nextLine();
            students [i] = name;

        }

        System.out.println(students[0] +", " + students[1]+", "+ students[2] + ", "+ students[3]+ "\n"
                + students[4]+", "+students[5]+", "+students[6]+", "+students[7]+", "+ students[8]+", "+students[9]);
        System.out.println(students.length);





    }

}
