package SelfPractice._04_11_20;

public class Arrays_Practice_Emails {

    public static void main(String[] args) {

        String [] emails = {"cybertek@yahoo.com","cybertek@gmail.com","cybertek@hotmail.com","cybertek@outlook.com",};

     //       String gmail  = emails[1];

    //    System.out.println(gmail);


      for (int i = 0; i <= emails.length-1; i++ ){
          String gmail = emails[i];
          if (gmail.endsWith("@gmail.com")) {
              System.out.println(gmail);
          }
      }

      String [] names = { "James", "Koch","Enoch","Muhammed","Mesud","Ali","Ebubekr","Omer","Muhammed","Serdar","Gulam","Muhammed","Ali"};
        /*
      String onlyName = names[3];
      String onlyName1 = names[8];
      String onlyName2 = names[11];

        System.out.println(onlyName+"1 "+onlyName1+"2 "+onlyName2+"3 ");

       */

        for (int i = 0; i <= names.length-1; i++ ){
            String Muhammed = names[i];
            if (Muhammed.equals("Muhammed")){
                System.out.print(Muhammed+" ");
            }
            String Ali = names[i];
            if (Ali.equals("Ali")){
                System.out.print(Ali+" ");
            }

        }

    }

}
