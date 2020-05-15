package day38_Constructors;

public class ConstructorCall3 {

    public ConstructorCall3 (){
        // this(9);  // int argument
        System.out.println("default");
     //   this(9);  // int argument
    }

    public ConstructorCall3(int a){
       // this();
      //   this(10); constructor Can Not call itself
        System.out.println("Int argument");
    }

    public ConstructorCall3(String str){
      //  this("Hello");

    }

    public static void main(String[] args) {

        ConstructorCall3 obj = new ConstructorCall3();
    }

    public void method1(){
      //  this();
    }


}
