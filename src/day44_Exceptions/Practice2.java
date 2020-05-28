package day44_Exceptions;

public class Practice2 {

    /*
  1. Write a method called "wait" that causes the current executing thread to sleep for the specific number of seconds
     parameters: double seconds

     Hint: Thread.sleep()

     */

    public static void main(String[] args) {

        System.out.println("Java");
        waits(3.5);
        System.out.println("Cybertek");
    }

    public static void waits(double seconds){
        try {
            Thread.sleep((long)(seconds* 1000));
        }catch (Exception e){

        }
    }
}
