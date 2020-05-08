package SelfPractice._04_01_20;
/*
Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:
 */


import java.util.Scanner;

public class Replit51 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Split:");
        String split = input.nextLine();

        System.out.print("Number of people:");
        int numPeople = input.nextInt();

        System.out.print("Check amount:");
        double checkAmount = input.nextDouble();

        input.nextLine();

        System.out.print("Service quality:");
        String serviceQuality = input.nextLine();
        double TotalTip = 0;

        switch (serviceQuality) {
            case "Poor":
                TotalTip = checkAmount * 0.05;
                break;
            case "Fair":
                TotalTip = checkAmount * 0.1;
                break;
            case "Good":
                TotalTip = checkAmount * 0.15;
                break;
            case "Great":
                TotalTip = checkAmount * 0.20;
                break;
            case "Excellent":
                TotalTip = checkAmount*0.25;
                break;
        }
        double totalPayment = checkAmount+TotalTip;
        double totalPerPerson = (totalPayment/ numPeople);
        double tipPerPerson = TotalTip/numPeople;

        String numberOfPeopleEntered = (numPeople==1) ? "&" : (numPeople == 2) ? "&&" : (numPeople==3) ? "&&&" : (numPeople== 4 ) ? "&&&&" : "&&&&&";

        if (split.equalsIgnoreCase("yes")) {
            System.out.println("Number of people entered: " + numberOfPeopleEntered + "\nTotal to pay: " + totalPayment+ "\nTotal tip: " + TotalTip
            +"\nTotal per person: "+ totalPerPerson+"\nTip per person: " + tipPerPerson);

        }


    }


}
