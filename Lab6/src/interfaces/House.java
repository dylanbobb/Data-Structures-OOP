package interfaces;

public class House extends FixedProperty
{
    protected double area;
    
    public House(String location,boolean inCity,double estimatedValue,double area)
    {
        super(location,inCity,estimatedValue);
        this.area = area;
    }
    
    public double getArea()
    {
        return this.area;
    }
}