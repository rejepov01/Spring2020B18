package day42_Inheritance;

class test {

    public test(){
       // System.out.println("super class' default constructor");
        System.out.println("A");
    }

}

public class Constructor extends test {

    public Constructor(){
       // System.out.println( "sub class' default constructor");
        System.out.println("B");
    }


    public static void main(String[] args) {

      //  test obj  =new test()   // super class or  A
        Constructor obj = new Constructor();  // AB or super and sub
    }
}
