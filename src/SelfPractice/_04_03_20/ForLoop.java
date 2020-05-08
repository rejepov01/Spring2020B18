package SelfPractice._04_03_20;

public class ForLoop {

    public static void main(String[] args) {
     /*
        for (int i = 0 ; i < 5; i++ ) {
            System.out.println(" Hello World");
        }
      */
         /*
     for (int i = 1 ; i <= 10 ; i++ ){
         if ( i % 2 == 0){
             System.out.print(i + " ");
         }
     }
        */

         for (int i = 1 ; i <= 10 ; i ++){
             System.out.println( i + " : " + (i*i));
         }

        System.out.println("==================================");
         String odd = " ";

         for (int s = 0; s <= 100 ; s++) {
             if ( s % 2 != 0){
                 odd = odd+ " "+ s;
             }
         }
         System.out.print(odd);


         System.out.println("\n ===================================");

         String even = " ";
         for (int s1 = 0; s1 <= 100 ; s1++ ){
             if (s1 % 2 == 0){
                 even = even + s1 + " ";
             }
         }
        System.out.print(even);
    }

}
