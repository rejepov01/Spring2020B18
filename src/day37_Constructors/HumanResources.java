package day37_Constructors;

public class HumanResources {
    /*
    	2. create a class called HumanResources
			declare 5 variables of Employee as static
			use static block to:

						1. initialize those static variables
						2. set all the info of the Employees
     */

    static Employee employee1 = new Employee();
    static Employee employee2 = new Employee();
    static Employee employee3 = new Employee();
    static Employee employee4 = new Employee();
    static Employee employee5 = new Employee();
  /*
    public static void main(String[] args) {
        employee1.setInfo("Shammy",1236,253614564,"QA",120000,'M');
        employee2.setInfo("Kyle",4563,78965412,"SDET",125000,'M');
        employee3.setInfo("Jenny",4568,126539874,"Developer",130000,'F');
        employee4.setInfo("Karina",8596,74575632,"Senior SDET",1250000,'F');
        employee5.setInfo("Mesud",7536,456987123,"Senior Developer",160000,'M');

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);
    }

   */

    static {
        employee1.setInfo("Shammy",1236,253614564,"QA",120000,'M');
        employee2.setInfo("Kyle",4563,78965412,"SDET",125000,'M');
        employee3.setInfo("Jenny",4568,126539874,"Developer",130000,'F');
        employee4.setInfo("Karina",8596,74575632,"Senior SDET",1250000,'F');
        employee5.setInfo("Mesud",7536,456987123,"Senior Developer",160000,'M');

    }

}
