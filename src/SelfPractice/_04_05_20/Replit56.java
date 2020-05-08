package SelfPractice._04_05_20;

import java.util.Scanner;

public class Replit56 {

    public static void main(String[] args) {

        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0 ;
        Scanner scan = new Scanner(System.in);

        System.out.println("Select screen size: ");
        double screenSize = scan.nextDouble();
        if ( screenSize == 13.3){
           price += 200;
        } else if (screenSize == 15.0){
            price += 300 ;
        }else if (screenSize == 17.3){
            price += 400;
        }
        System.out.println("Select CPU type: ");
        String CPU = scan.next();
        if (CPU == "i3"){
            price += 150;
        }else if (CPU == "i5"){
            price += 250;
        }else if (CPU == "i7"){
            price += 350;
        }
        System.out.println("Select RAM size: ");
        int ram1 = scan.nextInt();
        int ramPrice = ram1/4*50;
        price += ramPrice;
        System.out.println("Select storage type: ");
        String stoType =  scan.next();
        System.out.println("Enter memory size:");
        int memory=scan.nextInt();
        if(stoType.equals("HDD")){
            int hdd=memory/500*50;
            price+=hdd;
        }else{
            int sdd=memory/500*100;
            price+=sdd;
        }
        System.out.println("Enter screen resolution: ");
        String scrRes = scan.next();
        if (scrRes.equals("FullHD")){
            price+=100;
        }else {
            price += 200;
        }

        System.out.println("Laptop price is: " + price);

    }
}
