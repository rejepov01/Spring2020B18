package day48_Abstraction;

public interface Interface2 {

   // public Interface2(){}  you can not have a constructor in interface

    // public void method1(){} instance method

   // { } instance block

    public static final int a = 100;

    public static void main(String[] args) {
        System.out.println(a); // by default static

       // a = 200; // by default final

        System.out.println( Interface2.a);
    }

    public static void method4(){ }

    void method5();

    public default void method6(){}

}
