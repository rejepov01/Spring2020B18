package day50_Polymorphism;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        int a = 100;
        double b = (double) a; // implicitly done

        Dog dog = new Dog("a",1,"f");
        Animal animal1 = (Animal) dog; // upcasting, done implicitly

        Cat cat = new Cat("r","female",2);
        // Dog dog2 = (Dog) cat;
        Animal animal2 = (Animal) cat; // upcasting is done implicitly

        System.out.println("======================================");

        double c = 10;
        int d = (int) c; // explicitly done

        Animal animal3 = new Dog("A",8,"M");

        Dog dog3 = (Dog) animal3;  // down casting , MUST be done manually

        Animal animal4 = new Cat("G","F",7);

        Cat cat2 = (Cat) animal4;

        System.out.println("=============================================");

        Animal animal5 = new Dog("Lucy",3, "F");
       // animal5.bark();
         Dog dog2  = (Dog) animal5;
         dog2.bark();

         // second way;
        ( (Dog)animal5 ).bark();


    }
}
