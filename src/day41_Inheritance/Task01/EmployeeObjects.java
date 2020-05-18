package day41_Inheritance.Task01;

public class EmployeeObjects {

    public static void main(String[] args) {

        Developer dev1 = new Developer("Sha",120000,12365,"Developer",'M');

       // dev1.reporting();
        dev1.fixingBug();

        System.out.println( dev1);

        Tester tester1 = new Tester("Mesud",125000,25874,"SDET",'M');

        tester1.reporting();
        tester1.testing();
        //tester1.coding(); developer has this action so it is not belongs to tester

        System.out.println( tester1);

        BusinessAnalyst BA1 = new BusinessAnalyst("Serene",120001,4563,"Business Analyst",'F');
       // BA1.coding();
        // BA1.fixingBug();
        BA1.writingReq();
        BA1.gathering();

        System.out.println( BA1);
    }
}
