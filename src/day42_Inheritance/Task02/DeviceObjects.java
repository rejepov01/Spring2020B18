package day42_Inheritance.Task02;

public class DeviceObjects {

    public static void main(String[] args) {

        TV tv1 = new TV("Samsung","E250",500,"45");
        tv1.country = "USA";
        System.out.println( tv1 );


        Phone phone1 = new Phone("Iphone","Iphone 10",800,"large");

        System.out.println( phone1 );

    }
}
