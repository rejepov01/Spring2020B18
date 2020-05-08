package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock4 {

    static String name = "Cybertek School";
    static Tester tester1 =  new Tester();
  //  tester1.setInfo("Muhtar",12345,"SDET",120000);

    int insVariable;


    static {  // designed for statics only

        // gets executed as soon as the class is loaded
        //  designed to initialize static variables

        name = "Cybertek school";
        tester1.setTesterInfo("Muhtar",12345,"SDET",120000);
        tester1.setTesterInfo("Sha",223366,"SDET",125000);

        //  StaticBlock4 obj1 = new StaticBlock4();
        //  obj1.insVariable = 300;  // DO NOT use static block for initializing instance variables

    }




    public static void main(String[] args) {
        System.out.println(name);

        System.out.println(tester1);

        StaticBlock4 obj2 = new StaticBlock4();
        System.out.println(obj2.insVariable); // 0

    }
}
