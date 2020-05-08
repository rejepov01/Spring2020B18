package SelfPractice._04_18_20;

public class Replit143 {

    public static void main(String[] args) {

        printHollowRect();
    }


    public static void printHollowRect(){


        for ( int i =0; i<=5; i++){

            for (int j = 0; j<=5; j++){

                if (i==0 || i == 5 || j==0 || j ==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }

}
