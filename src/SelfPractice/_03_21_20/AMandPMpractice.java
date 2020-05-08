package SelfPractice._03_21_20;

public class AMandPMpractice {

    public static void main(String[] args) {

        double hour = 14.34;
        boolean MorningGreat = hour < 12 && hour ==0;
        boolean AfternoonGreat=  hour >= 12 && hour <15;
        boolean EveningGreat = hour >= 15 && hour < 24;

        if (MorningGreat) {
            System.out.println(" Good Morning");
        }
        if (AfternoonGreat){
            System.out.println(" Good Afternoon");
        }
        if (EveningGreat){
            System.out.println(" Good Evening");
        }


    }
}
