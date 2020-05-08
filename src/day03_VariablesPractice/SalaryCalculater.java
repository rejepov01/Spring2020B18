package day03_VariablesPractice;

public class SalaryCalculater {

    /*

Task 08:
		Create a class called salary calculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
			ex:
				if:
					rate = 55;
					stateTax = 0.04;
					federalTax =0.22;
					weeklyHours = 40;
				then output will be:
					your salary is: 105600 USD
					your total tax is: 27456 USD
					your income after tax is: 78144 USD
				if:
					rate = 45.25;
					stateTax =0.045;
					federalTax = 0.25;
					weeklyHours = 45;
				then output will be:
					your salary is: 91260 USD
					your total tax is: 26921.7
					your income after tax: 64338.3 USD

     */

    public static void main(String[] args) {

        // DataType  varaibleName = Data;

        double hourlyRate = 55;
        double stateTaxRate = 0.04;
        double fedaralTaxRate = 0.22;
        byte weeklyHours = 40;
        byte  totalWeeks = 52;

        //  salary = hourlyRate * weeklyHours * 52

        double salary = hourlyRate * weeklyHours * totalWeeks;
           // Salary before tax

        // stateTax = salary * stateTaxRate
        double stateTax = salary * stateTaxRate;

        // fedaralTax = salary * federalTaxRate
        double federalTax = salary * fedaralTaxRate;

         // salaryAfterTax = salary - stateTax - federalTax
        double salaryAfterTax = salary - stateTax - federalTax;

        // totalTax = stateTax + federalTax
        double totalTax = stateTax + federalTax;

        System.out.println("Your Salary is : $" + salary);  // concatination
        System.out.println("State Tax is : $" + stateTax); // concatination
        System.out.println("Federal Tax is : $" + federalTax);
        System.out.println("Total Tax is : $" + totalTax );
        System.out.println("Salary After Tax is : $" + salaryAfterTax);


/*
        System.out.println( "9" + 3 ); // 93 concatenation
        System.out.println( 9 + "3" ); // 93 concatenation
        System.out.println( 9 + 3 ); // 12 addition

*/




    }
}
