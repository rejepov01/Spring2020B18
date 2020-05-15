package OfficeHours.Practice_05_13_20;

public class Instances {

    String name;

    {
        name = "Ayna";
    }



    public static void main(String[] args) {
        Instances obj = new Instances();
        obj.name = "Ayna";

        System.out.println( obj.name );
    }

    public void printName(){
        System.out.println("Name is : "+name);
    }
}
