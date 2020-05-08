package SelfPractice._03_21_20;

public class Triangle_Practice {

    public static void main(String[] args) {

        int angle1 = 40;
        int angel2 = 50;
        int angel3 = 90;

        int sumOfAngels = angle1+angel2+angel3;
        // boolean ValidTriangle = sumOfAngels ==180;

        if (sumOfAngels == 180){
            System.out.println(" The triagle is valid ");
        }
        else {
            System.out.println(" The shape is not valid for triangle");
        }

    }

}
