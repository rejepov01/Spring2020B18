package day21_MultiDimensionalArrays;

public class ForEachLoop {

    public static void main(String[] args) {

        int [] nums = {1,2,3,4};

        for (int eachElement : nums){
            System.out.println(eachElement);
        }

        String [] students = {"Muhtar","Asiya","Murodil"};

        for (String eachStudent : students){
            System.out.print(eachStudent + ", ");
        }

        System.out.println();

        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
        for (int each : arr1 ){
            if (each < 5){
                continue;
            }
            System.out.print(each+" ");
        }

        System.out.println("========================================================== \n");

        String sentence = "I love Java";  //  Java like I

         String[] words = sentence.split(" "); // [I, like, Java]

        for (String eachWord : words) { // 0 ~ 2
            System.out.print(eachWord+" ");
        }

        System.out.println("===========================");

        for ( int i = words.length-1; i >= 0; i-- ){
            System.out.println(words[i]);
        }


    }

}
