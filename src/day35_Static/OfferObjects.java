package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("NJ","BOA",100000,true);

        Offer offer2 = new Offer();
        offer2.setInfo("LA","Capital One",95000,true);

        Offer offer3 = new Offer();
        offer3.setInfo("NYC","United Nations",120000,false);

        Offer offer4 = new Offer();
        offer4.setInfo("CT","Chase",125000,false);

        Offer[] offers = {offer1,offer2,offer3,offer4};

        String myLocation = "NJ";

        ArrayList<Offer> Accept = new ArrayList<>(Arrays.asList(offers));
       // Accept.removeIf(each -> each.salary < 100000 || !each.isFulltime || !each.location.equals(myLocation));
        Accept.removeIf(each -> each.salary < 100000);
        Accept.removeIf(each -> each.isFulltime == false);
        Accept.removeIf(each-> !each.location.equals(myLocation));


        System.out.println(Accept.size());


        for ( Offer eachOferr  : Accept){
            System.out.println(eachOferr);
        }




    }
}
