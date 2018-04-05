package interfaces;

public class TaxableHouse extends House implements ITaxable
{
    public TaxableHouse(String location,boolean inCity,double estimatedValue,double area)
    {
        super(location,inCity,estimatedValue,area);
    }
    
    @Override
    public double valueTax()
    {
        if(this.inCity)
        {
            return(this.estimatedValue/1000)*5+5*area;
        }
        return (this.estimatedValue/1000)*3;
    }
    
    @Override
    public String toString()
    {
        return "Location       : " + this.location       + "\n" +
               "In City?       : " + this.inCity         + "\n" +
               "Estimated Value: " + this.estimatedValue + "\n" +
               "Area           : " + this.area           + "\n" +
               "Value Tax      : " + this.valueTax();
    }
}