package day06_Shorthnd_LogicalOperators;

public class warmUp {

    public static void main(String[] args) {

        double numberOfGallons = 5; // we changed from 3 gallons to 5
        double gallonsToLitters = numberOfGallons*3.785;
        String result = numberOfGallons + " gallons is equal to: " + gallonsToLitters + " litters";

        System.out.println(result);

        System.out.println("===========================================================");

        double numberOfLitters = 100; // we changed from 1 litter to 100
        double littersToGallons = numberOfGallons / 3.785;
        String result2 = numberOfLitters + " litters equal to: " + littersToGallons + " gallons";

        System.out.println(result2);

        System.out.println("================================================");

        int a = 200; // 201
        int b = -a++ + - --a * a-- % 2;
        //      -200 + -200 * 200 % 2;
        //   b=  -200 + -40000 % 2;
        //   b= -200 + 0
        //   b = -200

        System.out.println(b);
        System.out.println(a);

        System.out.println("===================================================");

        int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;
        //      300 + 400 - 300 * 400 + 300/400;
        //      300 + 400 - 120000 + 300/400
        //      300 + 400 - 120000 + 0
        //      -119300

        System.out.println(z);









    }

}


/*

1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
Collapse



:+1:
9
:heart_eyes:
1

 */