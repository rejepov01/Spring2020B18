package OfficeHours.Practice_05_20_20;

public class House {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Ajdar",6,"white","large","Alabai");
      //  dog1.setInfo("Ajdar",6,"white","large","Alabai"); we do not need it once we assign method on dog class

        Dog dog2 = new Dog("Tuzik",6,"brown","small","regular");


        System.out.println( dog1 );
        System.out.println( dog2 );

        dog2.bark();
      //  dog2.scratch();

        System.out.println("=====================================");

        Cat cat1 = new Cat("Donut",4,"brownie","medium","catwille");
      //  cat1.setInfo("Donut",4,"brownie","medium","catwille");

        System.out.println( cat1 );

        cat1.scratch();
      //  cat1.bark();

        System.out.println("===============================");

        Bunny bunny1 = new Bunny("Bug",3,"white","small","tiny");

        System.out.println( bunny1 );
        bunny1.dig();
      //  bunny1.scratch();

    }
}
