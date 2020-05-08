package SelfPractice._04_18_20;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Replit146 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        person (s);
    }


    public static  void person (String info){
        String [] arr = info.split(",");
        System.out.println("person name: "+arr[0]+" last name: "+arr[1]+ " age: "+arr[2]);
    }


}
