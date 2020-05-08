package day09_NestedIf_Ternary;

public class ifStatement_WithOutCurlyBraces {

    public static void main(String[] args) {

        int number = 100;

        if( number % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

        if(9<8) {    // if the block contains more than one statement we must give body
            System.out.println("hello");
            System.out.println("condition is true");
            System.out.println("test executed");
        }
    }
}
