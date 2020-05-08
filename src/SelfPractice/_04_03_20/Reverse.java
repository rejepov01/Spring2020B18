package SelfPractice._04_03_20;
/*
write a program that can reverse the following string:
				String str = "Java";
				output: avaJ
			please provide two solutions:
						first solution, you MUST use substring method
						second solution, you MUST use charAt method
 */

public class Reverse {

    public static void main(String[] args) {

        String str = "Sha Muhammet Rejepov is lucky guy";
         //           0123
      //  String reverse = str.substring(3) + str.substring(2,3) + str.substring(1,2)+ str.substring(0,1);
      // String reverse1 = " "+ str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);

        String reverse = "";
        int lastIndexNumber = str.length()-1;
       for (int s =lastIndexNumber ; s >=0 ; s -- ) {
           reverse+= str.charAt(s) ;
       }

     //   System.out.println(reverse);
     //   System.out.println(reverse1);
        System.out.println(reverse);

    }
}
