package day45_Exceptions;

public class ThrowKeyWord2 {

    public static void main(String[] args) {
        new ArithmeticException();  // since we not reused it, we don't need to assigning it to variable
        throw new ArithmeticException();
    }
}
