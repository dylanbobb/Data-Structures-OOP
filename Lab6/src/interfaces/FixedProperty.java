package interfaces;

public class FixedProperty
{
    protected String location;
    protected boolean inCity;
    protected double estimatedValue;
    
    public FixedProperty(String location,boolean inCity,double estimatedValue)
    {
        this.location = location;
        this.inCity = inCity;
        this.estimatedValue = estimatedValue;
    }
    
    public FixedProperty(String location)
    {
        this.location = location;
        this.inCity = true;
        this.estimatedValue = 1000000;
    }
    
    public String getLocation()
    {
        return this.location;
    }
}