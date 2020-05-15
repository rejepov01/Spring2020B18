package OfficeHours.Practice_05_13_20;

public class InstanceTest {

    public static void main(String[] args) {

        Instances obj1 = new Instances();
        obj1.name = "Leyla";

        Instances obj2 = new Instances();
        obj2.name = "Mesud";


        System.out.println( obj1.name ); // Leyla
        System.out.println( obj2.name ); // Mesud

        obj1.printName(); // name is Leyla
        obj2.printName(); // name is Mesud

    }
}

class InstanceBlock{

    public static void main(String[] args) {

        Instances obj = new Instances();
        System.out.println( obj.name );

    }
}