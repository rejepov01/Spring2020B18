package SelfPractice._04_21_20;

public class MethodOverloading_MaxNumber {
    /*
    1. write a method that can return the maximum number from an int array
	2. write a method that can return the maximum number from a double array
			NOTE: MUST apply method overloading

     */

    public static void main(String[] args) {


    }

    private static int maximum() {
        int max = 0;
        for (int i = 0; i <= 3; i++){
            max = maximum();
        }

        return max;
    }




}
