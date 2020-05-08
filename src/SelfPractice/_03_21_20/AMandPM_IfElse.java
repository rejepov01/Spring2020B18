package SelfPractice._03_21_20;

public class AMandPM_IfElse {

    public static void main(String[] args) {

        double hour = 16.39;


        if(hour < 12){
            System.out.println("Good Morning ");
        }
        else {
            System.out.println(" You are late");
        }

        if (hour >= 12 && hour<13){
            System.out.println(" Good Afternoon ");
        }
        else {
            System.out.println(" Go home you are sick");
        }
        if (hour >= 15 && hour < 24){
            System.out.println(" Good Evening my Love");
        }
        else {
            System.out.println(" You were very freak out");
        }

    }
}
