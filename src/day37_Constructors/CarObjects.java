package day37_Constructors;

public class CarObjects {

    public static void main(String[] args) {
        Car car1 = new Car("Tesla","Model S",2020,65000);
        System.out.println( car1.brand );
        System.out.println( car1.model );
        System.out.println( car1.year );
        System.out.println( car1.price );
        System.out.println(car1);

        Car car2 = new Car("Mercedes","C300",2020,45000);

        System.out.println(car2);
    }
}
