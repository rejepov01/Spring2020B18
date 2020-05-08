package OfficeHours.Practice_03_25_20;

public class IfElseStatement_Practice {

    public static void main(String[] args) {

        int num = 100;  // even or odd

        if (100 % 2 == 0){
            System.out.println(num + " is even number");
        }else {
            System.out.println(num + " is odd number");
        }

        int age = 21; // eleigible to buy alcohol

        if ( age == 18){
            System.out.println(" You are eligible to buy alcohol");
        }else {
            System.out.println("You are not eligible to buy alcohol");
        }

        boolean genderMale = true;

        if (genderMale){
            System.out.println("gender is male");
        }else{
            System.out.println("gender is female");
        }

        boolean usCitizen = true;
        int ageOfPerson = 30;

        if(usCitizen == true && ageOfPerson >= 18){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }



    }


}
