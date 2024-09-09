public class Savings extends Account
{

    private static int depositCounter;
    public Savings(double balance)
    {
        super(balance);
    }

    @Override
    public void withdrawal(double amount)
    {
        if((getAccountBalance() - amount) < 500)
        {
            super.withdrawal(amount);
            System.out.println("Charging a fee of $10 because you are below $500");
            super.withdrawal(10);
        }
        else
        {
            super.withdrawal(amount);
        }
    }

    @Override
    public void deposit(double amount)
    {
        depositCounter++;
        super.deposit(amount);
        System.out.println("This is deposit " + depositCounter + " to this account");
        if(depositCounter > 5)
        {
            System.out.println("Charging a fee of $10");
            super.withdrawal(10);
        }
    }

    public void addInterest()
    {
        double interest = (getAccountBalance()/100)*1.5;
        super.deposit(interest);
        System.out.println("Customer earned " + interest + " in interest");
    }
}
