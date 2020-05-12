package day38_Constructors;

import java.text.DecimalFormat;

public class CircleObject {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");
        double r = 3;

        Circle circle1 = new Circle(r);

      // System.out.println( circle1.area()); // you can find like this or like below

       double areaOfCircle = circle1.area();

        System.out.println(df.format(areaOfCircle));

        System.out.println(circle1);
    }
}
