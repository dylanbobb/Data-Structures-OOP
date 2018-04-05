package account;

public class AccountDriver
{
    public static void main(String[] args)
    {
        Account o1 = new Account(1122,20000);
        o1.setAnnualInterestRate(0.045);
        o1.withdraw(2500);
        o1.deposit(3000);
        System.out.println(o1.getBalance());
        System.out.println(o1.getMonthlyInterest());
        System.out.println(o1.getDateCreated());
        System.out.println();
        
        Account[] accountArr = new Account[3];
        int id = 1123;
        double balance = 21000;
        for(Account x:accountArr)
        {
            x = new Account(id, balance);
            System.out.println(x.getBalance());
            System.out.println(x.getMonthlyInterest());
            System.out.println(x.getDateCreated());
            System.out.println();
            id++;
            balance += 500;
        }    
    }
}