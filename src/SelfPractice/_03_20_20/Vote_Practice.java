package SelfPractice._03_20_20;

/*
 Write a Java program:
 1) Declare a variable and initialize user age.
 2) Then the program will show if the user is eligible to vote.
        A Person who is eligible to vote must be older than or equal to 18 years old.

     Input: Enter your age :18
     Output: You are eligible to vote
 */

public class Vote_Practice {

    public static void main(String[] args) {

       int age = 17;
       boolean citizen = true;

       boolean eligibleToVote = age >= 18 && citizen == true;

        if (eligibleToVote == true){
           System.out.println("You are eligible to vote");
       }
        if (eligibleToVote != true){
            System.out.println("You are not eligible to vote");
        }

    }
}
