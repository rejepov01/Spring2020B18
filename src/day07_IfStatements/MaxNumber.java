package day07_IfStatements;

import java.sql.SQLOutput;

/*
2. write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)
 */
public class MaxNumber {

    public static void main(String[] args) {

        double a = 100;
        double b = 200;
        double c = 300;

        boolean aGreater = a > b && a > c; // if a is greater than b and c , then a is maximum
        boolean bGreater = b > a && b > c; // if b is greater than a and c , then b is maximum
        boolean cGreater = c > a && c > a; // if c is greater than b and a , then c is maximum

        if(aGreater){
            System.out.println(" a is Maximum Number");
        }
        if(bGreater){
            System.out.println(" b is Maximum Number");
        }
        if(cGreater){
            System.out.println(" c is Maximum Number");
        }

    }
}
