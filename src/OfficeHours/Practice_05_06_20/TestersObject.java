package OfficeHours.Practice_05_06_20;

public class TestersObject {

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.name = "Muhtar";
        tester1.jobTitle = "SDET";
        tester1.salary = 9000000;
        tester1.employeeID = 12354;

        System.out.println(tester1);

         Tester tester2 = new Tester();

        tester2.setInfo("John Travolta","junior SDET",65000,12333);

        System.out.println(tester2);

        tester1.smokeTesting();
        tester2.smokeTesting();

        tester2.creatingTicket();
    }
}
