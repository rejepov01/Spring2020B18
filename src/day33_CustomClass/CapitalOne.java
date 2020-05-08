package day33_CustomClass;

public class CapitalOne {

    public static void main(String[] args) {
        BankAccount Sha= new BankAccount();
                    Sha.accountHolder = "Sha";
                    Sha.accountNumber = 13547886;

         Sha.checkingBalance();
         Sha.deposit(33);

         Sha.checkingBalance();

         Sha.withDraw(13);

         Sha.checkingBalance();

         Sha.withDraw(30);

         Sha.checkingBalance();

         Sha.withDraw(1000);

         Sha.checkingBalance();

        System.out.println("===========================================");

        System.out.println( Sha);
    }
}
