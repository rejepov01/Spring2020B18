package day44_Exceptions;

import sun.awt.windows.ThemeReader;

public class Practice {

    public static void main(String[] args) {
        /*
        print hello,
        wait two seconds
        print Cybertek
        wait three seconds
        Java
         */

        System.out.println("Hello");

        try {
            Thread.sleep(2000);
        }catch (Exception e){

        }

        System.out.println("Cybertek");

        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }

        System.out.println("Java");

        try {
            Thread.sleep(4000);
        }catch (Exception e){
            System.out.println("Completed");
        }

    }
}
