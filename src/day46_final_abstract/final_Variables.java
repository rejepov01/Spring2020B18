package day46_final_abstract;

public class final_Variables {

    final  int InstanceVariable = 300;  // each instance variable shared by object and each object has its own copy

    // final int InstanceVariable2 ; //  final instance variables need to be initialized immediately


    final static int staticVariable = 1000;

    //  final static int getStaticVariables2; // final static variables need to be initialized immediately
    // we will be use static variables in main method so it's need to be initialized

    public static void main(String[] args) {
        final double PI = 3.14;
        //  PI = 3.15

        final String gender = "Male";
        //   gender = "Female";

        final int score;
        score = 100;
      //  score = 200;
        System.out.println(score);

        System.out.println("========================================================");

        // this.InstanceVariable = 400;
        final_Variables obj = new final_Variables();
       //   obj.InstanceVariable = 400;

        // staticVariables = 2000;

    }
}
