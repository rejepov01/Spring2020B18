package SelfPractice._04_11_20;

import java.util.Scanner;

public class Arrays_Self_Practice {

    public static void main(String[] args) {


        String [] family = new String[4];
       // String [] name = {"Sha","Ayna","Mesud","Leyla"};
/*
        family[0]= "Sha";
        family[1]= "Ayna ";
        family[2]="Mesud";
        family[3]= "Leyla";

        System.out.println(family[0]);
        System.out.println(family[1]);
        System.out.println(family[2]);
        System.out.println(family[3]);

        System.out.println(family.length);

*/
        Scanner input = new Scanner(System.in);

           for (int i = 0 ; i <4 ; i++){
               System.out.println("Enter family names");
               String names = input.nextLine();
               family[i]=names;
           }

        System.out.println(family[0] +", "+family[1]+", "+family[2]+", "+family[3]);

        System.out.println("Family of four: "+ family.length);


    }

}
