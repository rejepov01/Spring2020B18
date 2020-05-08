package day34_CustomClass;

import day24_Methods.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmericaObjects {

    public static void main(String[] args) {
        Tester tester1 = new Tester();
               tester1.setTesterInfo("Sha Rejepov",6235487,"SDET",120000);

        Tester tester2 = new Tester();
                tester2.setTesterInfo("Elon Musk",6321458,"Senior SDET",150000);

         Tester tester3 = new Tester();
                tester3.setTesterInfo("John Lenon",632548,"QA",200000);

        Tester tester4 = new Tester();
               tester4.setTesterInfo("Andrey Cuomo",23564,"Uber Driver",60000);

         Tester tester5 = new Tester();
                 tester5.setTesterInfo("Elton John", 12369,"Manual Tester",100000);

        ArrayList<Tester> testers = new ArrayList<>();
                           testers.addAll(Arrays.asList(tester1,tester2,tester3,tester4,tester5));

                           testers.removeIf(p-> !p.jobTitle.contains("SDET"));

         double totalBudget = 0;
         for ( Tester each : testers ){
             System.out.println(each);
             totalBudget +=each.salary;
         }

        System.out.println(totalBudget);


    }
}
