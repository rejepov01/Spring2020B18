package day40_Encapsulation;

import javax.sound.midi.Soundbank;

public class Test {

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
       // System.out.println( obj.SSN );

        System.out.println( obj.getSSN() ); // 0

        // obj.SSN = 12345;
        obj.setSSN(123546);

        System.out.println( obj.getSSN() );  // 123456

    }
}
