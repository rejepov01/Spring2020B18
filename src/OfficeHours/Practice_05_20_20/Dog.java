package OfficeHours.Practice_05_20_20;

public class Dog extends Pet {
    /*
     Dog:
        variables:  name, age, color, size, breed, isPet, numberOfEyes

        methods: eat, sleep, drink, toString, setInfo,  bark

        not inherited: bark

     */

    public Dog(String name,int age, String color, String size, String breed){
        setInfo(name,age,color,size,breed);
    }


    public void bark(){
        System.out.println(name+" is barking");
    }
}
