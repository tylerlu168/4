import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int terminate = 0;

        Checking checking = new Checking(0);
        Savings savings = new Savings(0);
        while(terminate == 0)
        {
            System.out.println("1. Withdraw from Checking" + "\n" +
                                "2. Withdraw from Savings" + "\n" +
                                "3. Deposit to Checking" + "\n" +
                                "4. Deposit to Savings" + "\n" +
                                "5. Balance of Checking" + "\n" +
                                "6. Balance of Savings" + "\n" +
                                "7. Award Interest to Savings now" + "\n" +
                                "8. Quit");

            int choice = input.nextInt();

            if(choice == 1)
            {
                System.out.println("How much would you like to withdrawal from Checking?");
                double withdrawalMoney = input.nextDouble();
                checking.withdrawal(withdrawalMoney);
            }
            else if(choice == 2)
            {
                System.out.println("How much would you like to withdrawal from Savings?");
                double withdrawalMoney = input.nextDouble();
                savings.withdrawal(withdrawalMoney);
            }
            else if(choice == 3)
            {
                System.out.println("How much would you like to deposit from Checking?");
                double depositMoney = input.nextDouble();
                checking.deposit(depositMoney);
                System.out.println("Doing default deposit");
            }
            else if(choice == 4)
            {
                System.out.println("How much would you like to deposit from Savings?");
                double depositMoney = input.nextDouble();
                savings.deposit(depositMoney);
            }
            else if(choice == 5)
            {
                System.out.println("Your balance for checking " + checking.getAccountNumber() + " is " + checking.getAccountBalance());
            }
            else if(choice == 6)
            {
                System.out.println("Your balance for savings " + savings.getAccountNumber() + " is " + savings.getAccountBalance());
            }
            else if(choice == 7)
            {
                savings.addInterest();
            }
            else if(choice == 8)
            {
                terminate = 1;
            }
        }
    }
}