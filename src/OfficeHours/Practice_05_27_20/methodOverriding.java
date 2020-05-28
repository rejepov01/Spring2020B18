package OfficeHours.Practice_05_27_20;

public class methodOverriding {

    public void method1(){
        System.out.println("Super class");
    }
}


class Test extends methodOverriding{
     // sub            super

   //   @Override can be done like this or by sidebar arrow
    public void method1(){
        System.out.println("Sub class");
    }


    public static void main(String[] args) {

        methodOverriding obj = new methodOverriding();
        obj.method1();

        Test obj1 = new Test();
        obj1.method1();

    }
}
