package SelfPractice._04_12_20;

import java.util.Scanner;

public class Replit024 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName = input.next();
        System.out.println("Enter your last name");
        String lastName = input.next();
        input.nextLine();
        System.out.println("Enter your email");
        String email = input.nextLine();
        System.out.println("Enter your street");
        String street = input.nextLine();
        System.out.println("Enter your city");
        String city = input.nextLine();
        System.out.println("Enter your state");
        String state = input.nextLine();
        System.out.println("Enter your zip code");
        int zipCode = input.nextInt();
        System.out.println("Enter your work phone number");
        long workPhone = input.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhone = input.nextLong();
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Enter your height");
        double height = input.nextDouble();
        System.out.println("Enter your weight");
        double weight = input.nextDouble();
        System.out.println("Are you married?");
        boolean married =input.nextBoolean();

        String fullName = lastName+", "+firstName;
        String address = street+", "+city+", "+state+" "+zipCode;
        String contact = "work phone number - "+workPhone+", "+"personal phone number - "+personalPhone+", "+"email: "+email;

        System.out.println("Patient personal information");
        System.out.println("Full name: "+fullName);
        System.out.println("Address: "+address);
        System.out.println("Contacts: "+contact);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight+" pounds");
        System.out.println("Married?: "+married);



    }

}
