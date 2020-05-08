package day19_Arrays;

public class Arrays_Practice1 {

    public static void main(String[] args) {

        String [] myClassMates = { "Dovran", "Annaguly", "Shammy", "Bayram", "Seljuk",};
                 // index numbers     0          1           2        3          4
        String name1 = myClassMates [3];

        System.out.println(name1);

        String name2 = myClassMates [0];

        System.out.println(name2);

        String name3 = myClassMates [2];

        System.out.println(name3);


        System.out.println("==============================");


        for ( int i = 0; i <= 4; i++){
           String name = myClassMates[i];
            System.out.println(name);
        }

        System.out.println("====================================================================");


        String [] presidents = {"Donal Trump","Barack Obama", "George Bush", "Bill Clinton","George W Bush"};

        for (int i = 0; i <= 4; i++){
            String namesOFPrs = presidents[i];
            System.out.println(namesOFPrs);
        }

        System.out.println("=============================================================");

        String [] emails = {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com"};

        // print out all users who registered with their gmail

        //  max: 4

        for (int i = 0; i <= 3; i++){
            String email = emails[i];
            if (email.endsWith("gmail.com"))
            System.out.println(email);
        }

    }

}
