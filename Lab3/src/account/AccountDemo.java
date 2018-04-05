package account;

import java.util.ArrayList;

public class AccountDemo
{
    public static void main(String[] args)
    {
        ArrayList<Account> accountList = new ArrayList();
        double balance = 500;
        for(int i = 0; i < 5; i++)
        {
            accountList.add(new Account(i+1,balance));
            balance += 500;
        }
        
        accountList.forEach((x) ->
        {
            System.out.println(x);
        });
    }
}
