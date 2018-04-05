package circle;

public class Circle implements Comparable<Circle>
{
    private int x;
    private int y;
    private double radius;
    
    public Circle(int x, int y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    @Override
    public String toString()
    {
        return "X: " + this.x + " Y: " + this.y + " Radius: " + this.radius;
    }
    
    @Override
    public int compareTo(Circle o)
    {
        if(this.radius > o.radius)
        {
            return 1;
        }
        else if(this.radius == o.radius)
        {
            return 0;
        }
        return -1;
    }
    
    public int getX()
    {
        return this.x;
    }
}