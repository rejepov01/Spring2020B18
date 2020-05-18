package day40_Encapsulation;

public class NestedClass {

    // anything is static it belongs to that class


    static class data {
        static int a = 100;
        static int b = 300;
    }

    public static void main(String[] args) {

        System.out.println(NestedClass.data.a);
    }
}
