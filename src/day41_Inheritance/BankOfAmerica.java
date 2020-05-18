package day41_Inheritance;

public class BankOfAmerica {

    public static void main(String[] args) {

        BankAccount Sha = new BankAccount("Sha","Rejepov");
      //  System.out.println( Sha.accountHolder );
        System.out.println( Sha.getAccountHolder());

        System.out.println( Sha.getBalance());

        Sha.checkBalance();
        Sha.depositing(120);
        Sha.checkBalance();
        Sha.withdrawing(80);
        Sha.checkBalance();

        System.out.println( Sha );

        Sha.withdrawing(100);
        System.out.println(Sha);
        Sha.depositing(200000);
        System.out.println(Sha);
    }
}
