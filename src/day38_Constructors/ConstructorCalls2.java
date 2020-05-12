package day38_Constructors;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
        System.out.println("Default constructor");

    }

    public ConstructorCalls2(int a){
        this();  // "Default constructor"
        System.out.println("Constructor with int argument");

    }

    public ConstructorCalls2(String str){
       //  System.out.println("Call him"); this() need to be called first
        this(10);  // default , & int arguments
        // this(); one constructor can be call only one constructor
        System.out.println("Constructor with String argument");

    }


    public static void main(String[] args) {

        ConstructorCalls2 obj = new ConstructorCalls2(); // just to see which one executed how

        System.out.println("=====================");

        ConstructorCalls2 obj1 = new ConstructorCalls2(10);

        System.out.println("=====================================");

        ConstructorCalls2 obj2 = new ConstructorCalls2("Hi");


    }

    public void method1(){
        //  ConstructorCalls2();
    }
}
