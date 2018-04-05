package account;

import java.time.LocalDate;

public class Account
{
    private int id;
    private double balance;
    private static double annualInterestRate = 0;
    private LocalDate dateCreated;
    
    public Account(int id, double balance)
    {
        if(balance < 50)
        {
            this.balance = 50;
        }
        else
        {
            this.balance = balance;
        }
        
        this.id = id;
        this.dateCreated = LocalDate.now();
    }
    
    public Account()
    {
        this(0,0);
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    
    public void setAnnualInterestRate(double air)
    {
        annualInterestRate = air;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public double getBalance()
    {
        return this.balance;
    }
    
    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    
    public LocalDate getDateCreated()
    {
        return this.dateCreated;
    }
    
    public double getMonthlyInterestRate()
    {
        return annualInterestRate / 12;
    }
    
    public double getMonthlyInterest()
    {
        return this.balance * this.getMonthlyInterestRate();
    }
    
    public void withdraw(double amount)
    {
        balance -= amount;
    }
    
    public void deposit(double amount)
    {
        balance += amount;
    }
    
    @Override
    public String toString()
    {
        return this.id + " " + this.balance;
    }
}