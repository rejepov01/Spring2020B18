package OfficeHours.Practice_05_20_20;


class test{
    public test(String str){
        System.out.println("String");
    }

    public test(int a){
        System.out.println("int");
    }

    public test(double a){
        System.out.println("double");
    }
}

public class Constructor2 extends test {

    public Constructor2(){
        super("Hello"); // String
        System.out.println("default"); // default
    }
    /*
    public void method(){

    }

     */

    public static void main(String[] args) {

      //  super("hello");
        Constructor2 obj = new Constructor2();
    }
}


