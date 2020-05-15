package Resources;

import day39_AccessModifiers.AccessModifiers;

public class AccessModifier_Test {

    public static void main(String[] args) {

        AccessModifiers obj = new  AccessModifiers();
      //  System.out.println( obj.defaultAccess ); // default: only accessible within same package
        System.out.println( obj.publicAccess ); // open to the world

       // System.out.println( obj.SSN );  private: only accessible in the same class

    }
}
