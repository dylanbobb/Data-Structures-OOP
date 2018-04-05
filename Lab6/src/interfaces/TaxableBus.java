package interfaces;

public class TaxableBus extends Bus implements ITaxable
{
    public TaxableBus(int registrationNumber,double maxVelocity,double value,int numberOfSeats)
    {
        super(registrationNumber,maxVelocity,value,numberOfSeats);
    }
    
    @Override
    public double valueTax()
    {
        return this.value/10+100*numberOfSeats;
    }
    
    @Override
    public String toString()
    {
        return "Registration Number: " + this.registrationNumber + "\n" +
               "Max Velocity       : " + this.maxVelocity        + "\n" +
               "Value              : " + this.value              + "\n" +
               "Number Of Seats    : " + this.numberOfSeats      + "\n" +
               "Value Tax          : " + this.valueTax();
    }
}