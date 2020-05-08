package SelfPractice._03_20_20;

public class GreatingHour_Practice {

    public static void main(String[] args) {

        double hour = 23.49;

        boolean greatMorning = hour <= 12 && hour >= 0;
        boolean greatAfternoon = hour >= 12 && hour < 15;
        boolean greatEvening = hour >= 15 && hour < 24;

        if (greatMorning){
            System.out.println("Good Morning");
        }
        if (greatAfternoon){
            System.out.println("Good Afternoon");
        }
        if (greatEvening){
            System.out.println("Good Evening");
        }



    }
}
