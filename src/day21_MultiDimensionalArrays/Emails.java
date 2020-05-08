package day21_MultiDimensionalArrays;
/*
Task:
    given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elements could be more in the array

    print all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP

 */
public class Emails {

    public static void main(String[] args) {

        String [] emails= {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com",};
        //  if the size of above  is 10 it will execute 10 not more not less
        for (String EachMail: emails ){
            if (EachMail.endsWith("gmail.com")){
                continue;
            }

            System.out.println(EachMail);  // EachMail should be used in for loop block because it is a local variable of for loop.

           /*
            if (!EachMail.endsWith("@gmail.com")){
                System.out.println(EachMail);
            }

            */
        }



    }

}
