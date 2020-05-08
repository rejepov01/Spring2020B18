package day15_ForLoop;

public class Palindrome {

    public static void main(String[] args) {

        String pal = "Anna";
        int lastIndexNum = pal.length()-1;

        String reverse = "";

        for (int i = lastIndexNum;  i >= 0; i--) {
           reverse += pal.charAt(i);
        }

        if (pal.equalsIgnoreCase(reverse)) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }


    }

}
