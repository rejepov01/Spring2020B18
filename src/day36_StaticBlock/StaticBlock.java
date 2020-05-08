package day36_StaticBlock;

public class StaticBlock {
  /*    We changed it to bottom but it doen not matter static block will be executed first not top to bottom

    static {
        System.out.println("Hello World");
    }

   */

    public static void main(String[] args) {
        System.out.println("Hello Cybertek");
        method1();

    }


    public static void method1(){
        System.out.println("Custom method executed");
    }

    static {
        System.out.println("Static block executed");
    }

}
