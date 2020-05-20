package OfficeHours.Practice_05_20_20;


class Test{
    public Test(){
        System.out.println("A");
    }
}
public class Constructor extends Test {

    public Constructor(){
        System.out.println("B");
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor(); // super class Constructor is default it will call automatically
    }

}
