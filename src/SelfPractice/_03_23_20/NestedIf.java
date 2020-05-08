package SelfPractice._03_23_20;

public class NestedIf {

    public static void main(String[] args) {

        int age = 27;
        boolean citizenOfUS = true;

        if (citizenOfUS){
            if (age > 18){
                System.out.println("You are eligible to Vote");
            }else {
                System.out.println("You MUST be 18 or older to be able to vote");
            }
        }else {
            System.out.println("Only the US citizens are eligible to vote for Donald Trump");
        }

        System.out.println("=============================================================");

        int score = 97;
        String grade = " ";

        if (score >=90 && score <= 100){

            if (score >= 90){
                grade ="A";
            }else if(score>=80){
                grade = "B";
            }else if (score>=70){
                grade = "C";
            }else if (score >= 60){
                grade = "D";
            }else {
                grade = "F";
            }
        }else{
            grade = "Invalid";
        }

        System.out.println(grade);




    }
}
