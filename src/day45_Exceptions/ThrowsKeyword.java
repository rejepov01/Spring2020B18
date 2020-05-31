package day45_Exceptions;

public class ThrowsKeyword {

    // Disadvantage of the Throws keyword the caller of the method need to handle it.

    public static void sleep1(){
        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }
    }

    public static void sleep2 () throws InterruptedException {

            Thread.sleep(3000);

    }

    public static void main(String[] args) throws Exception {

        System.out.println("Cybertek");
        sleep2();
        System.out.println("Java");
    }

    public static void method1() throws Exception{
        String [] arr = {"A"};
        main(arr); // we called main method it gave compilier error so we can try and catch or throws keyword
    }

    public static void method2(){
        try {
            method1();
        }catch (Exception e){

        }
    }

    public static void method3(){
        method2();  // We used try and catch on method2() so here it didn't give complier error
    }
}
