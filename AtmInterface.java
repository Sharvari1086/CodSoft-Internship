import java.util.Scanner;
 class AtmInterface{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    BankAccount ba = new BankAccount(1000);
        System.out.println("WELCOME TO ATM MACHINE");
        boolean run =true;
        do
        {
            System.out.println("Bank options\n");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your option:");
            int choose = sc.nextInt();
            switch(choose)
            {
                case 1 :
                    System.out.println("Enter the amount to deposit");
                    double depositamt= sc.nextDouble();
                    ba.deposit(depositamt);
                    System.out.println("Deposit succesfull!!!");
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw");
                    double withdrawamt= sc.nextDouble();
                    ba.withdraw(withdrawamt);
                    System.out.println("withdrawl sucessfull!!!");
                    break;
                case 3:
                    System.out.println("Your current balance is"+ " " + ba.checkBalance());
                    break;
                case 4:
                    run=false;
                    System.out.println("Thankyou for visting aur atm machine");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
        while(run);
    }
}
class BankAccount
{
    private double bal;
    BankAccount(double balance){
        bal=balance;
    }

    public void deposit(double amt)
    {
        if(amt>0) {
            bal += amt;
        }
        else
        {
            System.out.println("Invalid deposit amt");
        }
    }
    public void withdraw(double wamt)
    { if(wamt>0 && bal >= wamt) {

            bal= bal - wamt;

        } else {
            System.out.println("The balanance is insufficient");
        }
    }

    public double checkBalance()
    {
        return bal;
    }
}
