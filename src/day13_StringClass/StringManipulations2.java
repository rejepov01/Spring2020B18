package day13_StringClass;

public class StringManipulations2 {

    public static void main(String[] args) {

        String str = "Cybertek School is the best";
              //      012345678

        String schoolName = str.substring(0,8);

        System.out.println(schoolName);

        String fullName = " Kuzzat Altay";
                 //         0123456789 ..
        String firstName = fullName.substring(0,6);
        String lastName = fullName.substring(7,11+1);

        System.out.println(firstName);
        System.out.println(lastName);

        // fullname = firstName  lastName
        //  gmail : lastName_firstName@gmail.com

        String Sha = "Sha Rejepov";
        //            0123456789..

        String FirstName =Sha.substring(0,3);
        String LastName = Sha.substring(4,11);

        System.out.println(FirstName);
        System.out.println(LastName);

        // String gmail = LastName.concat("_").concat(FirstName).concat("@gmail.com");
        String gmail = LastName + "_"+FirstName+"@ gmail.com";
        System.out.println(gmail);

        String s1 = " I love Java Programming Language";
        //            012334

        String className = s1.substring(8);

        System.out.println(className);

        String s2 = "I like C# Programming  ";
        s2 = s2.replace("C#", "Java");

        System.out.println(s2);

        String name = "Covid 18";
          name =name.replace("8","9");

        System.out.println(name);

        String r1 = " I like C#, C# is fun, C# is cool";
       //  r1 = r1.replace("C#","Java");

        r1 = r1.replaceFirst("C#","Java");

        System.out.println(r1);

        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday";
        r2 = r2.replaceFirst("Tomorrow","Todays");

        System.out.println(r2);

    }

}
