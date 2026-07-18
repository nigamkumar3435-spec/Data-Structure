class BankAccount
{
    //private data(hidden from outside)
    private String accountNumber;
    private double balance;

    //constructor
    BankAccount(String accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //getter for accountNumber
    public String getAccountNumber()
    {
        return accountNumber;
    }

    //getter for balance
    public double getBalance()
    {
        return balance;
    }

    //controlled update through setter method
    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance += amount;
            System.out.println("Deposited "+amount);
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    public void withdraw(double amount)
    {
        if(amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrawn "+amount);
        }else{
            System.out.println("Insufficient Balance");
        }
    }
}
public class Encapsulation
{
    public static void main(String args[])
    {
        BankAccount acc = new BankAccount("12345", 5000);

        //Access through methods only
        System.out.println("Account Number: "+ acc.getAccountNumber());
        System.out.println("Balance: "+ acc.getBalance());

        acc.deposit(5000);
        acc.withdraw(2000);

        //acc.balance = 10000;       // Error
        //acc.accountNumber = "999"; // Error
    }
}