package day46_final_abstract;

public class Triangle extends Shape{

    public double height;
    public double base;

    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    @Override
    public void Area(){
        double area = (height * base) / 2;
        System.out.println("Area of triangle: "+ area);
    }
}
