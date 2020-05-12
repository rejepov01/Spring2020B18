package day38_Constructors;

public class EmployeeSalary {

    public static void main(String[] args) {

        SalaryCalculator employee1 = new SalaryCalculator(55,40,8.25/100,0.2);

        System.out.println(employee1.salary());

        System.out.println(employee1);


        System.out.println("===========================");

        SalaryCalculator Sha = new SalaryCalculator(50,40,8.25/100,0.2);

        System.out.println( Sha.salary());

        System.out.println( Sha );
    }
}
