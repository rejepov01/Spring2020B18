package day41_Inheritance;
// to import Data class into here: use import statement

import day41_Inheritance.Data;

// But that doesn't mean we can use it's variables

public class TestData extends Data{

    public static void main(String[] args) {


         /* you can not do the following actions
        System.out.println( Data.a );
        Data.method1();

        System.out.println( TestData.a );
        TestData.method1();

          */

        // But if I inherit class Data into here ==> then I will be able to use its accessible variables and methods

        System.out.println( TestData.a);
        TestData.method1();
    }
}
