package day10_Siwtch_Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
   // we can assign int a = 4 ;

        switch (4){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
                default:
                    System.out.println("Invalid Entry");

                    // after this we added two more cases

            case 3:
                System.out.println("Three");
                break;

            case 4:
                System.out.println("Four");
                break;
        }

    }

}
