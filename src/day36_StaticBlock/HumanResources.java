package day36_StaticBlock;

import OfficeHours.Practice_05_06_20.Developer;

public class HumanResources {

    static Developer dev1 = new Developer();
    static Developer dev2 = new Developer();
    static Developer dev3 = new Developer();
    static Developer dev4 = new Developer();
    static Developer dev5 = new Developer();

     /*
    public static void main(String[] args) {
        dev1.setInfo("Sha","Developer",120000,12356);
    }

      */

    static {
        dev1.setInfo("Sha","Developer",120000,12356);
    }


}
