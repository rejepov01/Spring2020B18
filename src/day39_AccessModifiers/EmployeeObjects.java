package day39_AccessModifiers;

import javax.crypto.spec.PSource;

public class EmployeeObjects {

    public static void main(String[] args) {

       Employee employee1  = new Employee("Sha");

        System.out.println( employee1 );

        Employee employee2 = new Employee("John","Actor");

        System.out.println( employee2 );

        Employee employee3 = new Employee("Zidane","Coach",123);

        System.out.println( employee3 );

        Employee employee4 = new Employee("Zidane","Coach",12356,10000000);

        System.out.println( employee4);

        Employee employee5 = new Employee("Mesud","Developer",12365,150000,'M');

        System.out.println( employee5 );


    }

}
