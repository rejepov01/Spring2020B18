package day43_MethodOverriding;

class Test{

   public void method(){
        System.out.println("Sha");
    }
}

public class MethodOverriding extends Test {

    public MethodOverriding(){

    }
    @Override
    public void method(){
        System.out.println("Leyla");
     //   return 10;  return type must be same in method overriding
    }

    public static void main(String[] args) {

        Test obj1 = new Test();
        obj1.method();  // Sha

        MethodOverriding obj2 = new MethodOverriding();
        obj2.method(); // Sha
    }


}
