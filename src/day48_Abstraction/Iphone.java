package day48_Abstraction;
/*
2. create the following subclasses of phone:
						1. iPhone

			create constructors in each sub class that can initialize the instance variables
 */

public class Iphone extends Phone{
    static {
        brand = "iPhone";
    }

    public Iphone (String model, double price, String size){
        brand = "iPhone";
        this.model = model;
        this.price = price;
        this.size = size;
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("iphone is calling with "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("iphone is texting with "+phoneNumber);
    }

    public void faceTime(long phoneNumber){
        System.out.println("iphone is facetiming with "+phoneNumber);
    }
}
