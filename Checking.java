public class Checking extends Account
{
    public Checking(double balance)
    {
        super(balance);
    }

    @Override
    public void withdrawal(double amount)
    {
        if(amount >= getAccountBalance())
        {
            super.withdrawal(amount);
            System.out.println("Charging an overdraft fee of $20 because account is below $0");
            super.withdrawal(20);
        }
        else
        {
            super.withdrawal(amount);
        }
    }
}
