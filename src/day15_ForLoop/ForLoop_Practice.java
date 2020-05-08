package day15_ForLoop;

public class ForLoop_Practice {

    public static void main(String[] args) {

        /*
        odd number between 1~100 in a single line separated by a space
                            1  3  5 ..
         */

        String resultOdd = "";

        for (int number = 1; number <=100; number +=2) {
          //  System.out.print(number+" ");
           //  result += number+" ";
            resultOdd = resultOdd + number + " ";

            System.out.print(resultOdd);

        }


            /*
            even number between 1~100 in a single line separated by a space
                            1  3  5 ..

             */
        String resultEven = "";
        for (int number1 = 2; number1 <=100; number1 +=2){
         //   System.out.print(number1 +" ");
            resultEven += number1+" ";

            System.out.print(resultEven);
        }

    }

}
