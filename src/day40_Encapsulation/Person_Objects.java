package day40_Encapsulation;

public class Person_Objects {

    public static void main(String[] args) {

        Person Sha = new Person("Sha");
        System.out.println( Sha.name );
      //  System.out.println( Sha.SSN );

        Sha.setSSN(12354);
        System.out.println( "Sha's SSN: "+Sha.getSSN() );


        // System.out.println( Sha.ID);\

        Sha.setID(564);
        System.out.println( "Sha's ID: "+Sha.getID());




    }
}
