package day40_Encapsulation;

public class Quiz {

    // question 11

    public Quiz (){
        System.out.print("A");
    }

    public Quiz (int a){
        this(2.5);
        System.out.print("B");
    }

    public Quiz (double a){
        this();
        System.out.print("C");
    }

    public static void main(String[] args) {
        Quiz obj = new Quiz(100);
    }
}
