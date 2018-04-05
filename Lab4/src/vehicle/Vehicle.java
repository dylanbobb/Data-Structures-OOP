package vehicle;

public class Vehicle
{
    protected int numWheels;
    protected double mpg;
    
    public Vehicle(int numWheels, double mpg)
    {
        this.numWheels = numWheels;
        this.mpg = mpg;
    }
    
    @Override
    public String toString()
    {
        return "Number Of Wheels         : " + this.numWheels + "\n" +
               "Average Miles Per Gallon : " + this.mpg;
    }
}