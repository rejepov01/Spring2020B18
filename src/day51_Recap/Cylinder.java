package day51_Recap;
/*
    5. create a final class named Cylinder that can inherit from Shape, Volume, and PI
                variables: radius, Height
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius and height

 */
public final class Cylinder extends Shape implements Volume,PI { // 5 var

    public double radius;
    public double height;


    public Cylinder (double radius, double height){
        this.radius = radius;
        this.height = height;
        name = "Cylinder";
    }

    @Override
    public double calculateArea() {
        return (PI * radius * radius * 2) + (height * PI * radius * 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (PI * 2 * radius + height);
    }

    @Override
    public double calculateVolume() {
        return PI * radius * radius * height;
    }
}
