package OfficeHours.Practice_05_13_20;

public class statics {

    int instanceVariables = 100;
    static int staticVariable = 200;

    public static void staticMethod(){
       // instanceMethod();
      //  System.out.println(instanceVariables);
        System.out.println(staticVariable);
    }

    public void instanceMethod(){
        staticMethod();
        System.out.println(staticVariable);
        System.out.println(instanceVariables);
    }

    public static void main(String[] args) {
       // System.out.println(instanceVariables);
        System.out.println(staticVariable);
        staticMethod();
       // instanceMethod();
    }
}
