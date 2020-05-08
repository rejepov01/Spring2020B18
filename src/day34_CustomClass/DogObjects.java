package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setDogInfo("Alabai","Huge",6,"White","Mojek");
     /*
        dog1.breed = "Alabai";
        dog1.size = "Big";
        dog1.age = 5;
        dog1.color = "White";
        dog1.name = "Mojek";

      */
     /*
        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.age);
        System.out.println(dog1.color);
        System.out.println(dog1.name);

      */

        Dog dog2 = new Dog();
        dog2.setDogInfo("Alabay", "Extra big", 5, "Brown", "Ajdar");

        Dog dog3 = new Dog();
        dog3.setDogInfo("Chihua Hua","Smal",1,"Brown","Tuzik");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        System.out.println("===============================================================");
        Dog dog4 = new Dog();
        dog4.setDogInfo("Pomeranian", "Small", 3, "White", "Lil");

        Dog dog5 = new Dog();
        dog5.setDogInfo("pomeranian", "Small",4, "White", "Ernie");

        ArrayList<Dog> puppies = new ArrayList<>();
        puppies.addAll(Arrays.asList(dog1,dog2,dog3) );
        puppies.addAll(Arrays.asList(dog4,dog5));

        for ( int i = 0; i < puppies.size(); i++){
             Dog eachDog  = puppies.get(i);
            System.out.println(eachDog);
        }


        System.out.println("===================================================");

        puppies.removeIf(p->p.age >2);

        for (int i = 0; i < puppies.size(); i++){
            Dog eachDog = puppies.get(i);
            System.out.println( eachDog );
        }



    }
}
