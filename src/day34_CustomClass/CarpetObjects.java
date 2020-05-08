package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {

    public static void main(String[] args) {

          Carpet [] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};
                    carpets[0].customOrder(7,8.5,20,true);
                    carpets[1].customOrder(10,15,30,false);
                    carpets[2].customOrder(9,20,15,true);
                    carpets[3].customOrder(20,18,25,false);
                    carpets[4].customOrder(35,45,35,false);


      //  System.out.println(carpets[0]);
       // System.out.println(carpets[1]);
       // System.out.println(carpets[2]);
       // System.out.println(carpets[3]);
        System.out.println(carpets[4]);

        ArrayList<Carpet> persianCarpets = new ArrayList<>();

        for ( Carpet eachCarpet  : carpets) {
            if (eachCarpet.isPersian){
                persianCarpets.add(eachCarpet);
            }
        }
        System.out.println("there are "+persianCarpets.size()+" persian carpets");

        System.out.println( persianCarpets.get(0).calCost() );
        System.out.println( persianCarpets.get(1).calCost() );


        ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets));
        regularCarpets.removeAll(persianCarpets);
      //  regularCarpets.removeIf(p-> p.isPersian);

        System.out.println("There are "+regularCarpets.size()+" regular carpets");

        for (int i = 0; i < regularCarpets.size(); i++){
            System.out.println( regularCarpets.get(i).calCost());
        }

    }
}
