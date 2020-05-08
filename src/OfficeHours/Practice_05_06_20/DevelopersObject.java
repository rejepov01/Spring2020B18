package OfficeHours.Practice_05_06_20;

import java.util.ArrayList;
import java.util.Arrays;

public class DevelopersObject {

    public static void main(String[] args) {

        Developer developer1  = new Developer();
        developer1.setInfo("Leon","Senior Developer",180000,12546);

        Developer developer2 = new Developer();
        developer2.setInfo("Mammet","Senior Developer",150000,123654);

        System.out.println( developer1 );
        System.out.println(developer2);

        developer1.coding();
        developer2.coding();

        developer1.fixinBug();
        developer2.fixinBug();

        System.out.println("==============================================================");

       Developer[] arr = {developer1,developer2};

      /*
       for (int i = 0 ; i < arr.length; i++){
           System.out.println( arr[i] );
       }

       */

        for ( Developer each  : arr ){
            System.out.println(each.name + " "+each.salary);
        }


        System.out.println("====================================================");

        ArrayList<Developer> developers = new ArrayList<>(Arrays.asList(developer1,developer2));
       //  developers.addAll(Arrays.asList(developer1,developer2));

        /*
        for ( int i = 0; i < developers.size(); i++){
            System.out.println( developers.get(i).name);
        }

         */

        for ( Developer each  :  developers){
            System.out.println( each.name+" "+each.salary );
        }



    }
}
