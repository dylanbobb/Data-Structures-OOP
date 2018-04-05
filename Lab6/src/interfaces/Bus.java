package interfaces;

public class Bus extends Vehicle
{
    protected int numberOfSeats;
    
    public Bus(int registrationNumber,double maxVelocity,double value,int numberOfSeats)
    {
        super(registrationNumber,maxVelocity,value);
        this.numberOfSeats = numberOfSeats;
    }
    
    public int getNumberOfSeats()
    {
        return this.numberOfSeats;
    }
}