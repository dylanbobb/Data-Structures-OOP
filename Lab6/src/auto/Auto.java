package auto;

public abstract class Auto
{
    protected String make;
    protected double price;
    
    public Auto(String make)
    {
        this.make = make;
    }
    
    public void setMake(String make)
    {
        this.make = make;
    }
    
    public abstract void setPrice();
    
    public String getMake()
    {
        return this.make;
    }
    
    public double getPrice()
    {
        return this.price;
    }
    
    @Override
    public String toString()
    {
        return this.make + " " + this.price;
    }
}