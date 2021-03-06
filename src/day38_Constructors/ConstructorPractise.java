package day38_Constructors;

public class ConstructorPractise {
    /*
    Rules:
1. only constructor can call another constructor
2. In order to call a constructor in another constructor ==> MUST use this() keyword (this() is used to call constructors)
    this(): can only be used in a constructor calling another constructor (DO NOT USE NAME OF CONSTRUCTOR)
3. Constructor call MUST be at FIRST step. If we call at later step ==> Compiler error
4. A Constructor can call ONLY ONE Constructor. If we call twice ==> Compiler error
5. A Constructor can NOT call ITSELF. If it calls itself ==> Compiler error
6. A Constructor can NOT contain itself ==> Meaning if a constructor called another, the latter can not call the first (because of rule 5)
     */

    public ConstructorPractise(){
        this(10.0);
        System.out.println("A");
       // this(0.5);  rule #3
    }

    public ConstructorPractise(int a){
        this();
       // this(10.5) ;
        System.out.println("B");

    }

    public ConstructorPractise (double a){
        //this();  rule # 5
       // this(5.5);  rule # 5
       //   this(10);  rule # 5
        System.out.println("C");

    }


    public static void main(String[] args) {
        new ConstructorPractise(10);   // C  A   B  will be printed
    }

}
