package OfficeHours.Practice_04_22_20;

public class void_Method {

    /*
      Access-modifier   specifier     return-Type    methodName(parameter) {
             statements
             }
     */

    public static void main(String[] args) {

        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");

        System.out.println("=======================================================");

        print();

        System.out.println("=======================================================");

        boolean UsCitizen = true;
        int age = 21;

        Vote(1,true);

        Vote(21,true);

        Vote(38,false);

        // 28
        EligibleToBuyCig(28);
        EligibleToBuyCig(17);

    }

    public static void print(){
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
        System.out.println("Hello Batch 18");
    }

    // Write a function that can identify if a person is eligible to vote
          // Must know: age; USCitizen

    public static void Vote( int age, boolean UsCitizen){
        boolean eligibleToVote = age >= 18 && UsCitizen == true;
        if (eligibleToVote){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("you are not eligible to vote");
        }
    }

    // Write a program if a person is eligible to buy a cigarets
      // MUST know: age

    public static void EligibleToBuyCig (int age){
        if ( age > 18) {
            System.out.println("Eligible to buy");
        }else {
            System.out.println("Not eligible to buy");
        }
    }



}
