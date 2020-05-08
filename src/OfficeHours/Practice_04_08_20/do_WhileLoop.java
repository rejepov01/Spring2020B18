package OfficeHours.Practice_04_08_20;

public class do_WhileLoop {

    public static void main(String[] args) {
       /*

       do{
                statement;

       }while(Condition);

       execution order:
       1: statements;   <== first step goes
       2: Condition     <== after first second step
            if true: repeats step1
            if false: stops the loop

        */

       boolean b = false;
       while (b){
           System.out.println("Hello World");

       }

        System.out.println("=============================================");

       do{
           System.out.println("Hello Cybertek");
       }while (b);


        System.out.println("========================================");

        int j = 0;

        do{
            if (j % 15 == 0) {
                System.out.print(j + " ");
            }
            j++;
        }while (j <= 100);


    }
}
