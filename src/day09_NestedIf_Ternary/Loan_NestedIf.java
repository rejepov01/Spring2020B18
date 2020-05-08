package day09_NestedIf_Ternary;

public class Loan_NestedIf {

    public static void main(String[] args) {

        double salary = 120000;
        byte workHistory = 3; // you can  change to 1

        if( salary >= 30000){ // might be qualified

            if (workHistory >= 2){
                System.out.println("You are qualified for loan");
            }else{
                System.out.println("You must have been on the job at least 2 years");
            }

        }
        else {
            System.out.println(" You must earn at least $30000");
        }

        System.out.println(workHistory);

    }
}
