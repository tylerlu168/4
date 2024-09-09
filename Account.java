public class Account
{
    private int accountNumber;

    private static int nextAccountNumber = 10001;
    private double accountBalance;

    public Account()
    {
        accountNumber = nextAccountNumber;
        nextAccountNumber++;
        accountBalance = 0.00;
    }

    public Account(double balance)
    {
        accountNumber = nextAccountNumber;
        nextAccountNumber++;
        accountBalance = balance;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public double getAccountBalance()
    {
        return accountBalance;
    }

    public void setAccountBalance(double balance)
    {
        accountBalance = balance;
    }

    public void withdrawal(double amount)
    {
        accountBalance -= amount;
    }

    public void deposit(double amount)
    {
        accountBalance += amount;

    }
}
