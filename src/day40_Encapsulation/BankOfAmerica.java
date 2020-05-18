package day40_Encapsulation;

public class BankOfAmerica {

    public static void main(String[] args) {

        EmployeeInfo Sha = new EmployeeInfo();
        Sha.setAddress("New Jersey");
        Sha.setSalary(120000.00);

        System.out.println( Sha.getAddress() );
        System.out.println( Sha.companyName );
        System.out.println( Sha.getSalary() );


    }
}
