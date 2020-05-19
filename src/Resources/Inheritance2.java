package Resources;

import day42_Inheritance.AccessModifiers;

public class Inheritance2 extends AccessModifiers {
       //      sub                    super

    /*
    publicVariable
    protectedVariable

    publicMethod
    protectedMethod
     */

    public static void main(String[] args) {

        // in different package only public and protected can be inherited

        System.out.println( Inheritance2.publicVariable );
        System.out.println( Inheritance2.protectedVariable );
     //   System.out.println( Inheritance2.defaultVariable);


        Inheritance2.publicMethod();
        Inheritance2.protectedMethod();
      //  Inheritance2.defaultMethod();
    }

}
