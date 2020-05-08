package SelfPractice._03_20_20;

public class MaxNumber_Practice {

    public static void main(String[] args) {

        int n1 = 4;
        int n2 = 8;
        int n3 = 1;

        boolean n1Greater = n1 > n2 && n1 > n3;
        boolean n2Greater = n2 > n1 && n2 > n3;
        boolean n3Greater = n3 > n1 && n3 > n2;

        if (n1Greater){
            System.out.println("The greatest number is: " + n1);
        }
        if (n2Greater){
            System.out.println("The greatest number is: " + n2);
        }
        if (n3Greater){
            System.out.println("The greatest number is: " +n3);
        }

    }
}
