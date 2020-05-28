package day44_Exceptions;

import java.util.NoSuchElementException;

public class finally_Block {

    public static void main(String[] args) {

        try {
            System.out.println( 9 / 0);
            System.out.println("Try Block");

        }catch (NoSuchElementException e){
            System.out.println("Catch Block");

        }finally {
            System.out.println("Finally");   // finally block always will be executed regardless of catch exception
        }
    }
}
