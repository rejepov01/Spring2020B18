package day07_IfStatements;
/*
	5. write a java program that can identify if a person is eligible to vote for Donald Trump
 */
public class Vote {

    public static void main(String[] args) {

        int age = 18;
        boolean citizen = true;

        boolean eligible = age >= 18 && citizen == true;

        if(eligible == true){
            System.out.println("You are eligible to vote");
        }
        if(eligible != true){
            System.out.println("You are not eligible to vote");
        }

    }
}
