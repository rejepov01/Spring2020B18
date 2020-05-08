package day23_Methods;

public class Methods_WithParameters2 {

    // 3. create a function that can reverse any string

    //  "Muhtar" ==> rathuM,  "cybertek" ==> ketrebyC

    public static void main(String[] args) {

        String name = "Mesud";
        ReverseString(name);

        System.out.println("Hello World");

        String name2 = "Leyla";
        ReverseString(name2);

    }

    public static void ReverseString(String str){

        for (int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    /*
    4. create a function that can print the maximum number from any given array
	5. create a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]

     */






}
