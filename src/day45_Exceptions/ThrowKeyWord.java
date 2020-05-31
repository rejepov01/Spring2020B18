package day45_Exceptions;

import java.io.IOException;
import java.util.NoSuchElementException;

public class ThrowKeyWord {
    // chrome, firefox, opera ...

    public static void main(String[] args)  {

        NoSuchElementException obj = new NoSuchElementException();

       // throw obj;

      //  throw new NoSuchElementException();

      //  System.out.println();   -->> will not be executed


        boolean breakTime = true;

        if (breakTime){
            throw new RuntimeException("It's break time, we should take break");
        }


     //  throw new IOException();


        int[] arr = {1,2,3};

       // System.out.println( arr[100]);
       // System.out.println( 9 / 0 );

      //  throw new RuntimeException();
      //  System.out.println();

        try {
            throw new RuntimeException();
        }catch (Exception e){

        }


    }
}
