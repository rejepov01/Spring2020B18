package day39_AccessModifiers;

public class CarObjects {

    public static void main(String[] args) {
        // new constructor

        Car car1 = new Car("Toyota");

        System.out.println( car1 );

        Car car2 = new Car("BMW","X5");

        System.out.println( car2 );

        Car car3 = new Car("Lexus","RX",2020);

        System.out.println(car3);


        Car car4 = new Car("Tesla","Model S",2020,40000);

        System.out.println( car4 );
    }
}
