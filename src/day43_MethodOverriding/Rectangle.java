package day43_MethodOverriding;

public class Rectangle extends Shape {
    /*
    inherited:
             area, perimeter
             calculate(); calculatePerimeter()
     */

    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void calculateArea(){
        area = length * width;
        System.out.println("Area of the Rectangle: "+area);
    }

    public void calculatePerimeter(){
        perimeter = 2*(length+width);
        System.out.println("Area of the Rectangle: "+perimeter);
    }
}
