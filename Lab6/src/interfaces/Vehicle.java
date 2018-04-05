package interfaces;

public class Vehicle
{
    protected int registrationNumber;
    protected double maxVelocity;
    protected double value;
    
    public Vehicle(int registrationNumber,double maxVelocity,double value)
    {
        this.registrationNumber = registrationNumber;
        this.maxVelocity = maxVelocity;
        this.value = value;
    }
    
    public int getRegistrationNumber()
    {
        return this.registrationNumber;
    }
}