package OfficeHours.Practice_03_18_20;

public class SingleIf_Practice_2 {

    public static void main(String[] args) {

        byte age = 30;
        boolean eligibleToBuy = age > 21 || age == 21; // age >= 21

        if(age >= 21) {
            System.out.println("Here is your Vodka");
        }

        if(age == 21) {
            System.out.println(" Go take your Milk");
        }


        boolean feelingHappy = false;
        if(feelingHappy == false) {
            System.out.println("So don't be sad");
        }

        if ( feelingHappy == true) {
            System.out.println(" Stay happy ");
        }

    }
}
