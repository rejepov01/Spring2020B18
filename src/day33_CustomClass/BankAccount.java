package day33_CustomClass;

public class BankAccount {
    /*
    practice task:
      create a custom class for bank account
      attributes: accountHolder, accountNumber, balance
      actions: checkingBalance(), withDraw( amount ), deposit( amount )
     */

    String accountHolder;
    long accountNumber;
    double balance;

    public void checkingBalance(){
        System.out.println("Available Balance: "+ balance);
    }

    public void withDraw(double amount){
        if (amount > balance){
            System.out.println("penalty charge added: "+(balance-35));
        }else if (balance <=0){
            System.out.println("low balance for withdraw"+balance);
        }else{
            System.out.println("Your balance is: "+balance);
        }
        System.out.println("Withdrawing $"+amount);
        balance -= amount;
    }

    public void deposit(double amount){
        System.out.println("Depositing $" + amount);
        balance +=amount;
    }

    public String toString(){
       String result = "Account Holder: "+accountHolder+"\nAccount Number: "+accountNumber+"\nAvailable Balance: $"+balance;
        return result;
    }
}
