package day50_Polymorphism;

interface I{

    void method2(); // public abstract
    abstract void method3();

   //  public I(){}

   //  public void m(){}

    int a = 1000;  // public static final

    public static void main(String[] args) {
        System.out.println(a);
       // a = 2000;
    }

}

abstract class A {
    {

    }

    static {

    }

    public A(){

    }

    protected abstract void method1();
    public void method4(){

    }

}

interface I2{

}


public class Abstraction extends A implements I, I2 {

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    protected void method1(){

    }

    // public abstract void method1();
}
