package day24_Methods;

public class BirthYear {

    public static void Age(int birthYear){
        int current = 2020;
        int age = current-birthYear;
        if (birthYear < current && birthYear > 1980){
            System.out.println(age);
        }else {
            System.out.println("Invalid");
        }

    }

    public static void printHello(){
        System.out.println("Hello");
    }
    public static void printCybertek(){
        System.out.println("Cybertek");
    }

    public static void printHelloCybertek(){
        printHello(); // Hello
        printCybertek(); //Cybertek

    }

    public static void main(String[] args) {

        Age( 2010);

        printHelloCybertek();

    }

}
