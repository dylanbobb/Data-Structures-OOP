// Programmer: Dylan Bobb
// Date: 1-30-2018
// This will serve as a class to model a salesperson.

package salesperson;

public class Salesperson
{
    private int idNumber;
    private double annualSales;
    
    public Salesperson(int idNumber, double annualSales)
    {
        this.idNumber = idNumber;
        this.annualSales = annualSales;
    }
    
    public void setIdNumber(int idNumber)
    {
        this.idNumber = idNumber;
    }
    
    public void setAnnualSales(double annualSales)
    {
        this.annualSales = annualSales;
    }
    
    public int getIdNumber()
    {
        return this.idNumber;
    }
    
    public double getAnnualSales()
    {
        return this.annualSales;
    }
    
    @Override
    public String toString()
    {
        return this.idNumber + " " + this.annualSales;
    }
}