package OfficeHours.Practice_05_20_20;

public class Cat extends Pet{
    /*
      Cat:
        variables:  name, age, color, size, breed, isPet, numberOfeyes

        methods: eat, sleep, drink, toString, setInfo,  scratch

        not inherited :
          scratch
     */

    public Cat(String name,int age, String color, String size, String breed){
        setInfo(name,age,color,size,breed);
    }

    public void scratch(){
        System.out.println(name+" is scratching");
    }
}
