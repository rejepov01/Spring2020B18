package day07_IfStatements;
/*
1. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
Write a program that declares three integers as angles and check whether a triangle
is valid or not.
 */
public class ValidTriangle {

    public static void main(String[] args) {

        double angel1 = 30.5;
        double angel2 = 50;
        double angel3 = 99.5;

        short sumOfAngels = (short) (angel1 + angel2 + angel3);

       // boolean ValidTriangle = sumOfAngels == 180;  // you can give by boolean

        if(sumOfAngels ==180) {
            System.out.println("The shape is a triangle");
        }

        if(sumOfAngels != 180) {
            System.out.println("The shape is not a triangle");
        }

    }

}
