package day42_Inheritance;

class Test{

    public Test(int a) {
        this(10.5);
        System.out.println("A");
    }

    // one more constructor to see how it works

    public Test(double a){
        System.out.println("C");
    }


}



public class Constructor2 extends Test{

    public Constructor2(){
        super(10);
        System.out.println("B");
    }

    public static void main(String[] args) {

     Test obj = new Test(10); // C A

      //  Constructor2 obj2 = new Constructor2();  // C A B
    }
}
