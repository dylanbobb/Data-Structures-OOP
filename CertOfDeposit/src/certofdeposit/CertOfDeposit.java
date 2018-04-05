package certofdeposit;

import java.time.LocalDate;

public class CertOfDeposit
{
    private int certNum;
    private String lastName;
    private double balance;
    private LocalDate issue;
    private LocalDate maturity;
    
    public void setCertNum(int certNum)
    {
        this.certNum = certNum;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    
    public void setIssue(LocalDate issue)
    {
        this.issue = issue;
    }
    
    public void setMaturity(LocalDate maturity)
    {
        this.maturity = maturity;
    }
    
    public int getCertNum()
    {
        return this.certNum;
    }
    
    public String getLastName()
    {
        return this.lastName;
    }
    
    public double getBalance()
    {
        return this.balance;
    }
    
    public LocalDate getIssue()
    {
        return this.issue;
    }
    
    public LocalDate getMaturity()
    {
        return this.maturity;
    }
    
    public CertOfDeposit(int certNum, String lastName, double balance, LocalDate issue)
    {
        this.certNum = certNum;
        this.lastName = lastName;
        this.balance = balance;
        this.issue = issue;
        this.maturity = issue.plusYears(1);
    }
}