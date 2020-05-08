package SelfPractice._04_18_20;

import java.util.Scanner;

public class Replit022 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        String item1 = input.next();
        Double price1 = input.nextDouble();
        System.out.println("Enter Item2 and its price:");
        String item2 =input.next();
        Double price2 = input.nextDouble();
        System.out.println("Enter Item3 and its price:");
        String item3 = input.next();
        Double price3 = input.nextDouble();
        Double totalPrice = (price1+price2+price3);
        String report = "Item1: " +item1+" Price: "+price1+", "+"Item2: "+item2+" Price: "+price2+", "+"Item3: "+item3+" Price: "+price3 +
                "\nTotal price: "+totalPrice;
        System.out.println(report);


    }

}
