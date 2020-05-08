package OfficeHours.Practice_03_11_20;

public class Practise_Variables {

    public static void main(String[] args) {


        /*
        brand
        year
        price
        model
        miles
         */

        String brand = "BMW";
        short year = 2020;
        float price = 50000.50f;
        String model = "X6";
        short maximumMiles = 32767;

/*
output:
   The vehicle 2020 BMW X6, has 32767 miles, price is 50000.5 dollars

 */
        System.out.println("The vehhicle " + year + " "+brand+ " "+model+" , has " +maximumMiles
                + " miles, price is " + price + " USD" );


    }

}
