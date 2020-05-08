package day23_Methods;

public class Methods {
    /*
    step1: Hello Cybertek
    step2: Hello World 5 times
    step3: Hello Batch 18
    step4: Hello World 5 times
    step5: Hello Saim
    step6: Hello World 5 times

     */

    public static void main (String [] args){
        System.out.println("Hello Cybertek");
        printHello5();
        System.out.println("Hello Batch18");
        printHello5();
        System.out.println("Hello Saim");
        printHello5();

        System.out.println("==============================");
        evenNumbers1_100();

        oddNumbers1_100();


    }

    public static void printHello5(){

        for (int i = 0 ; i < 5; i++ ){
            System.out.println("Hello world");
        }
    }


    /*
    task:
	1. write a method that can print all odd number between 1 ~ 100
	2. write a method that can print all even number between 1 ~ 100
     */
    public static void evenNumbers1_100(){

        for ( int i = 0; i <= 100; i++){

            if (i % 2 ==0){
                System.out.print(i+" ");
            }

        }

        System.out.println();

    }


    public static void oddNumbers1_100(){

        for (int i = 0; i <= 100; i++){
            if ( i % 2 != 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }


}
