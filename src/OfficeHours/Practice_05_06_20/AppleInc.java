package OfficeHours.Practice_05_06_20;

public class AppleInc {

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setInfo("Onur","Junior Tester",85000,1245);

        Tester tester2 = new Tester();
        tester2.setInfo("Elton John","Junior Tester",75000,23654);

        Tester tester3 = new Tester();
        tester3.setInfo("Rahman","SDET",120000,22222);

        ScrumTeam scrum1 = new ScrumTeam();  // we can use the ArrayList in scrumTeam class

        scrum1.hireATester(tester3);
        scrum1.hireATester(tester2);
        scrum1.hireATester(tester3);

        scrum1.fireATester(23654);


       // scrum1.testersTeam  // returns the testerTeam arrayList form scrum1

        for (Tester each   : scrum1.testersTeam){  // prints out everySingle tester from scrumTeam
            System.out.println(each);
        }


        System.out.println("========================================================================");

        Developer dev1 = new Developer();
        dev1.setInfo("Muhtar","Developer",150000,23654);


        Developer dev2 = new Developer();
        dev2.setInfo("Cinar","Devp",125000,12345);

        scrum1.hireDeveloper(dev1);
        scrum1.hireDeveloper(dev2);

        scrum1.fireADeveloper(23654);


        System.out.println(scrum1.devpTeam.size());


        for (Developer each  : scrum1.devpTeam ){ // arrayList of Developer in scrum team
            System.out.println(each);
        }


        System.out.println("In my scrum team, We have "+scrum1.testersTeam.size()+" testers and "
                +scrum1.devpTeam.size()+ " developers");

        System.out.println("===================================================================");

        /*
        create scrum2: 4 developers, 2 testers
        create scrum3: 5 developers, 3 testers
        create an array of scrum: {scrum1, scrum2, scrum3};
            1. iterator the array to print out all the testers who have salary > 120000
            2. print out all the developers who have salary < 120000
        create an ArrayList of scrum: {scrum1, scrum2, scrum3};
               1. remove all the testers who have salary < 100000
               2. remove all the developers who have salary < 120000
           NOTE: DO NOT create any ArrayList of Testers or Developers.
                Use the ArrayLists in ScrumTeam class only
         */


        ScrumTeam scrum2 = new ScrumTeam();

        Developer devl1 = new Developer();
        devl1.setInfo("Maksat","Developer",155000,223566);
        Developer devl2 = new Developer();
        devl2.setInfo("Mekan","Developer",160000,4412356);
        Developer devl3 = new Developer();
        devl3.setInfo("Dovran","Developer",165000,7789665);
        Developer devl4 = new Developer();
        devl4.setInfo("Arslan","Developer",170000,4563214);

        Tester testr1 = new Tester();
        testr1.setInfo("Tore","Senior SDET",125000,332615);
        Tester testr2 = new Tester();
        testr2.setInfo("Gulam","SDET",120000,142536);

        scrum2.hireDeveloper(devl1);
        scrum2.hireDeveloper(devl2);
        scrum2.hireDeveloper(devl3);
        scrum2.hireDeveloper(devl4);

        scrum2.hireATester(testr1);
        scrum2.hireATester(testr2);


        ScrumTeam scrum3 = new ScrumTeam();

        Developer devel1 = new Developer();
        devel1.setInfo("Mammet","Developer",185000,857496);
        Developer devel2 = new Developer();
        devel2.setInfo("Herkul","Developer",190000,415263);
        Developer devel3 = new Developer();
        devel3.setInfo("Ahmet","Developer",195000,758642);
        Developer devel4 = new Developer();
        devel4.setInfo("Nury","Developer",190000,356824);
        Developer devel5 = new Developer();
        devel5.setInfo("Vepa","Developer",200000,425386);

        Tester test1 = new Tester();
        test1.setInfo("Orkide","SDET",130000,265948);
        Tester test2 = new Tester();
        test2.setInfo("Helen","Senior SDET",135000,789456);
        Tester test3 = new Tester();
        test3.setInfo("May","SDET",115000,741236);

        scrum3.hireDeveloper(devel1);
        scrum3.hireDeveloper(devel2);
        scrum3.hireDeveloper(devel3);
        scrum3.hireDeveloper(devel4);
        scrum3.hireDeveloper(devel5);

        scrum3.hireATester(test1);
        scrum3.hireATester(test2);
        scrum3.hireATester(test3);

        ScrumTeam[] scrum = {scrum1,scrum2,scrum3};









    }
}
