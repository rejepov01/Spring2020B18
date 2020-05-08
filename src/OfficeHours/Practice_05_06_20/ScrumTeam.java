package OfficeHours.Practice_05_06_20;

import java.util.ArrayList;

public class ScrumTeam {

    ArrayList<Tester> testersTeam = new ArrayList<>();
    ArrayList<Developer> devpTeam = new ArrayList<>();


    public void hireATester(Tester tester){
        testersTeam.add(tester);
    }

    public void fireATester(long id){
        testersTeam.removeIf(p-> p.employeeID == id);
    }

    public void hireDeveloper(Developer developer){
        devpTeam.add(developer);
    }

    public void fireADeveloper (long id){
        devpTeam.removeIf( eachDevp-> eachDevp.employeeID == id);
    }



}
