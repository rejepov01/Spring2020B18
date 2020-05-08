package day34_CustomClass;

public class CapitalOne {

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setTesterInfo("Tosun",1235,"Senior",15000000);

        ScrumTeam scrum = new ScrumTeam();
                  scrum.hireTester(tester1);

        System.out.println(scrum.testerTeam.size());

        scrum.fireTester(1235);
        System.out.println(scrum.testerTeam.size());
    }
}
