package day46_final_abstract;

class Test {
   /*
    private void method1(){  cannot be inherited in subclasses due to private modifier
    }
    */

    public final void method1(){
        System.out.println("A");
    }

}

public class final_methods2 extends Test{

    /*
    @Override
    public void method1(){
        System.out.println("B");
    }

     */

}
