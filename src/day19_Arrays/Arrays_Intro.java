package day19_Arrays;

public class Arrays_Intro {

    public static void main(String[] args) {

        //   int scores = 90 , 10, 20;  regular variables can only have one data

        /*
        declaration:
				DataType[]  variableName = { dat1, data2, data3 };
				// 70, 75, 85, 90, 95, 100
         */


        int [] score = { 70, 75, 85, 90, 95, 100  };
      // index numbers    0   1   2   3   4   5

      //  retrieve: variableName [ index ]

        int num1 = score [2] ;   // 85 returns as an  int

        System.out.println(num1);


        int num2 = score[5];   // 100 as an int

        System.out.println(num2);


    }
}
