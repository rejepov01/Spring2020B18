package OfficeHours.Practice_04_22_20;

public class methodOverloading {

    public static void main(String[] args) {
     //   method1();  // only parameter is matter
        method1(10);   //  only matter the parameter
    //    method1(10,20);  //  only matter parameter

        int num1 = method1(20);  // "Hello Cybertek", and then return
        System.out.println(num1);
    }

    public static void method1(){
        System.out.println("Hello World");
    }

    public static int method1(int a){
      //  System.out.println("Hello Cybertek");
        return 10;
    }

    public static void method1(int a, int b){
        System.out.println("Hello Batch 18");
    }

}
