package day05_Unary_ShorthandOperators;

public class VariablesPractise {

    public static void main(String[] args) {

        // whole number : byte, short , int, long
        // decimals: float , double

        int a1= 100;

        float f1 = (long)a1;
        // f1 = 100L;
        // f1 = 100.0;

        System.out.println(f1);

        long L1 = (long) f1;
        // long = 100

        System.out.println(L1);

        String name;


        // System.out.println(name); // local variables cannot be used without initializing

        name = "Cybertek"; // in java: first come first serve

        System.out.println(name);








    }
}
