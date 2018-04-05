package salesperson;

public class SalesPerson
{
    private int idNumber;
    private double annualSales;
    
    public SalesPerson(int idNumber, double annualSales)
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