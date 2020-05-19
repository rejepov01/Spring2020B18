package Resources;

import day42_Inheritance.Data;

/*
public static String publicData = "public";
    protected static String protectedDate = "protected";
       protected is always visible to any subclass
    static String defaultData = "default";
    private String privateData = "private";
 */
public class Inheritance extends Data {
    //        sub                super


    public static void main(String[] args) {

        System.out.println( Inheritance.publicData );
        System.out.println( Inheritance.protectedDate);
      //  System.out.println( Inheritance.defaultData);
      //  System.out.println( Inheritance.privateData);
    }

}
