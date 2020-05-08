package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class carObjects2 {

     /*
            create 5 car objects
            put them in an array of cars
            use for loop to get each car info
            use for each loop to get each car info
         */

    public static void main(String[] args) {
      /*
        Car car1 = new Car();
            car1.Brand = "Tesla";
            car1.model = "Model S";
            car1.year = 2020;
            car1.color = "White";

        Car car2 = new Car();
            car2.Brand = "Mercedes";
            car2.model = "S class";
            car2.year = 2020;
            car1.color = "Black";

        Car car3 = new Car();
            car3.Brand = "Toyota";
            car3.model = "Camry";
            car3.year = 2020;
            car3.color = "Red";

        Car car4 = new Car();
            car4.Brand = "Audi";
            car4.model = "Q7";
            car4.year = 2020;
            car4.color = "Grey";

        Car car5 = new Car();
            car5.Brand = "Lincoln";
            car5.model = "Navigator";
            car5.year = 2020;
            car5.color = "Black";

       */

        Car car1 = new Car();
        car1.setCarInfo("Tesla","Model S",2020,"White");
        car1.getCarInfo();

        Car car2 = new Car();
        car2.setCarInfo("Mercedes","S class",2020,"Black");
        car2.getCarInfo();

        Car car3 = new Car();
        car3.setCarInfo("Toyota","Camry",2020,"Red");
        car3.getCarInfo();

        Car car4 = new Car();
        car4.setCarInfo("Audi","Q7",2019,"Grey");
        car4.getCarInfo();

        Car car5 = new Car();
        car5.setCarInfo("Chevrolet", "Suburban",2018,"Black");
        car5.getCarInfo();

        System.out.println("=====================================================");

        Car[] cars = {car1,car2,car3,car4,car5};


        for ( int i = 0; i < cars.length; i++ ){
            cars[i].getCarInfo();
        }

        System.out.println("======================================================================");

        for ( Car eachCar : cars ){
            eachCar.getCarInfo();
        }


        System.out.println(car1); // toString method in order to print object in statement you have to

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list1); // toString method gets executed automatically


    }




}
