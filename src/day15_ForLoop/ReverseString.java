package day15_ForLoop;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Java";  //avaJ
                //    0123

        String reverse1 = "" + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);
        int lastIndexNum = str.length()-1;

        String reverse2 = "";
        for (int i =lastIndexNum; i > 0 ; i-- ) {
          //  System.out.println(str.charAt(i));
            reverse2 += str.charAt(i);

        }
        System.out.println(reverse2);

        System.out.println("=========================================================");

        /*
        write a program to identify if a string is palindrome or not. if yes==> true,.otherwise ==> false
                level ==> level ==> palindrome
         */




    }
}
